/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_02;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Sandy
 */
public class Mecanico implements Observer
{
    private String nombre;
    private int legajo;
    private boolean isWorking;

    public Mecanico(String nombre, int legajo, boolean isWorking)
    {
        this.nombre = nombre;
        this.legajo = legajo;
        this.isWorking = isWorking;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getLegajo()
    {
        return legajo;
    }

    public void setLegajo(int legajo)
    {
        this.legajo = legajo;
    }

    public boolean isIsWorking()
    {
        return isWorking;
    }

    public void setIsWorking(boolean isWorking)
    {
        this.isWorking = isWorking;
    }

    @Override
    public void update(Observable o, Object arg) {
        String sensor = new String();
        int oldValue = 0;
        int newValue = 0;
        if (arg instanceof HashMap)
        {
            HashMap results = (HashMap) arg;
            sensor = (String) results.get("sensor");
            oldValue = (int) results.get("oldValue");
            newValue = (int) results.get("newValue");
        }
        
        System.out.println("Modificaron el "+sensor+", paso de tener en "+oldValue+" a "+newValue);
        
    }
    
    
}
