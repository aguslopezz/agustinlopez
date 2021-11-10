package com.company;

public abstract class ProductoAlimenticio extends ProductoDeSuper{
    public int cantDiasParaVencer;
    public static float descuento;


    public ProductoAlimenticio(String nombre, String origen, int codigo, float costo) {
        super(nombre, origen, codigo, costo);
    }

    public ProductoAlimenticio(int cantDiasParaVencer) {
        super();
        this.cantDiasParaVencer = cantDiasParaVencer;
    }


    @Override
    public float calcularGananciaObtenida() {
        if (this.cantDiasParaVencer >= 90){
            return ((costo * 10)/100);
        }
        else return ((costo * 25)/100);
    }

    @Override
    public float calcularPrecioFinal() {
        if (cantDiasParaVencer >= 90){
            return (costo + ((costo * 10)/100));
        }
        else return ((costo + ((costo * 25)/100)));
    }

    @Override
    public String tipoDeProducto() {
        return "Producto Alimenticio";
    }


}
