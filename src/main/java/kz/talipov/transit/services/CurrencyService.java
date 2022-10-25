package kz.talipov.transit.services;


import kz.talipov.transit.models.entities.Currency;

import java.util.List;
import java.util.Optional;

public interface CurrencyService {

    List<Currency> getAllCurrencies();
    Currency addCurrency(Currency currency);
    Currency updateCurrency(Currency currency);
    void deleteCurrencyById(Long id);

//    void delete(Long id);
//
//    Currency store(String name);
//
//    Currency edit(Long id, String name);
//
//    List<Currency> list();
//
//    Optional<Currency> getById(Long id);

}
