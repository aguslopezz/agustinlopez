package com.company;

public abstract class ProductoElectrico extends ProductoDeSuper {
    public int cantDiasDeGarantia;
    public static float recargoPorEnvio = 10;

    public ProductoElectrico(String nombre, String origen, int codigo, float costo, int cantDiasDeGarantia) {
        super(nombre, origen, codigo, costo);
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public static float getRecargoPorEnvio() {
        return recargoPorEnvio;
    }

    public int getCantDiasDeGarantia() {
        return cantDiasDeGarantia;
    }

    @Override
    public float calcularPrecioFinal(){
        return costo = this.getCosto() + ((calcularGananciaObtenida() * this.getCosto()) / 100)  + recargoPorEnvio;
    }

    @Override
    public float calcularGananciaObtenida(){
        int porcentajeGanancia = 0;
        if (getCantDiasDeGarantia() == 365) {
            porcentajeGanancia = 45;
        } else if (getCantDiasDeGarantia() <= 60) {
            porcentajeGanancia = 15;
        }
        return porcentajeGanancia;
    }

    @Override
    public String tipoDeProducto(){
        return "Producto Electrico";
    }

}
