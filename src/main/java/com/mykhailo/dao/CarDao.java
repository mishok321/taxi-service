package com.mykhailo.dao;

import java.util.List;
import com.mykhailo.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
