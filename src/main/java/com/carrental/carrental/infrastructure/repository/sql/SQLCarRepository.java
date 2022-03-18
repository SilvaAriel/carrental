package com.carrental.carrental.infrastructure.repository.sql;

import com.carrental.carrental.domain.Car;
import com.carrental.carrental.domain.repository.CarRepository;
import com.carrental.carrental.infrastructure.repository.sql.configuration.CarRepositoryCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SQLCarRepository implements CarRepository {

    private final CarRepositoryCrud carRepository;

    @Autowired
    public SQLCarRepository(final CarRepositoryCrud carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Iterable<Car> findAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Optional<Car> findCarById(int id) {
        return carRepository.findById(id);
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }
}
