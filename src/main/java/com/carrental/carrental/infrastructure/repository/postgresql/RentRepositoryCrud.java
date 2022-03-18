package com.carrental.carrental.infrastructure.repository.postgresql;

import com.carrental.carrental.domain.Rent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepositoryCrud  extends CrudRepository<Rent, Integer> {
}
