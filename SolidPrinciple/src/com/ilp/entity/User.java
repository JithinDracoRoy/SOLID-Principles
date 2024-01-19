package com.ilp.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userEmail;
    private String password;
    private ArrayList<Account> accountList;


    

    public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public User(String userEmail, String password) {
        this.userEmail = userEmail;
        this.password = password;
    }
}
