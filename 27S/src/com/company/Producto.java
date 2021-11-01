package com.company;

public class Producto {
    public int codigo;
    public String nombre;
    public int stock;
    public float precio;
    public static int descuento = 30;

    public Producto(int codigo, String nombre, int stock, float precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public float precioConDescuento(){
        return (precio - ((precio * descuento)/100));
    }

    @Override
    public String toString() {
        return "Codigo = " + codigo + "\nNombre = " + nombre + "\nstock = " + stock + "\nprecio = " + precio;

    }

    public static void imprimirInformacion(Producto p){
        System.out.println(p.toString());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static int getDescuento() {
        return descuento;
    }

    public static void setDescuento(int descuento) {
        Producto.descuento = descuento;
    }
}
