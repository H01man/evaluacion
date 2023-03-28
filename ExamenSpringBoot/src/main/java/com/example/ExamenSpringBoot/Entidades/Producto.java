package com.example.ExamenSpringBoot.Entidades;

public class Producto {

    private int codigo;
    private String nombre;
    private String categoria;
    private Double precio;
    private int cantidad;
    private Double total;
    private Double totalIva;
    private Double descuento;

    public Producto(int codigo, String nombre, String categoria, Double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public Double getTotalIva() {
        return totalIva;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setTotalIva(Double totalIva) {
        this.totalIva = totalIva;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
}
