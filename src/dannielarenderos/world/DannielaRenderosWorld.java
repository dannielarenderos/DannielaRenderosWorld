/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dannielarenderos.world;

import Milicia.DirectorM;
import Milicia.Milicia;
import Vehiculos.DirectorV;
import Vehiculos.Vehiculo;

/**
 *
 * @author Danniela Renderos
 */
public class DannielaRenderosWorld {


    public static void main(String[] args) {
        DirectorV veh = new DirectorV();
        DirectorM mil = new DirectorM();
        Vehiculo tan = veh.getTanque("Tanque",100, 50,1);
        Vehiculo aero = veh.getAeroplano("Aeroplano", 150, 75, 2);
        Milicia esc = mil.getEscuadrones("Escuadrones",100,25,2);
        Milicia esp = mil.getEspecialista("Especialista",100,50,2);
        System.out.println(tan.toString());
        System.out.println(aero.toString());
    }
}


  
 

    

