/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;


/**
 *
 * @author Danniela Renderos
 */
public class DirectorM {
    
    public Milicia getMilicia(String tipo, int vida, int danio, int fase, int costo)
    {
        return new Milicia.Builder(tipo,vida,danio,fase, costo).build();
    }
    
    

}
