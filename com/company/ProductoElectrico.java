package com.company;

public abstract class ProductoElectrico extends ProductoDeSuper {
    private int cantDiasDeGarantia;
    private static float recargoPorEnvio;

    public ProductoElectrico(String nombre, String origen, int codigo, float costo, int cantDiasDeGarantia) {
        super(nombre, origen, codigo, costo);
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    @Override
    public float calcularGananciaObtenida() {
        if (cantDiasDeGarantia == 365) {
            return ((costo * 45) / 100);
        } else if (cantDiasDeGarantia <= 60) {
            return ((costo * 15) / 100);
        }
        return 0;
    }

    @Override
    public float calcularPrecioFinal() {
        if (cantDiasDeGarantia == 365) {
            return (costo + ((costo * 45) / 100));
        } else if (cantDiasDeGarantia <= 60) {
            return (costo + ((costo * 15) / 100));
        }
        return 0;
    }

    @Override
    public String tipoDeProducto() {
        return "Producto Electrico";
    }
}
