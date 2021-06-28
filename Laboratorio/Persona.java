package com.company;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona(){
        nombre="Dababy";
        edad=25;
        dni= 42978123;
        telefono= 45741923;
        direccion= "Constituyentes 5238";
    }

    public Persona(String NuevoNombre){
        nombre=NuevoNombre;
        edad = 17;
        dni= 45190234;
        telefono= 45221294;
        direccion= "Ibera 2345";
    }
    public Persona(String nnombre, int nnuevaedad, int ndni, int ntelefono, String ndireccion){
        nombre=nnombre;
        edad=nnuevaedad;
        dni= ndni;
        telefono= ntelefono;
        direccion= ndireccion;
    }



    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
    public int getDni(){return dni;}
    public int getTelefono(){return telefono;}
    public String getDireccion(){return direccion; }

    public void setNombre(String nuevoNombre){ nombre=nuevoNombre; }
    public void setEdad(int nuevaEdad){edad=nuevaEdad;}
    public void setDni(int nuevoDni){dni=nuevoDni;}
    public void setTelefono(int nuevoTelefono){telefono=nuevoTelefono;}
    public void setDireccion(String nuevaDireccion){direccion=nuevaDireccion;}

    public boolean esMayorDeEdad (){
        return edad>17;
    }
    public boolean sonLaMismaPersona(Persona pers) {
        return pers.nombre == nombre && pers.edad == edad && pers.dni == dni && pers.telefono == telefono && pers.direccion == direccion;
    }
    public boolean tienenLaMismaEdad(int compEdad){
        return compEdad==edad;
    }

}