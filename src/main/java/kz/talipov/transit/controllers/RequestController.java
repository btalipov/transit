package kz.talipov.transit.controllers;


import kz.talipov.transit.models.entities.Request;
import kz.talipov.transit.repositories.RequestRepository;
import kz.talipov.transit.services.RequestService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/requests")
public class RequestController {
    @Autowired
    private RequestService requestService;

    @GetMapping
    String getAllRequest(Model model) {
       List<Request> requestList = requestService.getAllRequests();
       model.addAttribute("requests", requestList);
       return "requests";
    }

}
