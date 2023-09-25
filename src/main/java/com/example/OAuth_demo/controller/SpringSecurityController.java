package com.example.OAuth_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SpringSecurityController {
    @GetMapping("/auth")
    public String getRequest() {
        return "Welcome";
    }

}
