package com.cg.pizzaorder.staticdatabase;

import java.util.HashMap;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;

public class DataBase {
	static HashMap<Integer,PizzaOrder> map = new HashMap<Integer, PizzaOrder>();
	static HashMap<Integer, Customer> map1 = new HashMap<Integer,Customer>();
	
	
	public static HashMap<Integer, PizzaOrder> getOrderlist(){
		return map;
	}
	public static HashMap<Integer,Customer> getCustomerDetails(){
		return map1;
	}
}
