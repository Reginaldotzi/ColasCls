package edu.umg.Banco;

import java.util.LinkedList;
import java.util.Queue;

public class ColaBanco {

    private Queue<Cliente> filaClientes;
    private int capacidadMaxima;

    public ColaBanco(int MaxCapacity){
        this.filaClientes = new LinkedList<>();
        this.capacidadMaxima =  MaxCapacity;
    }

    public void agregarCliente(Cliente cliente){
        if (filaClientes.size()<capacidadMaxima){
            filaClientes.offer(cliente); //un nuevo cliente entró en la agencia
            System.out.println("Cliente "+cliente.getNombre()+"se ha unido a la fila");
        } else {
            System.out.println("lo lamento la fila está llena, vaya a la calle");
        }
    }

public Cliente atenderSiguienteCliente(){
        if(!filaClientes.isEmpty()){ //verifica que la cola no esté vacia
            Cliente clienteAtendido = filaClientes.poll(); //elimina y retorna el nombre del cliente
            System.out.println("Cliente: "+clienteAtendido.getNombre()+" fue atendido");
            return clienteAtendido; //retorna el nombre del cliente
        } else {
            System.out.println("no hay mara en la fila");
            return null;
        }
}

        public int cantidadClientesEnFila(){
        return filaClientes.size();

        }

}
