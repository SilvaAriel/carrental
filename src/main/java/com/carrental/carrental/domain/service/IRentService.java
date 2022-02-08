package com.carrental.carrental.domain.service;

import com.carrental.carrental.domain.Car;
import com.carrental.carrental.domain.CreditCard;
import com.carrental.carrental.domain.Rent;
import com.carrental.carrental.domain.User;

import java.util.List;
import java.util.Optional;

public interface IRentService {

    Rent createRent(Rent rent);
    Optional<Rent> findRent(int userId);
    Rent payRent(CreditCard card, int userId);
    boolean closeRent (Rent rent);
}
