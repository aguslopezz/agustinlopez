package com.company;

import java.util.ArrayList;
import java.util.HashSet;


public class Cancion {
    public String titulo;
    public HashSet<Artista> artistas;
    public HashSet<Autor> autores;

    public Cancion(){
        this.titulo = "Power";
        this.artistas = new HashSet<>();
        this.autores = new HashSet<>();
    }

    public HashSet<Artista> getArtistas(){
        return artistas;
    }
}
