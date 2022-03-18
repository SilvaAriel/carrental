package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.Rent;

import java.util.Optional;

public interface RentRepository {
    Optional<Rent> findRentById(int id);
    Iterable<Rent> findAllRents();
    Rent createRent(Rent rent);
    Rent editRent(Rent rent);
}
