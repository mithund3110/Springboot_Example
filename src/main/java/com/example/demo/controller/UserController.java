package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String handleForm(@RequestParam String username,
                             @RequestParam String password,
                             Model model) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "result";
    }
}
