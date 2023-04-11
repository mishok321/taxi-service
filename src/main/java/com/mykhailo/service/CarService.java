package com.mykhailo.service;

import java.util.List;
import com.mykhailo.model.Car;
import com.mykhailo.model.Driver;

public interface CarService extends GenericService<Car> {
    void addDriverToCar(Driver driver, Car car);

    void removeDriverFromCar(Driver driver, Car car);

    List<Car> getAllByDriver(Long driverId);
}
