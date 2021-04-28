package com.company;

public class Persona {
    private String nombre, direccion;
    private int edad, dni, telefono;

    public Persona() {
        nombre ="Jose";
        edad = 35;
        dni = 40768211;
        direccion = "Cuenca 556";
        telefono = 1145648999;
    }

    public Persona(String nuevoNombre){
        nombre = nuevoNombre;
        edad = 35;
        dni = 40768211;
        direccion = "Cuenca 556";
        telefono = 1145648999;
    }

    public Persona(String nuevoNombre, int nuevaEdad, int nuevoDni,int nuevoTelefono,String nuevaDireccion){
        nombre = nuevoNombre;
        edad = nuevaEdad;
        dni = nuevoDni;
        telefono = nuevoTelefono;
        direccion = nuevaDireccion;

    }

    public boolean esMayorDeEdad(int nuevaEdad){
        if (nuevaEdad>18){
            return true;
        }
        return false;
    }

    public boolean sonLaMismaPersona(int dniCopiado1, int dniCopiado2){
        if(dniCopiado1==dniCopiado2){
            return true;
        }
        return false;
    }

    public boolean tienenLaMismaEdad(int edad1,int edad2){
        if(edad1==edad2){
            return true;
        }
        return false;
    }




    // GETTERS Y SETTERS

    String getNombre(){
        return nombre;
    }

    public void SetNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    public int getDni(){
        return dni;
    }

    public void setDni(int nuevoDni){
        dni = nuevoDni;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setTelefono(int nuevoTelefono){
        telefono = nuevoTelefono;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String nuevaDireccion){
        direccion = nuevaDireccion;
    }

    public boolean sonLaMismaPersona(Persona p2) {
        return false;
    }



    public void setDato(String tipoDeDato, int nuevoDatoInt, String nuevoDatoString){ //metodo <--- funciones
        if (tipoDeDato == "nombre"){
            nombre = nuevoDatoString;
        }

        if (tipoDeDato == "edad"){
            edad = nuevoDatoInt;
        }

        if (tipoDeDato == "dni"){
            dni = nuevoDatoInt;
        }

        if (tipoDeDato == "telefono"){
            telefono = nuevoDatoInt;
        }

        if (tipoDeDato == "direccion"){
            direccion = nuevoDatoString;
        }
    }
}