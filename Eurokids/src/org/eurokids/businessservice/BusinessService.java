package org.eurokids.businessservice;

import org.eurokids.doa.DataAccess;
import org.eurokids.model.Admin;

public class BusinessService {
	
	DataAccess doa=new DataAccess();
	Admin ad=new Admin();
	public boolean auntheticate(String username, String password){
		ad =doa.getAdminForLogin(username, password);
		if (ad.getUsername().equals(username)&&ad.getPassword().equals(password)){
			return true;
		}
		else{
			return false;
		}
	}
	
}
