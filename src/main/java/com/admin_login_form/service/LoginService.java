package com.admin_login_form.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	//Credentials for admin login-------->
	public static String password= "admin";
	public static String email= "admin@gmail.com";
	 public boolean validateAdmin(String email,String password) {
		 
		 return email.equals("admin@gmail.com")&&(password.equals(LoginService.password));
		 
	 }

}
