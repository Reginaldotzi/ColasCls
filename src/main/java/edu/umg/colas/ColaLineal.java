package edu.umg.colas;

public class ColaLineal
{
    private static final int MAXTAMQ = 39;
    protected int frente;
    protected int fin;
    protected Object[] listaCola;

    public ColaLineal()
    {
        frente = 0;
        fin = -1;
        listaCola = new Object[MAXTAMQ];
    }

    //Verifica si la cola esta vacia
    public boolean colaVacia()
    {
        return frente > fin;
    }
    //Verifica si la cola esta llena
    public boolean colaLlena()
    {
        return fin == MAXTAMQ - 1;
    }

    //insertar
    public void insertar(Object elemento) throws Exception
    {
        if(!colaLlena())
        {
            listaCola[++fin] = elemento;
        }
        else
        {
            throw new Exception("Overflow en la cola");
        }
    }

    public Object quitar() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente++];
        }
        else
        {
            throw new Exception("Cola vacía");
        }
    }
    //Borra la cola
    public void borrarCola()
    {
        frente = 0;
        fin = -1;
    }


    public Object frenteCola() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente];
        }
        else
        {
            throw new Exception("Cola vacía");
        }
    }

}