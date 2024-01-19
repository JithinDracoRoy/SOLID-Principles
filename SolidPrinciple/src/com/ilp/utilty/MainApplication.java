package com.ilp.utilty;
import java.util.Scanner;

import com.ilp.entity.User;
import com.ilp.interfaces.AccountType;
import  com.ilp.interfaces.Authenticator;
import com.ilp.service.AuthenticationServiceImpl;
import com.ilp.service.LoginService;
import com.ilp.service.PlatinumAccountService;
import com.ilp.service.SignUpValidator;


public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dependency Injection: Create an instance of the concrete Authenticator implementation
        Authenticator authenticator = new AuthenticationServiceImpl();

        // Dependency Injection: Create an instance of the concrete SignUpValidator implementation
        SignUpValidator signUpValidator = new SignUpValidator();

        // Usage of Validate methods
        signUpValidator.validateUserEmail();
        scanner.nextLine();

        signUpValidator.validatePassWord();
        scanner.nextLine();

        signUpValidator.validateConfirmSignUpEmail();
        scanner.nextLine();

        // Usage of Authenticator
        User user = new User("user@example.com", "password");
        LoginService loginService = new LoginService(authenticator);
        boolean isAuthenticated = loginService.authenticate(user);
        System.out.println("Is authenticated: " + isAuthenticated);
        scanner.nextLine();
        
        AccountType platinumAccountService=new PlatinumAccountService();
        platinumAccountService.createAccount();
        
    }
}

