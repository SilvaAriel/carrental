package com.carrental.carrental.infrastructure.repository.sql;

import com.carrental.carrental.domain.CreditCard;
import com.carrental.carrental.domain.User;
import com.carrental.carrental.domain.repository.CreditCarRepository;
import com.carrental.carrental.infrastructure.repository.sql.configuration.CreditCardRepositoryCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SQLCreditCardRepository implements CreditCarRepository {

    private final CreditCardRepositoryCrud creditCardRepository;

    @Autowired
    public SQLCreditCardRepository(final CreditCardRepositoryCrud creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public Optional<CreditCard> findCreditCardById(int id) {
        return creditCardRepository.findById(id);
    }

    @Override
    public Optional<Iterable<CreditCard>> findCreditCardByUser(User user) {
        return creditCardRepository.findCreditCardByUser();
    }

    @Override
    public CreditCard createCreditCard(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    @Override
    public void deleteCreditCard(int id) {
        creditCardRepository.deleteById(id);
    }
}
