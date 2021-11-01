package com.company;

public class Main {
    public static void main(String args[]){
        Artista a1 = new Artista();
        Album aa1 = new Album();
        Cancion c1 = new Cancion();

        aa1.canciones.add(c1);

        a1.albums.add(aa1);
        a1.imprimirArtista(a1);
    }
}