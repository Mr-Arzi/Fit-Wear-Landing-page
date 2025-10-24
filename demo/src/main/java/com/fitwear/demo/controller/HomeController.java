package com.fitwear.demo.controller;



import com.fitwear.demo.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("productos", productoService.obtenerProductos());
        return "index";
    }

    @GetMapping("/productos")
    public String productos(Model model) {
        model.addAttribute("productos", productoService.obtenerProductos());
        return "productos";
    }

    @GetMapping("/quienes")
    public String quienes() {
        return "quienes";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
}
