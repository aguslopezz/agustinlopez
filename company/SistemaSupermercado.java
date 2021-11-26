package com.company;

import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SistemaSupermercado implements SistemaDeVentas{
    public String nombre;
    public HashSet<ProductoDeSuper> disponiblesParaVenta;
    public ArrayList<ProductoDeSuper> vendidosOrdenados;

    public SistemaSupermercado(String nombre, HashSet<ProductoDeSuper> disponiblesParaVenta, ArrayList<ProductoDeSuper> vendidosOrdenados) {
        this.nombre = nombre;
        this.disponiblesParaVenta = disponiblesParaVenta;
        this.vendidosOrdenados = vendidosOrdenados;
    }

    public void agregarProductoVendido(){
        Scanner prod = new Scanner(System.in);
        boolean salirWhile = false;
        while (salirWhile == false){
            salirWhile = true;
            System.out.println("Elija tipo de producto: 1_Producto Perecedero, 2_Producto No Perecedero, 3_Producto Calefaccion, 4_Producto Refrigeracion");

            try{

                int producto = prod.nextInt();
                if(producto == 1){
                    System.out.println("Ingrese nombre del producto");
                    String nombreProd = prod.nextLine();
                    System.out.println("Ingrese origen del producto");
                    String origenProd = prod.nextLine();
                    System.out.println("Ingrese codigo del producto");
                    int codigoProd = prod.nextInt();
                    System.out.println("Ingrese costo del producto");
                    float costoProd = prod.nextFloat();
                    System.out.println("Ingrese cantidad de dias para vencerse del producto");
                    int cantDiasVencimiento = prod.nextInt();
                    System.out.println("Ingrese temperatura minima del producto");
                    float tempMinimaProd = prod.nextFloat();
                    ProductoPerecedero productoPerecedero = new ProductoPerecedero(nombreProd, origenProd, codigoProd, costoProd, cantDiasVencimiento, tempMinimaProd);
                }
                else if (producto == 2){
                    System.out.println("Ingrese nombre del producto");
                    String nombreProd = prod.nextLine();
                    System.out.println("Ingrese origen del producto");
                    String origenProd = prod.nextLine();
                    System.out.println("Ingrese codigo del producto");
                    int codigoProd = prod.nextInt();
                    System.out.println("Ingrese costo del producto");
                    float costoProd = prod.nextFloat();
                    System.out.println("Ingrese cantidad de dias para vencerse del producto");
                    int cantDiasVencimiento = prod.nextInt();
                    System.out.println("Ingrese miligramo de sodio del producto");
                    float mgSodioProd = prod.nextFloat();
                    ProductoNoPerecedero productoNoPerecedero = new ProductoNoPerecedero(nombreProd, origenProd, codigoProd, costoProd, cantDiasVencimiento, mgSodioProd);
                }
                else if(producto == 3){
                    System.out.println("Ingrese nombre del producto");
                    String nombreProd = prod.nextLine();
                    System.out.println("Ingrese origen del producto");
                    String origenProd = prod.nextLine();
                    System.out.println("Ingrese codigo del producto");
                    int codigoProd = prod.nextInt();
                    System.out.println("Ingrese costo del producto");
                    float costoProd = prod.nextFloat();
                    System.out.println("Ingrese cantidad de dias de garantia del producto");
                    int cantDiasGarantia = prod.nextInt();
                    System.out.println("Ingrese watts de potencia maxima del producto");
                    float wattsPotenciaMaxProd = prod.nextFloat();
                    ProductoDeCalefaccion productoDeCalefaccion = new ProductoDeCalefaccion(nombreProd, origenProd,codigoProd,costoProd,cantDiasGarantia,wattsPotenciaMaxProd);
                }
                else if(producto == 4){
                    System.out.println("Ingrese nombre del producto");
                    String nombreProd = prod.nextLine();
                    System.out.println("Ingrese origen del producto");
                    String origenProd = prod.nextLine();
                    System.out.println("Ingrese codigo del producto");
                    int codigoProd = prod.nextInt();
                    System.out.println("Ingrese costo del producto");
                    float costoProd = prod.nextFloat();
                    System.out.println("Ingrese cantidad de dias de garantia del producto");
                    int cantDiasGarantia = prod.nextInt();
                    System.out.println("Ingrese litros de capacidad del producto");
                    float litrosCapacidadProd = prod.nextFloat();
                    ProductoDeRefrigeracion productoDeRefrigeracion = new ProductoDeRefrigeracion(nombreProd, origenProd, codigoProd, costoProd, cantDiasGarantia, litrosCapacidadProd);
                }
            }
            catch (InputMismatchException exception){
                salirWhile = false;
                exception.printStackTrace();
            }
        }





    }

    public static String serializar (Object objeto)  {
        ObjectMapper mapper = new ObjectMapper();
        String serializado = null;
        try {
            serializado = mapper.writeValueAsString(objeto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return serializado;
    }

    public static HashMap<String,String> deserializar(String serializado)  {
        ObjectMapper mapper = new ObjectMapper();
        HashMap deserializado = null;
        try {
            deserializado = mapper.readValue(serializado, HashMap.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return deserializado;
    }

    public HashSet<String> aptosParaHipertensos(){
        HashSet<String> aptoHiper = new HashSet<>();
        for(ProductoDeSuper producto : disponiblesParaVenta){
            if (producto.getClass().getName().equals("ProductoNoPerecedero")){
                ProductoNoPerecedero productoNoPerecedero = (ProductoNoPerecedero) producto;
                if(productoNoPerecedero.getMgDeSodio() <= 1500){
                    aptoHiper.add(productoNoPerecedero.getNombre());
                }
            }
        }
        return aptoHiper;
    }

    public HashMap<Integer, Float> productosRefrigerantesConGranCapacidad() {
        HashMap<Integer, Float> granCapacidad = new HashMap<>();
        for (ProductoDeSuper producto : disponiblesParaVenta) {
            if (producto.getClass().getName().equals("ProductoDeRefrigeracion")) {
                ProductoDeRefrigeracion productoDeRefrigeracion = (ProductoDeRefrigeracion) producto;
                if(productoDeRefrigeracion.getLitrosDeCapacidad() >= 300 && productoDeRefrigeracion.getOrigen().equals("Argentino")){
                    granCapacidad.put(productoDeRefrigeracion.getCodigo(), productoDeRefrigeracion.getLitrosDeCapacidad());
                }

            }
        }
        return granCapacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<ProductoDeSuper> getDisponiblesParaVenta() {
        return disponiblesParaVenta;
    }

    public ArrayList<ProductoDeSuper> getVendidosOrdenados() {
        return vendidosOrdenados;
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
