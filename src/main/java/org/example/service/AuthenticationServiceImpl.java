package org.example.service;

import java.util.Optional;
import org.example.exception.AuthenticationException;
import org.example.lib.Inject;
import org.example.lib.Service;
import org.example.model.Driver;

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
