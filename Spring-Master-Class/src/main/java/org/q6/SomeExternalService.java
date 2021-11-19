package org.q6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
	
	@Value("${dburl}")
	private String url;
	
	@Value("${driverClassName}")
	private String driver;
	
	@Value("${username}")
	private String user;
	
	@Value("${password}")
	private String pass;
	
	public String returnServiceURL(){
		return "db_url: "+ url+"\ndriver: "+driver+"\nuser: "+user+"\npass: "+pass;
	}

}