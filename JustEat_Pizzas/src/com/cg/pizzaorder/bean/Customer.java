package com.cg.pizzaorder.bean;

public class Customer {
	private String custName;
	private String address;
	private String phone;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String custName, String address, String phone) {
		super();
		this.custName = custName;
		this.address = address;
		this.phone = phone;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	
	
}
