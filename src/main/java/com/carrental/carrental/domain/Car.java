package com.carrental.carrental.domain;

import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.util.Date;

@Getter
@Setter
public class Car {
    private String licensePlate;
    private Brand brand;
    private BufferedImage photos;
    private Fee fee;
    private Fuel fuelType;
    private String model;
    private Date registration_dat;
    private int seats;
    private size;
    private transmission;
    private float weight;
    private Date manufactureYear;

}

