package com.carrental.carrental.domain.service;

import com.carrental.carrental.domain.Car;
import com.carrental.carrental.domain.Rent;
import com.carrental.carrental.domain.User;
import com.carrental.carrental.domain.enums.*;
import com.neovisionaries.i18n.CountryCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RentServiceTest {

    private IRentService rentService;
    private User userOne;
    private Car carOne;
    private List<Car> carList;

    @BeforeEach
    void init() {
        this.rentService = new RentService();
        this.carOne = new Car("ABC1234", BrandEnum.CHEVROLET, "Corsa", LocalDate.now(), 0, TransmissionEnum.A, 100, ColorEnum.BLACK,LocalDate.now(), 4, FuelEnum.PETROL, 100, CarSizeEnum.ECONOMY_CAR);
        this.userOne = new User("someemail@email.com", "123", "John", "Doe", RoleEnum.RENTER, "ABC",now, "Some Street", "1", "Cool", "City", CountryCode.CO, "123456");
        this.carList = Arrays.asList(this.carOne);
    }

    @Test
    public whenCallCreateRent_returnValidRent() {
        Rent rent = rentService.createRent(carList, userOne);
        assertTrue(rent.isValid());
    }
}
