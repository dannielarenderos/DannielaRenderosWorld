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
import java.util.Scanner;

/**
 *
 * @author Danniela Renderos
 */
public class DannielaRenderosWorld {

   
    
 public static void Menu() {
        System.out.println("1. CREAR EDIFICACIONES ");
        System.out.println("2. CREAR MILICIA ");
        System.out.println("3. CREAR VEHÍCULOS ");
        System.out.println("4. ATACAR ");
        System.out.println("5. SALIR");
    }
     
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println(" BIENVENIDOS A 'WORLD WAR' ");
        System.out.println("RAZAS A ESCOGER: ");
        System.out.println(" 1");
        System.out.println(" 2");
        System.out.println(" 3");
        System.out.println(" JUGADOR 1, ELIJA UNA RAZA");
        int j1 = leer.nextInt();
        System.out.println(" JUGADOR 2, ELIJA UNA RAZA");
        int j2 = leer.nextInt();
        System.out.println();


    System.out.println("-----  GAME TIME  -----");


        Reino jugador1 = ReinoFactory.getReino(j1);
        jugador1.crear();
       
        Menu();
        System.out.println();

        Reino jugador2 = ReinoFactory.getReino(j2);
        jugador2.crear();
                System.out.println();

        Menu();
    }
    
   
}
