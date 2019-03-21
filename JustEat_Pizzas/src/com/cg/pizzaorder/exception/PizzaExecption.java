package com.cg.pizzaorder.exception;

public class PizzaExecption extends Exception {
	String message;

	public PizzaExecption(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
