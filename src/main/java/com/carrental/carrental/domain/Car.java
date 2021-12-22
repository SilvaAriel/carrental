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
    private BrandEnum brand;
    @Getter
    private String model;
    @Getter
    private Date registrationDate;
    @Getter
    private TransmissionEnum transmission;
    @Getter
    private float weight;
    @Getter
    private Date manufactureYear;
    @Getter
    private int seats;
    @Getter @Setter
    private FuelEnum fuelType;
    @Getter @Setter
    private FeeEnum fee;
    @Getter @Setter
    private BufferedImage photos;
    @Getter
    private CarSizeEnum size;
}

