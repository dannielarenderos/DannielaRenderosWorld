/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author Danniela Renderos
 */
public class DirectorR {

    public Recursos getRecurso(String tipo, int vida, int fase, int costo) {
        return new Recursos.Builder(tipo, vida, fase, costo).build();
    }

}
