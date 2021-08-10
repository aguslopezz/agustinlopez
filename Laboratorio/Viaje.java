package com.company;

public class Viaje {
    static float precio;
    String fecha;
    String hora;

    public Viaje(){
        precio = 20f;
        fecha = "10/08/21";
        hora = "20:30";
    }

    public static float getPrecio(){
        return precio;
    }

}