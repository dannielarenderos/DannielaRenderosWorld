/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dannielarenderos.world;

import Edificaciones.DirectorE;
import Edificaciones.Edificaciones;
import Milicia.DirectorM;
import Milicia.Milicia;
import Reinos.Reino;
import Reinos.ReinoFactory;
import Vehiculos.DirectorV;
import Vehiculos.Vehiculo;

/**
 *
 * @author Danniela Renderos
 */
public class DannielaRenderosWorld {

    public static void main(String[] args) {
        
        Reino zombie = ReinoFactory.getReino(1);
        zombie.crear();
    }}
//        // create a big dog
//        dog = DogFactory.getDog(DogType.BIG);
//        dog.speak();
//
//        // create a working dog
//        dog = DogFactory.getDog(DogType.WORKING);
//        dog.speak();
//    }
//}
//String n = rec3.getTipo();
//        System.out.println(n);
//                System.out.println(rec3.getFase());
//        System.out.println(n);
//
//        System.out.println(tan.toString());
//        System.out.println(aero.toString());
//        System.out.println(esc.toString());
//        System.out.println(esp.toString());
//        System.out.println(rec1.toString());
//        System.out.println(rec2.toString());
//        System.out.println(rec3.toString());
