package com.company;

import java.util.HashSet;

public class Artista extends Persona{
    public String nombreArt;
    public HashSet<Album> albums;

    public Artista(){
        super();
        this.nombreArt = "Ye";
        this.albums = new HashSet<>();
    }

    public HashSet<Album> getAlbums() {
        return albums;
    }

    public String getNombreArt(){
        return nombreArt;
    }

    public void imprimirArtista(Artista a){
        System.out.print(a.toString());
    }

    @Override
    public String toString() {
        String mensaje = "Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() + "\nNombre artistico: " + getNombreArt() + "\n\nAlbum: " + getAlbums();
        return mensaje;
    }
}

