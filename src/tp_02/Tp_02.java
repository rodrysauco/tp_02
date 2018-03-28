/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_02;

/**
 *
 * @author Sandy
 */
public class Tp_02
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Auto a = new Auto("Fiat","Palio",2);
        Mecanico carlos = new Mecanico("Carlos",23,true);
        a.addObserver(carlos);
        System.out.println("Auto :"+a.getMarca()+", "+a.getModelo());
        System.out.println("Mecanico: "+carlos.getNombre());
        a.setOilIndicator(30);
        a.setWaterIndicator(20);
        a.setWaterIndicator(11);
        a.setTyrePressure(25);
        a.setTyrePressure(10);
        
        
    }
    
}
