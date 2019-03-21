package com.cg.pizzaorder.dao;
import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exception.PizzaExecption;


public interface IPizzaOrderDAO {
	public int placeOrder(Customer customer, PizzaOrder pizza) throws PizzaExecption;
	public PizzaOrder getOrderDetails(int orderid) throws PizzaExecption;
	public Customer getCustomerDetails(int orderid) throws PizzaExecption;
}
