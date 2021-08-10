package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Sistema {
    HashSet<Pasajero> pasajerosPresentes;
    ArrayList<Pasajero> historialDePasajeros;
    public int linea;

    public Sistema(int linea) {
        super();
        pasajerosPresentes = new HashSet<>();
        historialDePasajeros = new ArrayList<>();
        this.linea = linea;
    }

    public void subePasajero(Pasajero pasajero) {
        if (pasajero.saldo > Viaje.precio) {
            System.out.println("Bienvenido!");
            pasajerosPresentes.add(pasajero);
            historialDePasajeros.add(pasajero);
        } else if (pasajero.saldoNegativoMaximo < Viaje.precio) {
            System.out.println("Bienvenido!");
            pasajerosPresentes.add(pasajero);
            historialDePasajeros.add(pasajero);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void bajaPasajero(Pasajero pasajero) {
        pasajerosPresentes.remove(pasajero);
    }

    public HashSet<Pasajero> pasajerosQueSeHanSubidoAlgunaVez() {
        HashSet<Pasajero> pasajerosHist = new HashSet<>();
        for (Pasajero pasajero : this.historialDePasajeros) {
            pasajerosHist.add(pasajero);
        }
        return pasajerosHist;
    }

    HashMap<Pasajero, tarjetaEquis> pasajerosConUltimoMontoAbonado() {
        for (Pasajero pasajero : historialDePasajeros) {
            tarjetaEquis put = pasajerosConUltimoMontoAbonado().put(pasajero, pasajero.ultimoMontoAbonado());
        }
        return pasajerosConUltimoMontoAbonado();
    }

    float ultimoMontoAbonadoPorPasajero(float numeroId) {
        for (Pasajero pasajero : historialDePasajeros) {
            if (pasajero.getNumeroId() == numeroId) {
                System.out.println(pasajero.ultimoMontoAbonado());
            }
        }
        return 0;
    }


    boolean seSuperaElSaldoNegativo(Pasajero pasajero, tarjetaEquis tarjeta) {
        if(tarjeta.getSaldo()- Viaje.getPrecio() < tarjeta.getSaldoNegativoMaximo()){
            return true;
        }
    else return false;
    }
}