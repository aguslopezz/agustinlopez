package com.company;

public class ProductoDeRefrigeracion extends ProductoElectrico{
    private float litrosDeCapacidad;

    public ProductoDeRefrigeracion(String nombre, String origen, int codigo, float costo) {
        super(nombre, origen, codigo, costo);
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
