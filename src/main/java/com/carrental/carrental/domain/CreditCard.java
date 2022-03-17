package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.CreditCardTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
public class CreditCard {

    @NonNull private String number;
    @NonNull private User cardHolder;
    @NonNull private LocalDate expirationDate;
    @NonNull private CreditCardTypeEnum cardType;

}
