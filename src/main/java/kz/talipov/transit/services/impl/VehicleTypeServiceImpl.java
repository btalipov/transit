package kz.talipov.transit.services.impl;

import kz.talipov.transit.models.entities.VehicleType;
import kz.talipov.transit.repositories.VehicleTypeRepository;
import kz.talipov.transit.services.VehicleTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleTypeServiceImpl implements VehicleTypeService {

    private final VehicleTypeRepository vehicleTypeRepository;

    @Override
    public List<VehicleType> getAllVehicleType() {return vehicleTypeRepository.findAll();}

    @Override
    public VehicleType addVehicleType(VehicleType vehicleType) {return vehicleTypeRepository.save(vehicleType) ;}

    @Override
    public VehicleType updateVehicleType(VehicleType vehicleType) {return vehicleTypeRepository.save(vehicleType);}

    @Override
    public void deleteVehicleTypeById(Long id) {vehicleTypeRepository.deleteById(id);}
}
    //    @Override
//    public void delete(Long id) {
//        vehicleTypeRepository.deleteById(id);
//    }
//
//    @Override
//    public VehicleType store(String name) {
//        var item = VehicleType.builder()
//                .name(name)
//                .build();
//        return vehicleTypeRepository.save(item);
//    }
//
//    @Override
//    public VehicleType edit(Long id, String name) {
//        var itemOpt = getById(id);
//
//        if (itemOpt.isEmpty()) {
//            throw new RuntimeException("No such element");
//        }
//
//        var item = itemOpt.get();
//        item.setName(name);
//        return vehicleTypeRepository.save(item);
//    }
//
//    @Override
//    public List<VehicleType> list() {
//        return vehicleTypeRepository.findAll();
//    }
//
//    @Override
//    public Optional<VehicleType> getById(Long id) {
//        return vehicleTypeRepository.findById(id);
//    }


