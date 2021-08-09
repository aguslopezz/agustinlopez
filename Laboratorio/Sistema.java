package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Sistema{
    HashSet<Pasajero> pasajerosPresentes;
    ArrayList<Pasajero> historialDePasajeros;

    public Sistema(){
        super();
        pasajerosPresentes = new HashSet<>();
        historialDePasajeros = new ArrayList<>();
    }

    public void subePasajero(Pasajero pasajero){
        if (pasajero.saldo > Viaje.precio) {
            System.out.println("Bienvenido!");
            pasajerosPresentes.add(pasajero);
            historialDePasajeros.add(pasajero);
        }
        else if (pasajero.saldoNegativoMaximo < Viaje.precio){
            System.out.println("Bienvenido!");
            pasajerosPresentes.add(pasajero);
            historialDePasajeros.add(pasajero);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void bajaPasajero(Pasajero pasajero){
        pasajerosPresentes.remove(pasajero);
    }

    public HashSet<Pasajero> pasajerosQueSeHanSubidoAlgunaVez(ArrayList<Pasajero> historialDePasajeros){
        HashSet<Pasajero> pasajerosHist = new HashSet<>();
        for (Pasajero pasajero : historialDePasajeros) {
            pasajerosHist.add(pasajero);
        }
        return pasajerosHist;
    }






}
