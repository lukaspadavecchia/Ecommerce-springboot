package com.ecommerce.spring_ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.spring_ecommerce.model.Producto;
import com.ecommerce.spring_ecommerce.service.ProductoService;

@Controller
@RequestMapping("/administrador")
public class administradorController {
	@Autowired
	private ProductoService productoService;
    @GetMapping("")
    public String home(Model model) {
    	List<Producto>productos=productoService.findAll();
    	model.addAttribute("productos", productos);
        return "administrador/home";
    }
}
