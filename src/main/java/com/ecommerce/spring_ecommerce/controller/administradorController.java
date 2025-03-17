package com.ecommerce.spring_ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class administradorController {

    @GetMapping("")
    public String home(Model model) {
        return "administrador/home";
    }
}
