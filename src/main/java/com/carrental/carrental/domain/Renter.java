package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.RoleEnum;
import com.neovisionaries.i18n.CountryCode;
import lombok.Data;

import java.awt.image.BufferedImage;
import java.util.Date;

@Data
public class Renter {

    private String firstName;
    private String lastName;
    private String email;
    private RoleEnum role;
    private Date birthday;
    private BufferedImage picture;
    private String addressLineOne;
    private String addressLineTwo;
    private String neighbor;
    private String city;
    private CountryCode country;
    private String zipcode;

}
