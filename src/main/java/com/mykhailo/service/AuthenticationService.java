package com.mykhailo.service;

import com.mykhailo.exception.AuthenticationException;
import com.mykhailo.model.Driver;

public interface AuthenticationService {
    Driver login(String username, String password) throws AuthenticationException;
}
