package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Banco{
    public String nombreBanco;
    public ArrayList<Cliente> clientesVisit;


    public Banco() {
        nombreBanco = "Banco Provincia";
        clientesVisit = new ArrayList<Cliente>();
    }

    public void addVisits(ArrayList<Cliente> clientesVisit) {
        this.clientesVisit = clientesVisit;
    }

    public HashSet<Integer> cbusDeClientesVisitantes(ArrayList<Cliente> clientesVisit) {
        HashSet<Integer> Cbus = new HashSet<Integer>();
        for (Cliente Cliente : clientesVisit) {
            Cbus.add(Cliente.getCbu());
        }
        return Cbus;
    }
    public void printCbus(HashSet<Integer> Cbus){
        for(int i : Cbus){
            System.out.println(i);
        }
    }

}


