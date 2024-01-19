package com.ilp.service;

import com.ilp.entity.Account;
import com.ilp.interfaces.AccountType;

public class SilverAccountService extends Account implements AccountType
{
	public void createAccount()
	{
		System.out.println("Silver account created");
	}
}
