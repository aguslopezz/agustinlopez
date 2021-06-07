package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {
    private ArrayList<Persona> personas = new ArrayList<Persona>();
    private Scanner getString = new Scanner(System.in);
    private Scanner getInt = new Scanner(System.in);
    private String objetivo = "";

    public void IniciarRegistro() {
        boolean salir = false;
        while (!salir) {
            System.out.println("Indique accion a realizar (A, B, M, mayor, lista)");
            String respuesta = getString.nextLine();
            if (respuesta == "A") {
                Persona nuevaPersona = new Persona();
                System.out.println("Ingrese info de la nueva persona");

                String nuevoNombre = getString.nextLine();
                int nuevaEdad = getInt.nextInt();
                int nuevoDni = getInt.nextInt();
                int nuevoTelefono = getInt.nextInt();
                String nuevaDireccion = getString.nextLine();

                nuevaPersona.setNombre(nuevoNombre);
                nuevaPersona.setEdad(nuevaEdad);
                nuevaPersona.setDni(nuevoDni);
                nuevaPersona.setTelefono(nuevoTelefono);
                nuevaPersona.setDireccion(nuevaDireccion);

                personas.add(nuevaPersona);
            } else if (respuesta == "B") {
                System.out.println("Ingrese dni del individuo a eliminar");
                objetivo = getString.nextLine();
                personas.removeIf(dni -> dni.equals(objetivo));
            } else if (respuesta == "M") {
                System.out.println("Ingrese el dato a modificar y el dni de quien desee cambiar");
                String datoM = getString.nextLine();
                int dniCambiar = getInt.nextInt();

                for (int i = 0; i >= personas.size(); i++) {
                    Persona aux = new Persona();
                    aux = personas.get(i);
                    if (aux.getDni() == dniCambiar) {
                        if (datoM.equals("nombre")) {
                            System.out.println("Ingrese el valor con el que reemplazar");
                            String nuevoNombre = getString.nextLine();
                            personas.get(i).setNombre(nuevoNombre);
                        } else if (datoM.equals("edad")) {
                            System.out.println("Ingrese el valor con el que reemplazar");
                            int nuevaEdad = getInt.nextInt();
                            personas.get(i).setEdad(nuevaEdad);
                        } else if (datoM.equals("dni")) {
                            System.out.println("Ingrese el valor con el que reemplazar");
                            int nuevoDni = getInt.nextInt();
                            personas.get(i).setDni(nuevoDni);
                        } else if (datoM.equals("edad")) {
                            System.out.println("Ingrese el valor con el que reemplazar");
                            int nuevaEdad = getInt.nextInt();
                            personas.get(i).setEdad(nuevaEdad);
                        } else if (datoM.equals("telefono")) {
                            System.out.println("Ingrese el valor con el que reemplazar");
                            int nuevoTelefono = getInt.nextInt();
                            personas.get(i).setTelefono(nuevoTelefono);
                        } else if (datoM.equals("direccion")) {
                            System.out.println("Ingrese el valor con el que reemplazar");
                            String nuevaDireccion = getString.nextLine();
                            personas.get(i).setDireccion(nuevaDireccion);
                        }
                    }
                }
            } else if (respuesta == "mayor") {
                for (int i = 0; i >= personas.size(); i++) {
                    int edadComp = personas.get(i).getEdad();
                    if (edadComp >= 18) {
                        System.out.println(personas.get(i).getNombre());
                    }
                }
            } else if (respuesta == "lista") {
                for (int i = 0; i >= personas.size(); i++) {
                    System.out.println(personas.get(i));
                }
            }
            System.out.println("Desea salir?");
            String res = getString.nextLine();
            if (res.equals("si")){
                salir = true;
            }
        }
    }
}



























