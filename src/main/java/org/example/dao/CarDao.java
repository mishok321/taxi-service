package org.example.dao;

import java.util.List;
import org.example.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
