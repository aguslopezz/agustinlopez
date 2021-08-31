package com.company;

public class Persona {
    public String nombre;
    public String apellido;
    public Integer edad;
    public Integer dni;


    public Persona() {
        this.nombre = "X";
        this.apellido = "Y";
        this.edad = 17;
        this.dni = 45678901;
    }

    public Integer getDni(){
        return dni;
    }

    public Integer getEdad(){
        return edad;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setDni(Integer dni){
        this.dni = dni;
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }

}
