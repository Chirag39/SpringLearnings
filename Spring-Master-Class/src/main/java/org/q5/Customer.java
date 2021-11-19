package org.q5;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Customer {

	private String customerName;
	private int customerId,customerContact;

	
	@Resource	
	@Inject
	private Address customerAddress;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	
	
//	@Required
	public void setCustomerAdress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void getDetails()
	{
		System.out.println(getCustomerName());
		System.out.println(getCustomerId());
		System.out.println(getCustomerContact());
		System.out.println(getCustomerAddress().getCity());
		System.out.println(getCustomerAddress().getStreet());
		System.out.println(getCustomerAddress().getState());
		System.out.println(getCustomerAddress().getZip());
		System.out.println(getCustomerAddress().getCountry());
	}
	
}