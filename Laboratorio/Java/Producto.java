package com.company;

public class Producto {
    private String nombre="";
    private float precio=0;

    public Producto() {
        String nombre = "Pan";
        float precio = 307.00f;


    }

    public Producto(String nuevoNombre, float nuevoPrecio){
        nombre = nuevoNombre;
        precio = nuevoPrecio;
    }

    public String getNombre(){
        return nombre;
    }
    public float getPrecio(){
        return precio;
    }
    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
    public void setPrecio(float nuevoPrecio){
        precio=nuevoPrecio;
    }
}