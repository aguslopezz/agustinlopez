package com.company;

public class MuebleMadera extends Mobiliario {
    public MuebleMadera(String nombre, String origen, int codigo, float costo, String material) {
        super(nombre, origen, codigo, costo, material);
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
