package com.cg.pizzaorder.dao;

import java.sql.DatabaseMetaData;

//import java.util.HashMap;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exception.PizzaExecption;
import com.cg.pizzaorder.staticdatabase.DataBase;

public class PizzaOrderDAO implements IPizzaOrderDAO {

	@Override
	public int placeOrder(Customer customer, PizzaOrder pizza)
			throws PizzaExecption {
		// TODO Auto-generated method stub
		DataBase.getOrderlist().put(pizza.getOrderId(), pizza);
		DataBase.getCustomerDetails().put(pizza.getOrderId(), customer);
		return pizza.getOrderId();
	}

	@Override
	public PizzaOrder getOrderDetails(int orderid) throws PizzaExecption {
		// TODO Auto-generated method stub
		return DataBase.getOrderlist().get(orderid);
	}
	@Override
	public Customer getCustomerDetails(int custid) throws PizzaExecption {
		// TODO Auto-generated method stub
		return DataBase.getCustomerDetails().get(custid);
	}

}
