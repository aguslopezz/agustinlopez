package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main10DeMayoEj2 {
    public static void main(String args[]){
        Scanner ingresoInt = new Scanner(System.in);
        boolean distintos = false;
        //Array 1
        ArrayList<Integer> numIngresados1 = new ArrayList<>();
        System.out.println("Ingrese la cantidad de numeros a agregar y luego dichos numeros");
        int cant1 = ingresoInt.nextInt();
        for(int i=0; cant1 > i; i++ ){
            int numA = ingresoInt.nextInt();
            numIngresados1.add(numA);
        }
        //Array 2
        ArrayList<Integer> numIngresados2 = new ArrayList<>();
        System.out.println("Ingrese la cantidad de numeros a agregar y luego dichos numeros");
        int cant2 = ingresoInt.nextInt();
        for(int i=0; cant2 > i; i++ ){
            int numB = ingresoInt.nextInt();
            numIngresados2.add(numB);
        }

        HashSet<Integer> set1 = new HashSet<>(numIngresados1);
        HashSet<Integer> set2= new HashSet<>(numIngresados2);

        if (set1.size()!=set2.size()){
            distintos=true;
        }

        for(int n : set1){
            if(!set2.contains(n)){
                distintos=true;
            }
        }
        if (distintos==true){
            System.out.println("Son distintos");

        }
        else if (distintos==false){
            System.out.println("No son distintos");
        }
    }
}
