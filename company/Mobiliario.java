package com.company;

public abstract class Mobiliario extends ProductoDeSuper{
    public String material;

    public Mobiliario(String nombre, String origen, int codigo, float costo, String material) {
        super(nombre, origen, codigo, costo);
        this.material = material;
    }
 

}
