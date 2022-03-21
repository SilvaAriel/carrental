package com.carrental.carrental.infrastructure.repository.sql;

import com.carrental.carrental.domain.Rent;
import com.carrental.carrental.domain.repository.RentRepository;
import com.carrental.carrental.infrastructure.repository.sql.configuration.RentRepositoryCrud;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SQLRentRepository implements RentRepository {

    private final RentRepositoryCrud rentRepository;

    public SQLRentRepository(final RentRepositoryCrud rentRepository) {
        this.rentRepository = rentRepository;
    }

    @Override
    public Optional<Rent> findRentById(int id) {
        return rentRepository.findById(id);
    }

    @Override
    public Iterable<Rent> findAllRents() {
        return rentRepository.findAll();
    }

    @Override
    public Rent createRent(Rent rent) {
        return rentRepository.save(rent);
    }

}
