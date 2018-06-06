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
    
    public Vehiculo getVehiculo(String tipo, int vida, int danio, int fase, int costo)
    {
        return new Vehiculo.Builder(tipo,vida,danio,fase, costo).build();
    }
    

}
