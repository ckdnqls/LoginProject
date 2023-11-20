package com.sparta.loginproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginProjectHomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "username");
        return "index";
    }
}