package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cine {
    public String nombre;
    public String direccion;
    public ArrayList<Sala> salas;

    public Cine(String nombre, String direccion,ArrayList<Sala> salas){
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = new ArrayList<>();
    }

    public HashSet<Integer> idVisitantesQueConcurrieron(){
        HashSet<Integer> idVisitantesAlMenos1Vez = new HashSet<>();
        for(Sala s : salas){
            for(Visitante v : s.getVisitantesQueIngresaron()){
                idVisitantesAlMenos1Vez.add(v.getId());
            }
        }
        return idVisitantesAlMenos1Vez;
    }

    public int cantidadVisitantes(Sala s){
        return s.getVisitantesPresentes().size();
    }

    public HashMap<Integer, Integer> visitantesConCantidadDeVisitas(){
        HashMap<Integer, Integer> idVisitantesConVisitas = new HashMap<>();
        for (Sala s : salas) {
            for (Visitante v : s.visitantesQueIngresaron) {
                if (idVisitantesConVisitas.containsKey(v.getId())) {
                    Integer sumaVis = idVisitantesConVisitas.get(v) + 1;
                    idVisitantesConVisitas.replace(v.getId(), sumaVis);
                }
                else idVisitantesConVisitas.put(v.getId(), 1);
            }
        }
        return idVisitantesConVisitas;
    }

    public void informeActual(){
        for (Sala s : salas){
            System.out.println("Numero de sala: " + s.getId() + "\nCantidad de asientos: " + s.getAsientos() + "\nCapacidad maxima permitida: " + s.getCapacidadMax() + "\nCantidad de visitantes presentes: " + s.cantidadVisitantesActual() + "\nCantidad de asientos disponibles: " + s.asientosDisponibles());
        }
    }






}
