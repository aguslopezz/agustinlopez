package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona>personas = new ArrayList<>();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        p2.setApellido("Lopez");
        p3.setApellido("Marcos");

        p2.setEdad(16);
        p2.setDni(45671234);
        p3.setEdad(15);
        p3.setDni(45623456);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        HashSet<String>apellidos = new HashSet<>();
        HashMap<Integer,Integer>pers = new HashMap<>();

        for(Persona a : personas){
            apellidos.add(a.getApellido());
            pers.put(a.getDni(), a.getEdad());
        }

        for(Integer a : pers.keySet()){
            System.out.println(a);
        }
    }
}
