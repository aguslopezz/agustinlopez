package com.company;

public class ProductoNoPerecedero extends ProductoAlimenticio {
    public float mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse, float mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.mgDeSodio = mgDeSodio;
    }

    public float getMgDeSodio() {
        return mgDeSodio;
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
