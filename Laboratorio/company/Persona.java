package com.company;

public class Persona {
    public String nombre;
    public int DNI;

    public Persona(){
        nombre = "Agustin";
        DNI = 111111111;
    }

    public Persona(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
}