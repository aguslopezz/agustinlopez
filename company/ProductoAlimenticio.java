package com.company;

public abstract class ProductoAlimenticio extends ProductoDeSuper{
    public int cantDiasParaVencerse;
    public static float descuento = 0.10f;

    public ProductoAlimenticio(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse) {
        super(nombre, origen, codigo, costo);
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }

    @Override
    public float calcularPrecioFinal(){
        return costo = this.getCosto() + ((calcularGananciaObtenida() * this.getCosto()) / 100)  - (getCosto()*descuento);
    }

    public int getCantDiasParaVencerse() {
        return cantDiasParaVencerse;
    }

    public static float getDescuento() {
        return descuento;
    }

    @Override
    public float calcularGananciaObtenida(){
        int porcentajeGanancia = 0;
        if (getCantDiasParaVencerse() <= 90) {
            porcentajeGanancia = 10;
        } else if (getCantDiasParaVencerse() >= 90) {
            porcentajeGanancia = 25;
        }
        return porcentajeGanancia;
    }

    @Override
    public String tipoDeProducto(){
        return "Producto Alimenticio";
    }
}
