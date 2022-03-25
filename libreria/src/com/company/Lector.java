package com.company;

import java.util.ArrayList;

public class Lector {
    private String nombre;
    private String apellido;
    private int DNI;
    private ArrayList<Prestamo>prestamos = new ArrayList<>();
    private int diasMulta;

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public int getDiasMulta() {
        return diasMulta;
    }

    public void setDiasMulta(int diasMulta) {
        this.diasMulta = this.diasMulta+diasMulta;
    }
}
