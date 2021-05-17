package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaRegistro {
        private Scanner StringReciver = new Scanner(System.in);
        private Scanner floatReciver = new Scanner(System.in);
        private ArrayList <producto> productos = new ArrayList<>();
        private producto auxiliar = new producto();
        private float precioTotal;
        private String respuesta = "";
        private boolean salida = false;

        public void iniciarSistema(){
                while(!salida){
                        ingresarProducto();
                        precioParcial();
                        reinicio();
                }

        }
        private void ingresarProducto(){
                auxiliar=new producto();
                System.out.println("Ingrese el nombre y precio del producto");
                String nombre = StringReciver.nextLine();
                float precio = floatReciver.nextFloat();
                auxiliar.setNombre(nombre);
                auxiliar.setPrecio(precio);
                productos.add(auxiliar);
        }
        private void precioParcial(){
                precioTotal=0;
                for(int i=0; i<productos.size(); i++) {
                        auxiliar = productos.get(i);
                        precioTotal += auxiliar.getPrecio();
                }
                System.out.println("el precio a pagar hasta el momento es " + precioTotal);
        }
        private void reinicio(){
                System.out.println("Desea ingresar otro producto");
                respuesta = StringReciver.nextLine();
                if (respuesta.equals("no")) {
                        salida = true;
                        System.out.println("El total a pagar es " + precioTotal );
                }
        }
}
