package kz.talipov.transit.services;

import kz.talipov.transit.models.entities.VehicleType;

import java.util.List;
import java.util.Optional;

public interface VehicleTypeService {

    List<VehicleType> getAllVehicleType();

    VehicleType addVehicleType(VehicleType vehicleType);

    VehicleType updateVehicleType(VehicleType vehicleType);

    void deleteVehicleTypeById(Long id);


//    void delete(Long id);
//
//    VehicleType store(String name);
//
//    VehicleType edit(Long id, String name);
//
//    List<VehicleType> list();
//
//    Optional<VehicleType> getById(Long id);

}
