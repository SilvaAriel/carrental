package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.util.Date;

@Getter
@Setter
public class Car {

    private String licensePlate;
    private Brand brand;
    private String model;
    private Date registrationDate;
    private Transmission transmission;
    private float weight;
    private Date manufactureYear;
    private int seats;
    private Fuel fuelType;
    private Fee fee;
    private BufferedImage photos;
    private CarSize size;
}

