package com.ilp.interfaces;

import com.ilp.entity.User;

public interface Authenticator 
{
	boolean authenticate(User user);
}
