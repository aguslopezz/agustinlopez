package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SistemaSupermercado implements SistemaDeVentas {
    String Nombre;
    HashSet<ProductoDeSuper> productosDisponiblesParaVenta;
    ArrayList<ProductoDeSuper> productosVendidos;

    public SistemaSupermercado(String Nombre, HashSet<ProductoDeSuper> productosDisponiblesParaVenta, ArrayList<ProductoDeSuper> productosVendidos){
        this.Nombre = Nombre;
        this.productosDisponiblesParaVenta = new HashSet<>();
        this.productosVendidos = new ArrayList<>();
    }


    @Override
    public float calcularPrecioFinal() {
        return 0;
    }

    @Override
    public float calcularGananciaObtenida() {
        return 0;
    }

    @Override
    public String tipoDeProducto() {
        return null;
    }

    public void agregarProductoVendido() {
        Scanner prod = new Scanner(System.in);
        System.out.println("indique un nombre");
        String nombre = prod.nextLine();
        System.out.println("ingrese un origen");
        String origen = prod.nextLine();
        System.out.println("Ingrese un codigo");
        int codigo = prod.nextInt();
        System.out.println("ingrese un costo");
        int costo = prod.nextInt();

            try {
                nombre = prod.nextLine();
            } catch (java.util.InputMismatchException e) //error con otros caracteres
            {
                System.out.println("Error: valor no valido");
                prod = new Scanner(System.in);
            }


    }
    public HashSet<String> aptosParaHipertensos(){
        HashSet<String> aptoHipertensos = new HashSet<>();
        for (ProductoDeSuper p : productosDisponiblesParaVenta ) {


            }


        }

    }

    public HashMap<Integer,Float> productosRefrigeranteConCapacidad(){
    HashMap<Integer, Float> productosRefrigerantes = new HashMap<>();
        for (ProductoDeSuper p : productosDisponiblesParaVenta) {


        }

}

    @Override
    public float gananciaTotalObtenida() {
        return 0;
    }

    @Override
    public float ingresosTotales() {
        return 0;
    }

    @Override
    public int cantidadDeProductosVendidos() {
        return 0;
    }



}
