package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.CreditCard;
import com.carrental.carrental.domain.User;

import java.util.Optional;

public interface CreditCarRepository {
    Optional<CreditCard> findCreditCardById(int id);
    Optional<Iterable<CreditCard>> findCreditCardByUser(User user);
    CreditCard createCreditCard(CreditCard creditCard);
    boolean deleteCreditCard(int id);
}
