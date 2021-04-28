package com.company;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona(){
        nombre = "Roberto";
        edad = 37;
        dni = 41345789;
        telefono = 1123567890;
        direccion = "Constituyentes 5234";
    }

    public Persona(String NuevoNombre){
        nombre=NuevoNombre;
        edad = 37;
        dni = 41345789;
        telefono = 1123567890;
        direccion = "Constituyentes 5234";
    }
    public Persona(String newNombre, int newEdad, int newDni, int newTelefono, String newDireccion){
        nombre = newNombre;
        edad = newEdad;
        dni = newDni;
        telefono = newTelefono;
        direccion = newDireccion;
    }



    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getDni(){
        return dni;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public void setEdad(int nuevaEdad){
        edad=nuevaEdad;
    }
    public void setDni(int nuevoDni){
        dni=nuevoDni;
    }
    public void setTelefono(int nuevoTelefono){
        telefono=nuevoTelefono;
    }
    public void setDireccion(String nuevaDireccion){
        direccion=nuevaDireccion;
    }

    public boolean esMayorDeEdad (){
        return edad>17;
    }
    public boolean sonLaMismaPersona(int dnin, int dnin2) {
        if(dnin==dnin2){
            return true;
        }
        return false;
    }

    public boolean tienenLaMismaEdad(int edadn, int edadn2){
        return edadn == edadn2;
    }

}