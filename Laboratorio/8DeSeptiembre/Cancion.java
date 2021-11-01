package com.company;

public class Cancion {
    private String nombre;
    private String duracion;
    private float precioMin;

    public Cancion(String nombre, String duracion){
        this.nombre = nombre;
        this.duracion = duracion;
        precioMin = 500f;
    }
    
    public float getPrecioMin(){
        return precioMin;
    }

    
}
