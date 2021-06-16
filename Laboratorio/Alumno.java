package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Alumno extends Persona{
    private String curso;
    private HashMap<String,ArrayList<Float>> notasPorMateria;

    public Alumno(){
        curso="curso";
        ArrayList<Float> notas= new ArrayList<Float>();
        notasPorMateria.put("materia",notas);
    }

    public Alumno(String nuevoCurso, HashMap<String,ArrayList<Float>> nuevasNotasPorMateria){
        curso=nuevoCurso;
        notasPorMateria=nuevasNotasPorMateria;
    }

    public void AgregarNota(String materia, Float notaNueva){
        ArrayList<Float> temp= notasPorMateria.get(materia);
        temp.add(notaNueva);
        notasPorMateria.put(materia, temp);
    }
    public Float MenorNota(String materia){
        ArrayList<Float> temp= notasPorMateria.get(materia);
        Float notaTemp = 0F;
        for (Float i : temp){
            if (i<notaTemp){
                notaTemp=i;
            }
        }
        return notaTemp;
    }
    public Float MayorNota(String materia){
        ArrayList<Float> temp= notasPorMateria.get(materia);
        Float notaTemp = 101F;
        for (Float i : temp){
            if (i>notaTemp){
                notaTemp=i;
            }
        }
        return notaTemp;
    }
    public Float PromedioNotas(String materia){
        ArrayList<Float> temp= notasPorMateria.get(materia);
        Float notaTemp = 0F;
        for (Float i : temp){
            notaTemp=+i;
        }
        notaTemp=notaTemp/temp.size();
        return notaTemp;
    }
    public void agregarMateria(String nombreDeMateria){
        ArrayList<Float> temp= new ArrayList<Float>();
        notasPorMateria.put(nombreDeMateria,temp);
    }

}