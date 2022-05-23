package com.example.conferenceapp.controller;

import com.example.conferenceapp.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegisterController {

    @GetMapping("register")
    public String func(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping("register")
    public String addRegistration(@ModelAttribute("registration") Registration registration) {
        System.out.println("Registering - " + registration.getName());
        return "Success";
    }
}
