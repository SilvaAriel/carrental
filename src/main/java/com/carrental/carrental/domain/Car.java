package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.CarSizeEnum;
import com.carrental.carrental.domain.enums.FuelEnum;
import com.carrental.carrental.domain.enums.TransmissionEnum;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.time.LocalDate;

@RequiredArgsConstructor
public class Car {

    @Getter @NonNull
    private String licensePlate;
    @Getter @NonNull
    private Brand brand;
    @Getter @NonNull
    private String model;
    @Getter @NonNull
    private LocalDate registrationDate;
    @Getter @Setter @NonNull
    private int mileage;
    @Getter @NonNull
    private TransmissionEnum transmission;
    @Getter
    private float weight;
    @Getter @Setter @NonNull
    private Color color;
    @Getter @NonNull
    private LocalDate manufactureYear;
    @Getter @NonNull
    private int seats;
    @Getter @Setter @NonNull
    private FuelEnum fuelType;
    @Getter @Setter @NonNull
    private int fee;
    @Getter @Setter
    private BufferedImage photos;
    @Getter @NonNull
    private CarSizeEnum size;
}

