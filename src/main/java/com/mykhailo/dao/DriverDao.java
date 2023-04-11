package com.mykhailo.dao;

import java.util.Optional;
import com.mykhailo.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByUsername(String username);
}
