package com.company;

public class Main {

    public static void main(String[] args) {
        Persona p1= new Persona();
        Persona p2= new Persona("Roberto");
        Persona p3= new Persona("Dababy",29, 41267832, 1134789023,"Pampa 2345");
        p1.setEdad(p1.getEdad() * 2);
        p2.setTelefono(1111112345);
        System.out.print(p3.getNombre()+"\n"+p3.getEdad()+"\n"+p3.getDni()+"\n"+p3.getTelefono()+"\n"+p3.getDireccion());
    }
}