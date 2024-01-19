package com.ilp.service;

import com.ilp.interfaces.ValidateUserEmail;
import com.ilp.interfaces.ValidateConfirmSignUpEmail;
import com.ilp.interfaces.ValidatePassword;

public class SignUpValidator implements ValidateUserEmail,ValidatePassword, ValidateConfirmSignUpEmail 
{
	public void validateUserEmail() {
        System.out.println("SignUpEmail Validation");
    }

    public void validatePassWord() {
        System.out.println("SignUpPassword Validation");
    }

    public void validateConfirmSignUpEmail() {
        System.out.println("Confirm SignUpEmail Validation");
    }
}

