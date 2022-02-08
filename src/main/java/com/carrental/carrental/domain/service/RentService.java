package com.carrental.carrental.domain.service;

import com.carrental.carrental.domain.Rent;
import com.carrental.carrental.domain.enums.RentStatusEnum;

import java.util.Optional;

public class RentService implements IRentService{
    @Override
    public Rent createRent(Rent rent) {
        rent.setStatus(RentStatusEnum.SAVED);
        return rent;
    }

    @Override
    public Optional<Rent> findRent(int id) {
        return Optional.of(new Rent(0, 0, 150, null, null, false, 0));
    }

    @Override
    public Rent payRent(Rent rent) {
        return null;
    }

    @Override
    public boolean closeRent(Rent rent) {
        return true;
    }
}
