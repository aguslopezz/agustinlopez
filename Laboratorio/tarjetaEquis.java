package com.company;
import java.util.ArrayList;

public class tarjetaEquis {
    public float saldo;
    public float saldoNegativoMaximo;
    public int numeroId;
    public ArrayList<Viaje> Viajes;

    public tarjetaEquis(){
        saldo = 74.4f;
        saldoNegativoMaximo = 60f;
        numeroId = 123456;
        Viajes = new ArrayList<>();
    }

    public float get(){

        return saldo;
    }
    public void cargarSube(float monto){

        saldo = saldo + monto;
    }

    public void realizarViaje(Viaje Viaje){
        float x = (saldo - Viaje.precio);
        Viajes.add(Viaje);
    }

    public void ultimoMontoAbonado(){
        Viajes.get(Viajes.size()-1);

    }


}
