package kz.talipov.transit.services.impl;

import kz.talipov.transit.models.entities.Currency;
import kz.talipov.transit.repositories.CurrencyRepository;
import kz.talipov.transit.services.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {
    private final CurrencyRepository currencyRepository;

    @Override
    public List<Currency> getAllCurrencies() {return currencyRepository.findAll();}

    @Override
    public Currency addCurrency(Currency currency) {return currencyRepository.save(currency);}

    @Override
    public Currency updateCurrency(Currency currency) {return currencyRepository.save(currency);}

    @Override
    public void deleteCurrencyById(Long id) {currencyRepository.deleteById(id);}
}
//    @Override
//    public void delete(Long id) {
//        currencyRepository.deleteById(id);
//    }
//
//    @Override
//    public Currency store(String name) {
//        var item = Currency.builder()
//                .name(name)
//                .build();
//        return currencyRepository.save(item);
//    }
//
//    @Override
//    public Currency edit(Long id, String name) {
//        var itemOpt = getById(id);
//
//        if (itemOpt.isEmpty()) {
//            throw new RuntimeException("No such element");
//        }
//
//        var item = itemOpt.get();
//        item.setName(name);
//        return currencyRepository.save(item);
//    }
//
//    @Override
//    public List<Currency> list() {
//        return currencyRepository.findAll();
//    }
//
//    @Override
//    public Optional<Currency> getById(Long id) {
//        return currencyRepository.findById(id);
//    }
//}
