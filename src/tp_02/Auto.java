/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_02;

import java.util.HashMap;
import java.util.Observable;

/**
 *
 * @author Sandy
 */
public class Auto extends Observable
{
    private String marca;
    private HashMap a;
    private String modelo;
    private int cantPuertas;
    private String status;
    private int oilIndicator;
    private int waterIndicator;
    private int tyrePressure;

    public Auto(String marca, String modelo, int cantPuertas)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.cantPuertas = cantPuertas;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public int getCantPuertas()
    {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas)
    {
        this.cantPuertas = cantPuertas;
    }

    public int getOilIndicator()
    {
        return oilIndicator;
    }

    public void setOilIndicator(int oilIndicator){
        int oldInd = this.oilIndicator;
        this.oilIndicator = oilIndicator;
        this.a = aDevolver("aceite",oldInd,this.oilIndicator);
        setChanged();
        notifyObservers(a);
    }

    public int getWaterIndicator()
    {
        return waterIndicator;
    }

    public void setWaterIndicator(int waterIndicator){
        int oldWat = this.waterIndicator;
        this.waterIndicator = waterIndicator;
        this.a = aDevolver("agua",oldWat,this.waterIndicator);
        setChanged();
        notifyObservers(a);
    }

    public int getTyrePressure()
    {
        return tyrePressure;
    }

    public void setTyrePressure(int tyrePressure){
        int oldTyr = this.tyrePressure;
        this.tyrePressure = tyrePressure;
        this.a = aDevolver("aire",oldTyr,this.tyrePressure);
        setChanged();
        notifyObservers(a);
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    private HashMap aDevolver(String sensor, int viejo, int nuevo){
        HashMap b = new HashMap();
        b.put("sensor", sensor);
        b.put("oldValue", viejo);
        b.put("newValue", nuevo);
        return b;
    }
}
