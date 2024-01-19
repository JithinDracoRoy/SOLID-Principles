package com.ilp.service;

import com.ilp.entity.Account;
import com.ilp.interfaces.AccountType;

public class PremiumAccountService extends Account implements AccountType
{
	public void createAccount()
	{
		System.out.println("Premium account created");
	}
}
