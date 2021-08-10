package com.company;
import java.util.ArrayList;

public class tarjetaEquis {
    public float saldo;
    public float saldoNegativoMaximo;
    public float numeroId;
    public ArrayList<Viaje> Viajes;


    public tarjetaEquis(){
        this.saldo = 100f;
        this.saldoNegativoMaximo = (-60f);
        this.numeroId = 12;
        Viajes = new ArrayList<>();
    }



    public float getSaldo(){

        return saldo;
    }
    public void cargarSube(float monto){

        saldo = saldo + monto;
    }

    public void realizarViaje(Viaje Viaje){
        float x = (saldo - Viaje.precio);
        Viajes.add(Viaje);
    }

    public tarjetaEquis ultimoMontoAbonado(){
        Viajes.get(Viajes.size()-1);

         return null;
    }


    float getNumeroId() {
        return numeroId;
    }

    float getSaldoNegativoMaximo(){
        return saldoNegativoMaximo;
    }


}