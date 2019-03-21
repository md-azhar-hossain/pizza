package com.cg.pizzaorder.service;

import java.util.regex.Pattern;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.dao.IPizzaOrderDAO;
import com.cg.pizzaorder.dao.PizzaOrderDAO;
import com.cg.pizzaorder.exception.PizzaExecption;

public class PizzaOrderService implements IPizzaOrderService {
	IPizzaOrderDAO dao = new PizzaOrderDAO(); 
	@Override
	public int placeOrder(Customer customer, PizzaOrder pizza)
			throws PizzaExecption {
		// TODO Auto-generated method stub
		return dao.placeOrder(customer, pizza);
	}

	@Override
	public PizzaOrder getOrderDetails(int orderid) throws PizzaExecption {
		// TODO Auto-generated method stub
		return dao.getOrderDetails(orderid);
	}
	
	
	public boolean validateName(String name){
		String pattern = "[A-Z]{1}[a-z]{2,}";
		return Pattern.matches(pattern, name);
	}
	
	public boolean validateAddress(String addr){
		String pattern = "[A-Z]{1}[a-z]{2,}";
		return Pattern.matches(pattern, addr);
	}
	public boolean validatePh(String ph){
		String pattern = "[1-9]{1}[0-9]{2,}";
		if(Pattern.matches(pattern, ph)&& ph.length()==10)
			return true;
		else
			return false;
	}

	@Override
	public Customer getCustomerDetails(int orderid) throws PizzaExecption {
		// TODO Auto-generated method stub
		return dao.getCustomerDetails(orderid);
	}

}
