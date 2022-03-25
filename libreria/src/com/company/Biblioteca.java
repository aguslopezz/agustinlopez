package com.company;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<CopiaLibro>copias = new ArrayList<>();
    private ArrayList<Prestamo>prestamos = new ArrayList<>();


    public ArrayList<CopiaLibro> getCopias() {
        return copias;
    }

    public void setCopias(ArrayList<CopiaLibro> copias) {
        this.copias = copias;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Biblioteca(ArrayList<CopiaLibro> copias, ArrayList<Prestamo> prestamos) {
        this.copias = copias;
        this.prestamos = prestamos;
    }
}

