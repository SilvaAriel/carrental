package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.*;
import com.neovisionaries.i18n.CountryCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentTest {

    private LocalDate now;
    private User userOne;
    private Car carOne;
    private List<Car> carList;
    private Rent rentOne;

    @BeforeEach
    public void setUp() {
        this.now = LocalDate.now();
        this.userOne = new User("someemail@email.com", "123", "John", "Doe", RoleEnum.RENTER, "ABC",now, "Some Street", "1", "Cool", "City", CountryCode.CO, "123456");
        this.carOne = new Car("ABC1234", BrandEnum.CHEVROLET, "Corsa", LocalDate.now(), 0, TransmissionEnum.A, 100, ColorEnum.BLACK,LocalDate.now(), 4, FuelEnum.PETROL, 100, CarSizeEnum.ECONOMY_CAR);
        this.carList = Arrays.asList(this.carOne);
        this.rentOne = new Rent(now, now.plusDays(5), 150, carList, null, userOne, 1000, false, 0);
    }

    @Test
    public void correctDaysLeft() {
        assertEquals(this.rentOne.getTotalDays(), 5);
    }

    @Test
    public void changeToCorrectStatus() {
        this.rentOne.payRent();
        assertEquals(rentOne.getStatus(), RentStatusEnum.PAID);
    }

    @Test
    public void rentIsValid() {
        this.rentOne.payRent();
        assertEquals(this.rentOne.isValid(), true);
    }
}
