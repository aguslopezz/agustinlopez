package com.company;

import java.time.LocalDate;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Prestamo {
    private int Id;
    Biblioteca biblioteca;
    CopiaLibro copia;
    Lector lector;
    private LocalDate fechaInicio;
    private LocalDate fechaEntrega;
    private LocalDate fechaDevolucion;

    public void hacerMulta(Lector lector){
        lector.setDiasMulta(2);
    }

    public Prestamo(int Id, Biblioteca biblioteca, CopiaLibro copia, Lector lector, LocalDate fechaDevolucion, LocalDate fechaInicio, LocalDate fechaEntrega) {
        this.Id = Id;
        this.biblioteca = biblioteca;
        this.copia = copia;
        this.lector = lector;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaInicio.plusDays(30);
    }

    public void cerrarPrestamo(LocalDate fechaDevolucion, LocalDate fechaEntrega, int Id){
        if (LocalDate.now()(equals(fechaEntrega) || !fechaDevolucion) equals(fechaEntrega)) {
            biblioteca.getPrestamos().remove(this.Id);
        }
            if (fechaDevolucion > fechaEntrega){



    }
}




