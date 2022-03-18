package com.carrental.carrental.infrastructure.repository.postgresql;

import com.carrental.carrental.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepositoryCrud extends CrudRepository<Car, Integer> {
}
