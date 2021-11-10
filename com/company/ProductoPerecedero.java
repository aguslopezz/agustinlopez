package com.company;

public class ProductoPerecedero extends ProductoAlimenticio {
    public float temperaturaMinDeFrio;

    public ProductoPerecedero(int cantDiasParaVencer, float descuento) {
        super(cantDiasParaVencer, descuento);
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
