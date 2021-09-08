package com.company;

import java.util.ArrayList;


public class Artista_musical extends Persona{
    private String nombreart;
    private ArrayList<Album> albums;
    private String discografica;

    public Artista_musical(String nombreart, String discografica){
        super();
        this.nombreart = nombreart;
        albums = new ArrayList<>();
        this.discografica = discografica;
    }








}
