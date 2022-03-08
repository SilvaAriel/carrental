package com.carrental.carrental.domain;

import com.neovisionaries.i18n.CountryCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.validator.routines.EmailValidator;

import java.awt.image.BufferedImage;
import java.time.LocalDate;

@Getter
@Setter
public class User {

    // Employee
    public User(String email, String password, String identification, String firstName, String lastName, Role role, LocalDate birthday, String addressLineOne, String addressLineTwo, String neighbor, String city, CountryCode country, String zipcode) {
        this.email = email;
        this.password = password;
        this.identification = identification;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.birthday = birthday;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.neighbor = neighbor;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }

    // Renter
    public User(String email, String identification, String firstName, String lastName, Role role, String drivingLicence, LocalDate birthday, String addressLineOne, String addressLineTwo, String neighbor, String city, CountryCode country, String zipcode) {
        this.email = email;
        this.identification = identification;
        this.firstName = firstName;
        this.lastName = lastName;
        this.drivingLicence = drivingLicence;
        this.role = role;
        this.birthday = birthday;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.neighbor = neighbor;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }

    private String email;
    private String password = null;
    private String identification;
    private String firstName;
    private String lastName;
    private String drivingLicence = null;
    private Role role;
    private LocalDate birthday;
    private BufferedImage picture;
    private String addressLineOne;
    private String addressLineTwo;
    private String neighbor;
    private String city;
    private CountryCode country;
    private String zipcode;

    public boolean validateUser() {
        return validateEmail();
    }

    private boolean validateEmail() {
        return EmailValidator.getInstance().isValid(this.email);
    }

}
