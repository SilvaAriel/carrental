package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.util.Date;

@AllArgsConstructor
public class Car {

    @Getter
    private String licensePlate;
    @Getter
    private Brand brand;
    @Getter
    private String model;
    @Getter
    private Date registrationDate;
    @Getter
    private Transmission transmission;
    @Getter
    private float weight;
    @Getter
    private Date manufactureYear;
    @Getter
    private int seats;
    @Getter @Setter
    private Fuel fuelType;
    @Getter @Setter
    private Fee fee;
    @Getter @Setter
    private BufferedImage photos;
    @Getter
    private CarSize size;
}

