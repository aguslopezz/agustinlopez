package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Producto {
    String nombre;
    float precio;

    public Producto(){ //Constructor
        nombre = "Acolchado";
        precio = 10.2f;
    }

    public Producto(String nombre, float precio){ //Constructor
        this.nombre = nombre;
        this.precio = precio;
    }

    public void registroDeProducto(String nombre,int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public int importeParcialAPagar(int precio){

        return precio;
    }

    public int importeFinalAPagar(int precio,){
        for (int i = 0; i < i.length; i++) {

        }
        return precio;
    }

    public void nuevoProducto(String nombreIngresado,  float precioIngresado){
        Scanner nombreProducto = new Scanner(System.in);
        Scanner precioProducto = new Scanner(System.in);

        System.out.println("Ingrese un nombre");
        String nombreProductoIngresado = nombreProducto.nextLine();

        System.out.println("Ingrese un precio");
        float precioProductoIngresado = precioProducto.nextFloat();

        Producto nuevoproducto = new Producto(nombreProductoIngresado,precioProductoIngresado);
    }

    public int getPrecio(){
        return precio;
    }

    public String getNombre(){
        return nombre;
    }

    // public void setEdad(int nuevaEdad){
    //     edad = nuevaEdad;
    // }

}