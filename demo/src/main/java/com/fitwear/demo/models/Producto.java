package com.fitwear.demo.models;


public class Producto {
    private String nombre;
    private String imagen;
    private String descripcion;

    public Producto(String nombre, String imagen, String descripcion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getImagen() { return imagen; }
    public String getDescripcion() { return descripcion; }
}
