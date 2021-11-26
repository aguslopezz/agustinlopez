package com.company;

public class ProductoPerecedero extends ProductoAlimenticio{
    public float tempMinimaDeFrio;


    public ProductoPerecedero(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse, float tempMinimaDeFrio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.tempMinimaDeFrio = tempMinimaDeFrio;
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
