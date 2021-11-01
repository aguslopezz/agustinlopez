package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    public String nombre;
    public HashSet<Album> albumes;

    public Sistema() {
        this.nombre = "NAZI";
        this.albumes = new HashSet<>();
    }

    public HashSet<Artista> aparecion() {
        HashSet<Artista> aparicion = new HashSet<>();
        for (Album a : albumes) {
            for (Cancion b : a.getCanciones()) {
                for (Artista c : b.getArtistas()) {
                    aparicion.add(c);
                }
            }
        }
        return aparicion;
    }

    public HashMap<Artista, Integer> artistaMasInfluyente(){
        HashMap<Artista, Integer> aparicionesCArt = new HashMap<>();
        for (Album a : albumes) {
            for (Cancion b : a.getCanciones()) {
                for (Artista c : b.getArtistas()) {
                    int apariciones
                }
    }
}



