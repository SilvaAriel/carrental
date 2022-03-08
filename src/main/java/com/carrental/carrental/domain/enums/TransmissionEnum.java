package com.carrental.carrental.domain.enums;

import lombok.Getter;

public enum TransmissionEnum {
    M ("Manual"),
    A ("Automatic");

    @Getter
    private final String transmissionName;

    TransmissionEnum(String transmission) {
        this.transmissionName = transmission;
    }
}