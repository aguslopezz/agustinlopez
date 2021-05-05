package com.company;
import java.util.Scanner;

public class Main19abril {
    public static void main(String[] args) {
        Scanner StringReciver = new Scanner(System.in);
        Scanner floatReciver = new Scanner(System.in);
        boolean salida = false;
        float precioTotal=0;
        String respuesta;

        while (!salida) {
            System.out.print("Ingrese el nombre y precio del producto");
            String nombre = StringReciver.nextLine();
            float precio = floatReciver.nextFloat();
            precioTotal += precio;
            System.out.print("el precio a pagar hasta el momento es " + precioTotal +"\ndesea registrar otro producto");
            respuesta = StringReciver.nextLine();

            if (respuesta.equals("no")) {
                salida = true;
            }
            System.out.print("El total a pagar es " + precioTotal + "\n");
        }
    }
}