package com.carrental.carrental.domain.service;

import com.carrental.carrental.domain.Rent;

public class RentService implements IRentService{
    @Override
    public Rent createRent(Rent rent) {
        return rent;
    }

    @Override
    public Rent findRent(Rent rent) {
        return null;
    }

    @Override
    public Rent payRent(Rent rent) {
        return null;
    }

    @Override
    public Rent closeRent(Rent rent) {
        return null;
    }
}
