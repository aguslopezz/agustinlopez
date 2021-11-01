package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Album {
    public String titulo;
    public ArrayList<Cancion> canciones;

    public Album() {
        this.titulo = "MBDTF";
        this.canciones = new ArrayList<>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

}






