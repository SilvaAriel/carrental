package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.Car;

import java.util.Optional;

public interface CarRepository {
    Iterable<Car> findAllCars();
    Optional<Car> findCarById(int id);
    Car saveCar(Car car);
    void deleteCar(int id);
}
