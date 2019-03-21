package com.cg.pizzaorder.ui;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exception.PizzaExecption;
import com.cg.pizzaorder.service.IPizzaOrderService;
import com.cg.pizzaorder.service.PizzaOrderService;


public class Client {

	public static void main(String[] args) throws PizzaExecption {
		// TODO Auto-generated method stub
		IPizzaOrderService obj = new PizzaOrderService();
		LocalDateTime dt = LocalDateTime.now();
		int choice = 0;
		System.out.println("Welcome to JustEat Pizza");
		try(Scanner sc = new Scanner(System.in)){
			do{
				System.out.println("1-Place Order");
				System.out.println("2-Display Order");
				System.out.println("3-Exit");
				System.out.println("Enter your choice::");
				choice = sc.nextInt();
				switch(choice){
				case 1:while(true){
					System.out.print("\nEnte the name of the customer : ");
					String name = sc.next();
					if(obj.validateName(name)){
						while(true){
							System.out.print("\nEnter the address(City) : ");
							String address  = sc.next();
							if(obj.validateAddress(address)){
								while(true){
									System.out.print("\nEnter the phone number : ");
									String ph = sc.next();
									if(obj.validatePh(ph)){
										int custID = (int)(Math.random()*10000+100);
										System.out.print("\nEnter the Topping Choice ;\n1->Capcicum(+30 Rs.)\n2->Mushroom(+50 Rs.)\n3->Jalapeno(+70 Rs.)\n4->Paneer(+85 Rs.)\n");
										System.out.print("\nType of Pizza Topping preferred : ");
										int toppCh = sc.nextInt();
										double tp = 350;
										switch(toppCh){
										case 1: tp+=30;
											break;
										case 2: tp+=50;
											break;
										case 3: tp+=70;
											break;
										case 4: tp+=85;
											break;
										}
										int oID = (int)(Math.random()*10000+100);
										PizzaOrder po = new PizzaOrder(oID,custID,tp);
										Customer cs = new Customer(name, address, ph);
										oID = obj.placeOrder(cs, po);
										System.out.println("Order is placed with orderId : "+oID+"\nTotal amount to be paid : "+tp);
										System.out.println(dt);
										break;
									}
									
								}
								break;
							}
						}
						break;	
					}
				}
				break;
				case 2:{
					System.out.print("Enter the orderID : ");
					int oID = sc.nextInt();
					System.out.println(obj.getOrderDetails(oID));
					System.out.println(obj.getCustomerDetails(oID));
					break;
				}
				case 3: System.exit(0);
				
				}
				System.out.println("do you want to continue 1-yes 0-no");
				choice = sc.nextInt();
			}while(choice!=0);
		}
	}

}
