package com.company;
public class Persona {
    private String nombre;
    private int edad;
    public Persona(){
        nombre = "Armando";
        edad = 24;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public void setEdad (int nuevaEdad){
        edad =nuevaEdad;
    }
}
