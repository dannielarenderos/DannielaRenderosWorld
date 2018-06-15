/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Directores;

import CentroMando.CentroMando;


/**
 *
 * @author Danniela Renderos
 */
public class DirectorC {

    public CentroMando getCentro( int vida) {
        return new CentroMando.Builder( vida).build();
    }

}
