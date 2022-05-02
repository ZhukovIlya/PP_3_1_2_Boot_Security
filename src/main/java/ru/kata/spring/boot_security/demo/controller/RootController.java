package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RootController {

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping(value = "login")
    public String getLoginPage() {
        return "login";
    }
}
