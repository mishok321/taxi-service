package com.mykhailo.service;

import java.util.Optional;
import com.mykhailo.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByUsername(String username);
}
