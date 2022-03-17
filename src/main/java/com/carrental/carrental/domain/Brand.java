package com.carrental.carrental.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Brand {

    @Getter @Setter @NonNull
    private String name;

}
