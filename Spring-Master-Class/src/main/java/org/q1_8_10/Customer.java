package org.q1_8_10;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Customer implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{
		
	private String customerName;
	private String customerID;
	private String customerContact;
	private Address address;


	private ApplicationContext context=null;
	
	public Customer() {}
	public Customer(String customerName, String customerID, String customerContact, Address address) {
		super();
		this.customerName = customerName;
		this.customerID = customerID;
		this.customerContact = customerContact;
		this.address=address;
	}

//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	
	public void draw() {
		System.out.println();
		System.out.println("Name:"+this.customerName+"     id:"+this.customerID+"     Contact:"+this.customerContact);
		System.out.println("Street:"+ address.getStreet()+"     City:"+address.getCity()+"     State:"+address.getState()
		+"     Zipcode:"+address.getZip()+"     Country:"+address.getCountry());
		System.out.println();
	}	
	
	
	public String testAddress() {
		return "Name:"+this.customerName+" id:"+this.customerID+" Contact:"+this.customerContact+" Street:"+ address.getStreet()+" City:"+address.getCity()+" State:"+address.getState()
		+" Zipcode:"+address.getZip()+" Country:"+address.getCountry();
		
	}

	
//   Question 10
//	class implements ApplicationContextAware
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
	}
	
//	class implements BeanNameAware
	public void setBeanName(String beanname) {
		System.out.println("Bean name :"+beanname);
	}

	
//	Question  8
//	class implements InitializingBean
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean called customer");
	}
	
//	Question  8
// class implements DisposableBean
	public void destroy() throws Exception {
		System.out.println("Destroying bean called customer");
	}
	
//	Question  8
	public void init() {
		System.out.println("My init method called before creating beans");
	}
	
//	Question  8
	public void cleanup() {
		System.out.println("My cleanup method called after destroying beans");
	}
	

//	Question  8
    @PostConstruct
    public void showConstruct() {
    	System.out.println("This method is in postConstruct");
    }
    
//	Question  8
    @PreDestroy
    public void showDestruct() {
    	System.out.println("This method is in postConstruct");
    }
    

}

