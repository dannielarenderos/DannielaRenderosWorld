/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

/**
 *
 * @author Danniela Renderos
 */
public class DirectorE {

    public Edificaciones getRecurso(String tipo, int vida, int fase, int costo) {
        return new Edificaciones.Builder(tipo, vida, fase, costo).build();
    }

}
