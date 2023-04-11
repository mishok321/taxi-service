package org.example.service;

import java.util.Optional;
import org.example.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByUsername(String username);
}
