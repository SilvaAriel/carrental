package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.*;
import com.neovisionaries.i18n.CountryCode;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentTest {

    @Test
    public void correctDaysLeft() {
        LocalDate now = LocalDate.now();
        User userOne = new User("someemail@email.com", "John", "Doe", RoleEnum.RENTER, now, "Some Street", "1", "Cool", "City", CountryCode.CO, "123456");
        Car carOne = new Car("ABC1234", BrandEnum.CHEVROLET, "Corsa", LocalDate.now(), TransmissionEnum.A, 100, LocalDate.now(), 4, FuelEnum.PETROL, 100, CarSizeEnum.ECONOMY_CAR);
        List<Car> carList = Arrays.asList(carOne);
        Rent rentOne = new Rent(now, now.plusDays(5), 150, carList, null, userOne, 1000, false, 0);

        assertEquals(rentOne.getTotalDays(), 5);

    }

    @Test
    public void changeToCorrectStatus() {
        LocalDate now = LocalDate.now();
        User userOne = new User("someemail@email.com", "John", "Doe", RoleEnum.RENTER, now, "Some Street", "1", "Cool", "City", CountryCode.CO, "123456");
        Car carOne = new Car("ABC1234", BrandEnum.CHEVROLET, "Corsa", LocalDate.now(), TransmissionEnum.A, 100, LocalDate.now(), 4, FuelEnum.PETROL, 100, CarSizeEnum.ECONOMY_CAR);
        List<Car> carList = Arrays.asList(carOne);
        Rent rentOne = new Rent(now, now.plusDays(5), 150, carList, null, userOne, 1000, false, 0);
        rentOne.payRent();

        assertEquals(rentOne.getStatus(), RentStatusEnum.PAID);
    }

    @Test
    public void rentIsValid() {
        LocalDate now = LocalDate.now();
        User userOne = new User("someemail@email.com", "John", "Doe", RoleEnum.RENTER, now, "Some Street", "1", "Cool", "City", CountryCode.CO, "123456");
        Car carOne = new Car("ABC1234", BrandEnum.CHEVROLET, "Corsa", LocalDate.now(), TransmissionEnum.A, 100, LocalDate.now(), 4, FuelEnum.PETROL, 100, CarSizeEnum.ECONOMY_CAR);
        List<Car> carList = Arrays.asList(carOne);
        Rent rentOne = new Rent(now, now.plusDays(5), 150, carList, null, userOne, 1000, false, 0);
        rentOne.payRent();

        assertEquals(rentOne.isValid(), true);
    }
}
