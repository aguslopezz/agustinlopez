package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    public HashSet<Artista> listaArtista;
    public HashSet<Album> listaAlbum;

    public Sistema() {
        this.listaArtista = new HashSet<>();
        this.listaAlbum = new HashSet<>();
    }

    public void masDe3() {
        HashSet<Artista> masDeTresAlbum = new HashSet<>();
        for (Artista a : listaArtista) {
            if (a.getAlbums().size() > 3) {
                masDeTresAlbum.add(a);
            }

        }
        for (Artista a : masDeTresAlbum) {
            System.out.print(a.getNombreArt());
        }
    }

    public void discografiaArtista() {
        for (Artista a : listaArtista) {
            System.out.print(a.getNombre() + a.getApellido() + a.getEdad() + a.getNombreArt());
            for (Album b : a.getAlbums()) {
                System.out.print(b.getNombre());
                for (Cancion c : b.getCanciones()) {
                    System.out.print(c.getNombre());
                }
            }

        }
    }

    
}

