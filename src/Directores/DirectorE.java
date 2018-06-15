/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Directores;

import Builders.Edificaciones;

/**
 *
 * @author Danniela Renderos
 */
public class DirectorE {

    public Edificaciones getEdificio(String tipo, int vida, int fase, int costor1, int costor2) {
        return new Edificaciones.Builder(tipo, vida, fase, costor1, costor2).build();
    }

}
