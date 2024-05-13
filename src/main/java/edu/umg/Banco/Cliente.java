package edu.umg.Banco;

import java.util.Random;

public class Cliente {
     private String nombre;

     private int tiempoAtención; //tiempo en minutos que tomara atneder al cliente

    //Constructor, obtiene el nombre del cliente y genera un numero aleatorio
    public  Cliente(String nombre){
        this.nombre = nombre;
        Random rand = new Random();
        this.tiempoAtención = rand.nextInt(10)+1;
    }

    public String getNombre(){return nombre;}

    public int getTiempoAtención(){return tiempoAtención;}

    @Override
    public String toString(){
        return "CLiente {nobre="+nombre+",tiempo Antención="+tiempoAtención+"minutos}";
    }

}
