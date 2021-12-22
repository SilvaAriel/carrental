package com.carrental.carrental.domain.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fee {
    private int value;

    public Fee(int value) {
        this.value = value;
    }
}