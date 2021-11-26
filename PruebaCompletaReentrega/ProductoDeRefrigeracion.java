package com.company;

public class ProductoDeRefrigeracion extends ProductoElectrico {
    public float litrosDeCapacidad;

    public float getLitrosDeCapacidad() {
        return litrosDeCapacidad;
    }

    public ProductoDeRefrigeracion(String nombre, String origen, int codigo, float costo, int cantDiasDeGarantia, float litrosDeCapacidad) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public String getOrigen() {
        return origen;
    }


    public int getCodigo(){
        return codigo;
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
