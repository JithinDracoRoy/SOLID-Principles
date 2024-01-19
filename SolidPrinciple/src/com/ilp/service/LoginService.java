package com.ilp.service;

import com.ilp.entity.User;
import com.ilp.interfaces.Authenticator;

public class LoginService {
    private final Authenticator authenticator;

    public LoginService(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public boolean authenticate(User user) {
        return authenticator.authenticate(user);
    }
}
