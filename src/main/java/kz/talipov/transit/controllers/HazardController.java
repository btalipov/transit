package kz.talipov.transit.controllers;

import kz.talipov.transit.models.entities.Hazard;
import kz.talipov.transit.services.HazardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class HazardController {
    @Autowired
    private HazardService hazardService;

    @GetMapping
    String getAllHazard(Model model){
        List<Hazard> hazardList = hazardService.getAllHazards();
        model.addAttribute("hazard", hazardList);
        return "requests";
    }
}
