package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.RoleEnum;
import com.neovisionaries.i18n.CountryCode;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void isValidUser() {
        User userOne = new User("someemail@email.com", "123", "John", "Doe", RoleEnum.RENTER, "ABC", LocalDate.of(200,01,01), "Some Street", "1", "Cool", "City", CountryCode.CO, "123456");
        assertEquals(userOne.validateUser(), true);
    }
}
