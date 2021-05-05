package com.company;

import java.util.Scanner;

public class Main{



    public static void main(String[] args) {

        Scanner dataTypeIngresar = new Scanner(System.in);
        Scanner datoIntIngresar = new Scanner(System.in);
        Scanner datoStringIngresar = new Scanner(System.in);
        Scanner ingN = new Scanner(System.in);
        Scanner ingE = new Scanner(System.in);
        Scanner ingT = new Scanner(System.in);
        Scanner ingD = new Scanner(System.in);
        Scanner ingDi = new Scanner(System.in);




        System.out.println("Ingrese un nombre");
        String Ingreso1 = ingN.nextLine();

        System.out.println("Ingrese una edad");
        int Ingreso2 = ingE.nextInt();

        System.out.println("Ingrese un DNI");
        int Ingreso3 = ingT.nextInt();

        System.out.println("Ingrese un telefono");
        int Ingreso4 = ingD.nextInt();

        System.out.println("Ingrese una Direccion");
        String Ingreso5 = ingDi.nextLine();


        Persona2 personNew = new Persona2(Ingreso1,Ingreso2,Ingreso3,Ingreso4,Ingreso5);
        System.out.println(personNew);

        String n = personNew.getNombre();
        System.out.println(n);
        int e = personNew.getEdad();
        System.out.println(e);
        int t = personNew.getTelefono();
        System.out.println(t);
        int d = personNew.getDni();
        System.out.println(d);
        String di = personNew.getDireccion();
        System.out.println(di);



        System.out.println("Ingrese el tipo de dato a cambiar");
        String dataTypeIngresado = dataTypeIngresar.nextLine();

        if (dataTypeIngresado == "edad"){
            System.out.println("Ingrese el nuevo dato int");
            int datoIntIngresado = datoIntIngresar.nextInt();
            String dataType = dataTypeIngresado;
            int datoInt = datoIntIngresado;
            personNew.setDatoInt(dataType, datoInt);

        }

        else if (dataTypeIngresado.equals("Telefono")){
            System.out.println("Ingrese el nuevo dato int");
            int datoIntIngresado = datoIntIngresar.nextInt();
            String dataType = dataTypeIngresado;
            int datoInt = datoIntIngresado;
            personNew.setDatoInt(dataType, datoInt);
            t = personNew.getTelefono();
            System.out.println(t);
        }

        else if (dataTypeIngresado == "Dni"){
            System.out.println("Ingrese el nuevo dato int");
            int datoIntIngresado = datoIntIngresar.nextInt();
            String dataType = dataTypeIngresado;
            int datoInt = datoIntIngresado;
            personNew.setDatoInt(dataType, datoInt);

        }


            else if (dataTypeIngresado == "nombre"){
                System.out.println("Ingrese el nuevo dato string");
                String datoStringIngresado = datoStringIngresar.nextLine();
                String dataType = dataTypeIngresado;
                String datoString = datoStringIngresado;
                personNew.setDatoString(dataType,datoString);
            }

            else if (dataTypeIngresado == "Direccion"){
                System.out.println("Ingrese el nuevo dato string");
                String datoStringIngresado = datoStringIngresar.nextLine();
                String dataType = dataTypeIngresado;
                String datoString = datoStringIngresado;
                personNew.setDatoString(dataType,datoString);

            }





    }

}