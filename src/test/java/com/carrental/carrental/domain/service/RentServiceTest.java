package com.carrental.carrental.domain.service;

import com.carrental.carrental.domain.Car;
import com.carrental.carrental.domain.Rent;
import com.carrental.carrental.domain.User;
import com.carrental.carrental.domain.enums.*;
import com.neovisionaries.i18n.CountryCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RentServiceTest {

    private IRentService rentService;
    private User userOne;
    private Car carOne;
    private Rent rentOne;
    private List<Car> carList;
    private long now;

    @BeforeEach
    void init() {
        this.now = System.currentTimeMillis();
        long later = Instant.ofEpochMilli(this.now).plus(5, ChronoUnit.DAYS).toEpochMilli();
        this.rentService = new RentService();
        this.carOne = new Car("ABC1234", BrandEnum.CHEVROLET, "Corsa", LocalDate.now(), 0, TransmissionEnum.A, 100, ColorEnum.BLACK,LocalDate.now(), 4, FuelEnum.PETROL, 100, CarSizeEnum.ECONOMY_CAR);
        this.userOne = new User("someemail@email.com", "123", "John", "Doe", RoleEnum.RENTER, "ABC",LocalDate.now(), "Some Street", "1", "Cool", "City", CountryCode.CO, "123456");
        this.carList = Arrays.asList(this.carOne);
        this.rentOne = new Rent(this.now, later, 150, carList, userOne, false, 0);
    }

    @Test
    public void whenCallCreateRent_returnValidRent() {
        Rent rent = rentService.createRent(this.rentOne);
        assertTrue(rent.isValid());
    }

    @Test
    public void whenCallFindRent_returnRent() {
        Optional<Rent> rent = rentService.findRent(1);
        assertNotNull(rent);
    }
}
