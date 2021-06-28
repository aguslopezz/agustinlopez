package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main31DeMayo {
    public static void main(String args[]) {
        Scanner StringReciver = new Scanner(System.in);
        Scanner intReciver = new Scanner(System.in);
        ArrayList<Libro>vendidos = new ArrayList<>();
        HashMap<String,Integer> editorialProfit = new HashMap<>();
        editorialProfit.put("Kapelusz", 0);
        editorialProfit.put("Sudamericana", 0);
        editorialProfit.put("Atlántida", 0);
        editorialProfit.put("ElAteneo", 0);
        editorialProfit.put("Interzona", 0);
        editorialProfit.put("Sur", 0);
        editorialProfit.put("Alianza", 0);

        String res;
        int i=0;
        int profitAgregado;
        String tempNombre;
        int tempPrecio;
        int tempCantidad;
        String tempEditorial;
        int tempIdCliente;
        ArrayList<Object> info = new ArrayList<Object>();
        HashMap<Integer, ArrayList<Object>> ventas = new HashMap();
        ArrayList<Object> tempArray =new ArrayList<Object>();
        HashSet<Cliente> clientes= new HashSet<>();

        boolean salida= false;
        while(!salida){
            tempArray.clear();
            System.out.print("Ingrese su id de cliente");
            tempIdCliente= intReciver.nextInt();
            System.out.print("Ingrese nombre, precio, editorial del libro y la cantidad a comprar");

            tempNombre= StringReciver.nextLine();
            tempPrecio= intReciver.nextInt();
            tempEditorial= StringReciver.nextLine();
            tempCantidad= intReciver.nextInt();
            Libro tempLibro = new Libro(tempNombre, tempPrecio, tempEditorial);
            vendidos.add(i,tempLibro);

            profitAgregado= editorialProfit.get(tempEditorial) + tempPrecio;
            editorialProfit.put(tempEditorial, profitAgregado);

            HashMap<String,Integer> tempHash= new HashMap<String,Integer>();
            tempHash.put(tempNombre, tempCantidad);
            Cliente tempCliente=new Cliente(tempIdCliente,tempHash);
            clientes.add(tempCliente);


            tempArray.add(tempIdCliente);
            tempArray.add(tempLibro);
            tempArray.add(tempCantidad);
            tempArray.add(tempPrecio);
            ventas.put(i,tempArray);

            System.out.println("Desea comprar otro libro");
            res = StringReciver.nextLine();
            i=+1;
            if (res.equals("no")){salida=true;}
        }
    }
}