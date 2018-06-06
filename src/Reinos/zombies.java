/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reinos;

import Edificaciones.DirectorE;
import Milicia.DirectorM;
import Vehiculos.DirectorV;
import Vehiculos.Vehiculo;

/**
 *
 * @author UCA
 */
public class zombies implements Reino {

    @Override
    public void crear() {
        DirectorV veh = new DirectorV();
        DirectorM mil = new DirectorM();
        DirectorE edi = new DirectorE();
        Vehiculo tan = veh.getVehiculo("Tanque", 100, 50, 1, 200);
        System.out.println(tan.toString());

    }

}
