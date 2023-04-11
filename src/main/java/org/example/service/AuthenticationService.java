package org.example.service;

import org.example.exception.AuthenticationException;
import org.example.model.Driver;

public interface AuthenticationService {
    Driver login(String username, String password) throws AuthenticationException;
}
