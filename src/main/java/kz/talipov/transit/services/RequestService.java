package kz.talipov.transit.services;

import kz.talipov.transit.models.entities.Request;

import java.util.List;
import java.util.Optional;

public interface RequestService {

    List<Request> getAllRequests();
    void addNewRequest(Request request);
    Request getRequestById(Long id);
    void updateRequest(Request request);
    void deleteRequestById(Long id);
//    void delete(Long id);
//
//    Request store(String goodName);
//
//    Request edit(Long id, String goodName);
//
//    List<Request> list();
//
//    Optional<Request> getById(Long id);
}
