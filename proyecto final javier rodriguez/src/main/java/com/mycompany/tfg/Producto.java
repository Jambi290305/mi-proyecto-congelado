/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tfg;

/**
 *
 * @author isard
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private int stock;
    private double precio;

    // Constructor, getters y setters
    public Producto(String nombre, String descripcion, int stock, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }
    
    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getStock() { return stock; }
    public double getPrecio() { return precio; }
}

