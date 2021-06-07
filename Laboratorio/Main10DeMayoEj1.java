package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main12deMayo {
    public static void main(String args[]){
        Scanner ingresoInt = new Scanner(System.in);
        ArrayList<Integer> numIngresados = new ArrayList<>();
        System.out.println("Ingrese la cantidad de numeros a agregar y luego dichos numeros");
        int cant = ingresoInt.nextInt();
        for(int i=0; cant > i; i++ ){
            int numA = ingresoInt.nextInt();
            numIngresados.add(numA);
        }
        HashSet<Integer> set = new HashSet(numIngresados);
        ArrayList<Integer> newNumIngresados = new ArrayList(set);
        System.out.println(newNumIngresados);
    }
}
