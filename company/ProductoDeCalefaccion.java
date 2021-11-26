package com.company;

public class ProductoDeCalefaccion extends ProductoElectrico{
    public float wattsDePotenciaMax;

    public ProductoDeCalefaccion(String nombre, String origen, int codigo, float costo, int cantDiasDeGarantia, float wattsDePotenciaMax) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
        this.wattsDePotenciaMax = wattsDePotenciaMax;
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
