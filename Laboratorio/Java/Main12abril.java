package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner ingreso1 = new Scanner(System.in);
        Scanner ingreso2 = new Scanner(System.in);
        Scanner ingreso3 = new Scanner(System.in);
        Scanner ingreso4 = new Scanner(System.in);
        Scanner ingreso5 = new Scanner(System.in);
        Scanner tipoDeDatoAIngresar = new Scanner(System.in);
        Scanner nuevoDatoIntAIngresar = new Scanner(System.in);
        Scanner nuevoDatoStringAIngresar = new Scanner(System.in);

        System.out.println("Ingrese un nombre");
        String textoIngresado1 = ingreso1.nextLine();

        System.out.println("Ingrese una edad");
        int textoIngresado2 = ingreso2.nextInt();

        System.out.println("Ingrese un DNI");
        int textoIngresado3 = ingreso3.nextInt();

        System.out.println("Ingrese un telefono");
        int textoIngresado4 = ingreso4.nextInt();

        System.out.println("Ingrese una Direccion");
        String textoIngresado5 = ingreso5.nextLine();

        System.out.println("----------------------------------------------------");

        Persona personaCreada = new Persona(textoIngresado1,textoIngresado2,textoIngresado3,textoIngresado4,textoIngresado5);
        System.out.println(personaCreada);

        String n = personaCreada.getNombre(); //obtengo los atributos de personaCreada
        int e = personaCreada.getEdad();
        int d = personaCreada.getDni();
        int t = personaCreada.getTelefono();
        String drc = personaCreada.getDireccion();
        System.out.println(n); //imprimo todos los atributos de personaCreada
        System.out.println(e);
        System.out.println(d);
        System.out.println(t);
        System.out.println(drc);


        System.out.println("Ingrese El tipo de dato, el nuevo dato int y el nuevo dato String, que desea cambiar");

        System.out.println("Ingrese el tipo de dato a cambiar");
        String tipoDeDatoIngresado = tipoDeDatoAIngresar.nextLine();

        System.out.println("Ingrese el nuevo dato int");
        int nuevoDatoIntIngresado = nuevoDatoIntAIngresar.nextInt();

        System.out.println("Ingrese el nuevo dato string");
        String nuevoDatoStringIngresado = nuevoDatoStringAIngresar.nextLine();


        String tipoDeDato = tipoDeDatoIngresado;
        int nuevoDatoInt = nuevoDatoIntIngresado;
        String nuevoDatoString = nuevoDatoStringIngresado;


        //String tipoDeDato = "nombre";
        //int nuevoDatoInt = 17;
        //String nuevoDatoString = "Tiago";

        personaCreada.setDato(tipoDeDato,nuevoDatoInt,nuevoDatoString);

        //personaCreada.setDato("nombre", 0, "Jose");

    }

}