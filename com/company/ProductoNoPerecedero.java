package com.company;

import java.util.HashSet;

public class ProductoNoPerecedero extends ProductoAlimenticio{
    public float mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, int codigo, float costo, float mgDeSodio) {
        super(nombre, origen, codigo, costo);
        this.mgDeSodio = mgDeSodio;
    }



    @Override
    public float calcularPrecioFinal() {
        return 0;
    }

    @Override
    public float calcularGananciaObtenida() {
        return 0;
    }

    @Override
    public String tipoDeProducto() {
        return null;
    }
}
