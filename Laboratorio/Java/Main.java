package com.company;

public class Main {

    public static void main(String[] args) {
        Persona p = new Persona();
        String n = p.getNombre();
        System.out.println(n);
        p.setNombre("Dababy");
        n = p.getNombre();
        System.out.println(n);
        int e = p.getEdad();
        System.out.println(e);
        p.setEdad(3);
        e = p.getEdad();
        System.out.println(e);
    }
}
