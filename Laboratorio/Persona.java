package com.company;
public class Persona2 {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona2(){
        nombre = "Alberto";
        edad = 37;
        dni = 45000001;
        telefono = 45463536;
        direccion = "Constituyentes 5786";
    }

    public Persona2(String nuevoNombre){
        nombre = nuevoNombre;
        edad = 12;
        dni= 45000002;
        telefono= 44463536;
        direccion= "Casita";
    }
    public Persona2(String newNombre, int newEdad, int newDni, int newTelefono, String newDireccion){
        nombre = newNombre;
        edad = newEdad;
        dni = newDni;
        telefono = newTelefono;
        direccion = newDireccion;
    }



    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
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
        edad = nuevaEdad;
    }

    public void setDni(int nuevoDni){
        dni = nuevoDni;
    }

    public void setTelefono(int nuevoTelefono){
        telefono = nuevoTelefono;
    }

    public void setDireccion(String nuevaDireccion){
        direccion = nuevaDireccion;
    }

    public boolean esMayorDeEdad (){
        if (edad > 17){
            return true;
        }
        return false;
    }
    public boolean sonLaMismaPersona(Persona2 person) {
        return person.nombre == nombre && person.edad == edad && person.dni == dni && person.telefono == telefono && person.direccion == direccion;
    }
    public boolean tienenLaMismaEdad(int edad1, int edad2){
        if (edad1 == edad2){
            return true;
        }
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
