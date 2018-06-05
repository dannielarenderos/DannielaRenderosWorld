/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Danniela Renderos
 */
public class DirectorV {
    
    public Vehiculo getTanque(String tipo, int vida, int danio, int fase)
    {
        return new Vehiculo.Builder(tipo,vida,danio,fase).build();
    }
    
     public Vehiculo getAeroplano(String tipo, int vida, int danio, int fase)
    {
        return new Vehiculo.Builder(tipo,vida,danio,fase).build();
    }

}
