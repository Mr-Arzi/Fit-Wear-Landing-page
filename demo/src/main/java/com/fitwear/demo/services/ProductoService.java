package com.fitwear.demo.services;

import com.fitwear.demo.models.Producto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {

    public List<Producto> obtenerProductos() {
        return List.of(
            new Producto("Running", "img/running.png", "Calzado deportivo cómodo."),
            new Producto("Hoodies", "img/hoodie.png", "Sudaderas cómodas y estilosas."),
            new Producto("Gimnasio", "img/gymbag.png", "Accesorios para entrenamiento."),
            new Producto("Jerseys", "img/jersey.png", "Ropa deportiva profesional.")
        );
    }
}
