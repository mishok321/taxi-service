package com.mykhailo.service;

import java.util.Optional;
import com.mykhailo.exception.AuthenticationException;
import com.mykhailo.lib.Inject;
import com.mykhailo.lib.Service;
import com.mykhailo.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String username, String password)
            throws AuthenticationException {
        Optional<Driver> driver = driverService.findByUsername(username);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Username or password was incorrect");
    }
}
