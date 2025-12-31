package com.medical.cardio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardioController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Cardio Care - Home");
        return "index";
    }

    @GetMapping("/domain")
    public String domain(Model model) {
        model.addAttribute("title", "Cardiology Domain");
        return "domain";
    }

    @GetMapping("/purpose")
    public String purpose(Model model) {
        model.addAttribute("title", "Application Purpose");
        return "purpose";
    }
}
