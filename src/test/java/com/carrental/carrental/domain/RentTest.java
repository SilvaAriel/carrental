package com.carrental.carrental.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

public class RentTest {

    @Test
    public void correctDaysLeft() {
        Car carOne = new Car()
        LocalDate now = LocalDate.now();
        Rent rentone = new Rent(now, now.plusDays(5),100,)

    }
}
