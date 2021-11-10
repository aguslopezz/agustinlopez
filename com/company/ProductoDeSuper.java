package com.company;

public abstract class ProductoDeSuper implements Producto{
    public String nombre;
    public String origen;
    public int codigo;
    public float costo;

    public ProductoDeSuper(String nombre, String origen, int codigo, float costo){
        this.nombre = nombre;
        this.origen = origen;
        this.codigo = codigo;
        this.costo = costo;
    }

    public ProductoDeSuper() {
        this.nombre = "Producto";
        this.origen = "China";
        this.codigo = 11111;
        this.costo = 200f;
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

