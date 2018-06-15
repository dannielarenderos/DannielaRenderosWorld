/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Directores;

import Builders.Milicia;


/**
 *
 * @author Danniela Renderos
 */
public class DirectorM {
    
    public Milicia getMilicia(String tipo, int vida, int fase, int danio, int costor1, int costor2) {
        return new Milicia.Builder(tipo, vida,danio, fase, costor1, costor2).build();
    }
    
    

}
