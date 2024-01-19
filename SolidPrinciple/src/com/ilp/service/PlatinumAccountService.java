package com.ilp.service;

import com.ilp.entity.Account;
import com.ilp.interfaces.AccountType;

public class PlatinumAccountService extends Account implements AccountType
{


@Override
public void createAccount() {
	System.out.println("Platinum Account Created");
}
}
