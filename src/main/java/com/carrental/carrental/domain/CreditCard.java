package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.CreditCardTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class CreditCard {

    private String number;
    private User cardHolder;
    private LocalDate expirationDate;
    private CreditCardTypeEnum cardType;

}
