package com.example.conferenceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class IndexController {
    @GetMapping("index")
    public String myFunc(Map<String, Object> map) {
        map.put("name", "Khushal Shah");
        return "index";
    }
}
