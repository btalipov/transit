package kz.talipov.transit.services.impl;

import kz.talipov.transit.models.entities.Hazard;
import kz.talipov.transit.repositories.HazardRepository;
import kz.talipov.transit.services.HazardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class HazardServiceImpl implements HazardService {

    private final HazardRepository hazardRepository;

    @Override
    public List<Hazard> getAllHazards() {return hazardRepository.findAll();}

    @Override
    public Hazard addHazard(Hazard hazard) {return hazardRepository.save(hazard);}

    @Override
    public Hazard updateHazard(Hazard hazard) {return hazardRepository.save(hazard);}

    @Override
    public void deleteHazardById(Long id) {hazardRepository.deleteById(id);}
    //
//    @Override
//    public void delete(Long id) {
//        hazardRepository.deleteById(id);
//    }
//
//    @Override
//    public Hazard store(String name) {
//        var item = Hazard.builder()
//                .name(name)
//                .build();
//        return hazardRepository.save(item);
//    }
//
//    @Override
//    public Hazard edit(Long id, String name) {
//        var itemOpt = getById(id);
//
//        if (itemOpt.isEmpty()) {
//            throw new RuntimeException("No such element");
//        }
//
//        var item = itemOpt.get();
//        item.setName(name);
//        return hazardRepository.save(item);
//    }
//
//    @Override
//    public List<Hazard> list() {
//        return hazardRepository.findAll();
//    }
//
//    @Override
//    public Optional<Hazard> getById(Long id) {
//        return hazardRepository.findById(id);
//    }
}

