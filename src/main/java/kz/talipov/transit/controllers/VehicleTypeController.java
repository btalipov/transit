package kz.talipov.transit.controllers;

import kz.talipov.transit.models.entities.VehicleType;
import kz.talipov.transit.services.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class VehicleTypeController {

    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping
    String getAllVehicleType (Model model){
        List<VehicleType> vehicleTypeList = vehicleTypeService.getAllVehicleType();
        model.addAttribute("vehicleType", vehicleTypeList);
        return "/requests";
    }
}
