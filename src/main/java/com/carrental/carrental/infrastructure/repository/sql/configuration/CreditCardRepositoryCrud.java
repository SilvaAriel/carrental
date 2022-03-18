package com.carrental.carrental.infrastructure.repository.sql.configuration;

import com.carrental.carrental.domain.CreditCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CreditCardRepositoryCrud extends CrudRepository<CreditCard, Integer> {
    Optional<Iterable<CreditCard>> findCreditCardByUser();
}
