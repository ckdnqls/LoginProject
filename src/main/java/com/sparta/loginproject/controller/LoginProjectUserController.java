package com.sparta.loginproject.controller;

import com.sparta.loginproject.dto.SignupRequestDto;
import com.sparta.loginproject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class LoginProjectUserController {

    private final UserService userService;


    public LoginProjectUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/login-page")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/user/signup")
    public String signupPage() {
        return "signup";
    }
    @PostMapping("/user/signup")
    public String signup(SignupRequestDto requestDto){
        userService.signup(requestDto);

        return "redirect:/api/user.login-page";
    }
}