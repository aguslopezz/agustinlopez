package com.company;

public class Visitante {
    public int id;
    public int numeroAsiento;

    public Visitante(int id, int numeroAsiento){
        this.id = id;
        this.numeroAsiento = numeroAsiento;
    }

    public int getId() {
        return id;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }
}
