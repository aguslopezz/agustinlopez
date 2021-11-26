package com.company;

public abstract class ProductoDeSuper implements Producto {
    public String nombre;
    public String origen;
    public int codigo;
    public float costo;

    public ProductoDeSuper (String nombre, String origen, int codigo, float costo){
        this.nombre = nombre;
        this.origen = origen;
        this.codigo = codigo;
        this.costo = costo;
    }

    @Override
    public abstract float calcularPrecioFinal();

    @Override
    public abstract float calcularGananciaObtenida();

    @Override
    public abstract String tipoDeProducto();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getCosto() {
        return costo;
    }
}
