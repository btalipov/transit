package kz.talipov.transit.services.impl;

import kz.talipov.transit.models.entities.Currency;
import kz.talipov.transit.models.entities.Request;
import kz.talipov.transit.repositories.CurrencyRepository;
import kz.talipov.transit.repositories.RequestRepository;
import kz.talipov.transit.services.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

    @Override
    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    @Override
    public void addNewRequest(Request request) {
        requestRepository.save(request);
    }

    @Override
    public Request getRequestById(Long id) {
        return requestRepository.findById(id).orElseThrow();
    }

    @Override
    public void updateRequest(Request request) {
        requestRepository.save(request);
    }

    @Override
    public void deleteRequestById(Long id) {requestRepository.deleteById(id);}

    //    private final RequestRepository requestRepository;
//
//    @Override
//    public void delete(Long id) { requestRepository.deleteById(id);
//    }
//
//    @Override
//    public Request store(String goodName) {
//        var item = Request.builder()
//                .requester(goodName)
//                .build();
//        return requestRepository.save(item);
//    }
//    @Override
//    public Request edit(Long id, String goodName) {
//        var itemOpt = getById(id);
//
//        if (itemOpt.isEmpty()) {
//            throw new RuntimeException("No such element");
//        }
//        var item = itemOpt.get();
//        item.setName(goodName);
//        return requestRepository.save(item);
//    }
//
//    @Override
//    public List<Request> list() {
//        return requestRepository.findAll();
//    }
//
//    @Override
//    public Optional<Request> getById(Long id) {
//        return requestRepository.findById(id);
//    }
}

