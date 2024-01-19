package com.ilp.service;

import com.ilp.entity.User;
import com.ilp.interfaces.Authenticator;

public class AuthenticationServiceImpl implements Authenticator
{
	 public boolean authenticate(User user) {
	        // Your authentication logic here
	        // For simplicity, let's assume it always returns true
	        System.out.println("Authenticating email and password");
	        return true;
	    }
}

