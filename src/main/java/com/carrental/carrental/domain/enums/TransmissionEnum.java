package com.carrental.carrental.domain.enums;

import lombok.Getter;

@Getter
public enum TransmissionEnum {
    M ("Manual"),
    A ("Automatic");

    private final String transmissionName;

    TransmissionEnum(String transmission) {
        this.transmissionName = transmission;
    }
}