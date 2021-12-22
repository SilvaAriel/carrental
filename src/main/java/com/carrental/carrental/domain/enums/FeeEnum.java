package com.carrental.carrental.domain.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeeEnum {
    private int value;

    public FeeEnum(int value) {
        this.value = value;
    }
}