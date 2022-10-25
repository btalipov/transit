package kz.talipov.transit.services;


import kz.talipov.transit.models.entities.Hazard;

import java.util.List;

public interface HazardService {

    List<Hazard> getAllHazards();

    Hazard addHazard(Hazard hazard);

    Hazard updateHazard(Hazard hazard);

    void deleteHazardById(Long id);
}

//    void delete(Long id);
//
//    Hazard store(String name);
//
//    Hazard edit(Long id, String name);
//
//    List<Hazard> list();
//
//    Optional<Hazard> getById(Long id);


