package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner StringReciver = new Scanner(System.in);
        Scanner floatReciver = new Scanner(System.in);
        boolean salida = false;
        float precioTotal = 0;
        String respuesta;

        while (!salida) {
            System.out.print("Ingrese el nombre del producto y su respectivo precio\n");
            String nombre = StringReciver.nextLine();
            float precio = floatReciver.nextFloat();
            Producto prod = new Producto(nombre,precio);
            precioTotal += precio;
            System.out.print("Actualmente debe abonar " + precioTotal + "\ndesea registrar otro producto?");
            respuesta = StringReciver.nextLine();

            if (respuesta.equals("finalizar")) {
                salida = true;
                System.out.print("El total a pagar es " + precioTotal + "\n");
            }
        }
    }
}