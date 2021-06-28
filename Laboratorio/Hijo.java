package com.company;

import java.util.HashSet;

public class Hijo extends Persona{
    private String escuela;
    private String juegoFavorito;

    public Hijo(){
        super();
        escuela = "Politecnico Modelo";
        juegoFavorito = "League of Legends";
    }

    public Hijo(String nuevaEscuela, String nuevojuegoFavorito, String nuevoNombre, int nuevaEdad, int nuevoDni, int nuevoTelefono, String nuevaDireccion){
        super(nuevoNombre, nuevaEdad, nuevoDni, nuevoTelefono, nuevaDireccion);
        escuela = nuevaEscuela;
        juegoFavorito = nuevojuegoFavorito;
    }
}
