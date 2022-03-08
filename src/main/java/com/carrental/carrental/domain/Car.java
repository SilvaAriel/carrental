package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.time.LocalDate;

public class Car {

    public Car(String licensePlate, Brand brand, String model, LocalDate registrationDate, int mileage, TransmissionEnum transmission, float weight, Color color,LocalDate manufactureYear, int seats, FuelEnum fuelType, int fee, CarSize size) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.registrationDate = registrationDate;
        this.mileage = mileage;
        this.transmission = transmission;
        this.weight = weight;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.seats = seats;
        this.fuelType = fuelType;
        this.fee = fee;
        this.size = size;
    }

    @Getter
    private String licensePlate;
    @Getter
    private Brand brand;
    @Getter
    private String model;
    @Getter
    private LocalDate registrationDate;
    @Getter
    private int mileage;
    @Getter
    private TransmissionEnum transmission;
    @Getter
    private float weight;
    @Getter
    private Color color;
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
    private CarSize size;
}

