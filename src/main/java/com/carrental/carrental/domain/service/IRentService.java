package com.carrental.carrental.domain.service;

import com.carrental.carrental.domain.Car;
import com.carrental.carrental.domain.Rent;
import com.carrental.carrental.domain.User;

import java.util.List;

public interface IRentService {

    Rent createRent(List<Car> carList, User user);
    Rent findRent(Rent rent);
    Rent payRent(Rent rent);
    Rent closeRent (Rent rent);
}
