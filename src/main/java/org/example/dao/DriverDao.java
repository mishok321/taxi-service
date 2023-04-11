package org.example.dao;

import java.util.Optional;
import org.example.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByUsername(String username);
}
