package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.Car;

import java.util.List;
import java.util.Optional;

public interface CarRepository {
    List<Car> findAllCars();
    Optional<Car> findCarById(int id);
    Car saveCar(Car car);
    Car editCar(Car car);
    boolean deleteCar(int id);
}
