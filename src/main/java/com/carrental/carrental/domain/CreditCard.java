package com.carrental.carrental.domain;

import com.carrental.carrental.domain.enums.CreditCardTypeEnum;

import java.time.LocalDate;

public class CreditCard {

    private String number;
    private User cardHolder;
    private LocalDate expirationDate;
    private CreditCardTypeEnum cardType;

    public CreditCard(String number, User cardHolder, LocalDate expirationDate, CreditCardTypeEnum cardType) {
        this.number = number;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

    public String getNumber() {
        return number;
    }

    public User getCardHolder() {
        return cardHolder;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public CreditCardTypeEnum getCardType() {
        return cardType;
    }

}
