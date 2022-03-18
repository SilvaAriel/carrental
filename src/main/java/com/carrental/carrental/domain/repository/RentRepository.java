package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.Rent;

import java.util.List;
import java.util.Optional;

public interface RentRepository {
    Optional<Rent> findRentById(int id);
    List<Rent> findAllRents();
    Rent createRent(Rent rent);
    Rent editRent(Rent rent);
}
