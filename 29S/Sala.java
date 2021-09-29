package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sala {
    public int id;
    public int asientos;
    public ArrayList<Visitante> visitantesQueIngresaron;
    public HashSet<Visitante> visitantesPresentes;
    public static int capacidadMax = 50;

    public Sala(int id, int asientos, ArrayList<Visitante> visitantesQueIngresaron, HashSet<Visitante> visitantesPresentes) {
        this.id = id;
        this.asientos = asientos;
        this.visitantesQueIngresaron = new ArrayList<>();
        this.visitantesPresentes = new HashSet<>();
    }

    public boolean estaLlena() {
        if (visitantesPresentes.size() == capacidadMax) {
            return true;
        }
        else return false;
    }

    public boolean hayInfiltrados() {
        if (visitantesPresentes.size() > capacidadMax) {
            return true;
        }
        else return false;
    }

    public int asientosDisponibles() {
        return capacidadMax - visitantesPresentes.size();
    }

    public int cantidadDeVisitantesPresentes() {
        return visitantesPresentes.size();
    }

    public HashMap<Integer, Integer> nroDeAsientosConCantidadDePreferencias() {
        HashMap<Integer, Integer> vecesPreferenciaAsientos = new HashMap<>();
        for (Visitante v : visitantesQueIngresaron) {
            if (vecesPreferenciaAsientos.containsKey(v.getNumeroAsiento())) {
                Integer sumaNum = vecesPreferenciaAsientos.get(v) + 1;
                vecesPreferenciaAsientos.replace(v.getId(), sumaNum);
            }
            else vecesPreferenciaAsientos.put(v.getId(), 1);
        }
        return vecesPreferenciaAsientos;
    }

    //en visitantesConCantidadDeVisitas() use literalmente lo mismo que en el Hashmap de cine, no se si esta hecho a proposito o no pero bueno fue raro;

    public HashMap<Integer, Integer> visitantesConCantidadDeVisitas() {
        HashMap<Integer, Integer> visitantesCantVisitas = new HashMap<>();
        for (Visitante v : visitantesQueIngresaron) {
            if (visitantesCantVisitas.containsKey(v.getId())) {
                Integer sumaVisit = visitantesCantVisitas.get(v) + 1;
                visitantesCantVisitas.replace(v.getId(), sumaVisit);
            }
            else visitantesCantVisitas.put(v.id, 1);
        }
        return visitantesCantVisitas;
    }




    public int getId() {
        return id;
    }

    public int getAsientos() {
        return asientos;
    }

    public ArrayList<Visitante> getVisitantesQueIngresaron() {
        return visitantesQueIngresaron;
    }

    public HashSet<Visitante> getVisitantesPresentes() {
        return visitantesPresentes;
    }

    public static int getCapacidadMax() {
        return capacidadMax;
    }

    public int cantidadVisitantesActual(){
        return visitantesPresentes.size();
    }
}







