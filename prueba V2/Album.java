package com.company;

import java.util.ArrayList;

public class Album {
    public String nombre;
    public ArrayList<Cancion> canciones;

    public Album(){
        this.nombre = "MBDTF";
        this.canciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cancion> getCanciones(){
        return canciones;
    }
}
