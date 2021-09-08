package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema{
    Artista_musical artista;

    public Sistema(Artista_musical artista){
        this.artista = artista;
    }

    public HashMap<String, Float> cantantesYcanciones(Artista_musical artista){
        HashMap<String, Float> cantantesCanciones = new HashMap<>();
        for(Artista_musical artista : cantantesCanciones){
            cantantesCanciones.put(artista.getNombre(), Cancion.getPrecio());
        }
        return cantantesCanciones;

    }



}
