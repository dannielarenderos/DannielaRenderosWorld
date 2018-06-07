/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reinos;

import CentroMando.CentroMando;
import CentroMando.DirectorC;
import Edificaciones.DirectorE;
import Milicia.DirectorM;
import Recursos.DirectorR;
import Recursos.Recursos;
import Vehiculos.DirectorV;
import Vehiculos.Vehiculo;

/**
 *
 * @author Danniela Renderos
 */
public class raza0ta implements Reino {

    @Override
    public void crear() {
        DirectorV veh = new DirectorV();
        DirectorM mil = new DirectorM();
        DirectorE edi = new DirectorE();
        DirectorC cen = new DirectorC();
        DirectorR rec = new DirectorR();

        CentroMando centro = cen.getCentro(200);
        Recursos r1 = rec.getRecurso("oro", 100, 2, 0);
        Recursos r2 = rec.getRecurso("plata", 100, 2, 0);
        Recursos r3 = rec.getRecurso("energía electrica", 100, 2, 0);

        System.out.println("INFORMACIÓN RAZA JUGADOR ");
        System.out.println();
        System.out.println(centro.toString());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println();

    
    }
}

