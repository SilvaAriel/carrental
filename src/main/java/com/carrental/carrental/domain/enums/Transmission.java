package com.carrental.carrental.domain.enums;

import lombok.Getter;

@Getter
public enum Transmission {
    M ("Manual"),
    A ("Automatic");

    private final String transmissionName;

    Transmission(String transmission) {
        this.transmissionName = transmission;
    }
}