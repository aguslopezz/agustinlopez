package com.company;

public class Cliente extends Persona {
    public int CBU;

    public Cliente(){
        super();
        nombre = "Agustin";
        DNI = 44729120;
        CBU = 111111111;
    }
    public Cliente(String nombre, int DNI, int CBU){
        super();
        this.nombre = nombre;
        this.DNI = 44729120;
        this.CBU = 111111111;
    }
    public String getNombre(){
        return nombre;
    }

    public int getDni(){
        return DNI;
    }

    public int getCbu(){
        return CBU;
    }
}

