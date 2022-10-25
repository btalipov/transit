package kz.talipov.transit.controllers;

import kz.talipov.transit.models.entities.Request;
import kz.talipov.transit.models.entities.User;
import kz.talipov.transit.repositories.RequestRepository;
import kz.talipov.transit.repositories.UserRepository;
import kz.talipov.transit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;
    private UserRepository userRepository;
    private RequestRepository requestRepository;

    @GetMapping(value = "/login")
    public String getAllUsers(Model model){
        List<User> userList = userService.getAllUsers();
        model.addAttribute("user",userList);
        return "login";
    }

    @PostMapping(value = "/registration")
    public String addUser(@ModelAttribute(name = "newUser") User newUser){
        userRepository.save(newUser);
        return "redirect: /newRequest";
    }

    @PostMapping(value = "/requests")
    public String deleteRequest(@PathVariable(name = "id") Long id) {
        Request request = requestRepository.findById(id).orElse(null);
        requestRepository.deleteById(id);
        return "redirect:/requests";
    }
}
