package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.util.Date;

public class Car {

    public Car(String licensePlate, BrandEnum brand, String model, LocalDate registrationDate, TransmissionEnum transmission, float weight, LocalDate manufactureYear, int seats, FuelEnum fuelType, int fee, CarSizeEnum size) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.registrationDate = registrationDate;
        this.transmission = transmission;
        this.weight = weight;
        this.manufactureYear = manufactureYear;
        this.seats = seats;
        this.fuelType = fuelType;
        this.fee = fee;
        this.size = size;
    }

    @Getter
    private String licensePlate;
    @Getter
    private BrandEnum brand;
    @Getter
    private String model;
    @Getter
    private LocalDate registrationDate;
    @Getter
    private TransmissionEnum transmission;
    @Getter
    private float weight;
    @Getter
    private LocalDate manufactureYear;
    @Getter
    private int seats;
    @Getter @Setter
    private FuelEnum fuelType;
    @Getter @Setter
    private int fee;
    @Getter @Setter
    private BufferedImage photos;
    @Getter
    private CarSizeEnum size;
}

