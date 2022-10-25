package kz.talipov.transit.controllers;

import kz.talipov.transit.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//public class HomeController {
//    @Autowired
//    private RequestRepository requestRepository;
//
//    @GetMapping(value = "/")
//    public String getIndex(Model model) {
//        model.addAttribute("requestList", requestRepository.findAll());
//        return "login";
//    }
//}
//    }
//
//    @GetMapping(value = "/add-request")
//    public String getRequestForm(Model model) {
//        model.addAttribute("newRequest", new client();
//        return "addRequest";
//    }
