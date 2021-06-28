package com.company;

import java.util.HashSet;

public class Madre extends Persona {
    private String empresaNombre;
    private HashSet<Hijo> hijos = new HashSet<>();

    public Madre(){
        super();
        HashSet<Hijo> newHijos = new HashSet<>();
        Hijo entry = new Hijo();
        newHijos.add(entry);

        empresaNombre = "Xiaomi";
        hijos = newHijos;
    }

    public Madre(String nuevaEmpresa, HashSet<Hijo> newHijos, String nuevoNombre, int nuevaEdad, int nuevoDni, int nuevoTelefono, String nuevaDireccion){
        super(nuevoNombre, nuevaEdad, nuevoDni, nuevoTelefono, nuevaDireccion);
        empresaNombre = nuevaEmpresa;
        hijos = newHijos;
    }

    public HashSet<Hijo> hijosMenoresEdad(HashSet<Hijo> hijos){
        HashSet<Hijo> hijosMenores = new HashSet<>();

        for (Hijo i: hijos) {
            if(i.getEdad()<18){
                hijosMenores.add(i);
            }
        }
        return hijosMenores;
    }


}



