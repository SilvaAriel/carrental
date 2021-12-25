package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.RoleEnum;
import com.neovisionaries.i18n.CountryCode;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.time.LocalDate;

@Getter
@Setter
public class User {

    public User(String email, String password, String firstName, String lastName, RoleEnum role, LocalDate birthday, String addressLineOne, String addressLineTwo, String neighbor, String city, CountryCode country, String zipcode) {
        this.email = email;
        this.password = password;
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

    public User(String email, String firstName, String lastName, RoleEnum role, LocalDate birthday, String addressLineOne, String addressLineTwo, String neighbor, String city, CountryCode country, String zipcode) {
        this.email = email;
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

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private RoleEnum role;
    private LocalDate birthday;
    private BufferedImage picture;
    private String addressLineOne;
    private String addressLineTwo;
    private String neighbor;
    private String city;
    private CountryCode country;
    private String zipcode;

}
