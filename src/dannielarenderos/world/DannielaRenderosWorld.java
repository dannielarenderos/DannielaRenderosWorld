/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dannielarenderos.world;

import Directores.DirectorE;
import Builders.Edificaciones;
import Game.JugarJ1;
import Directores.DirectorM;
import Builders.Milicia;
import Directores.DirectorV;
import Builders.Vehiculo;
import static Game.JugarJ1.FaseGlobal;
import static Game.JugarJ1.faseJ1;
import Game.JugarJ2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danniela Renderos
 */
public class DannielaRenderosWorld {
   public static boolean Juego = true;        

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                System.out.println(" ELEGIR RAZA ");
                System.out.println(" 1 SAVAGES ");
                System.out.println(" 2 DAUNTLESS ");
                System.out.println(" 3 REBELS");
                                System.out.println("  ");
                System.out.println(" JUGADOR 1, ELIJA SU RAZA");
                    int razaJ1, razaJ2;
                razaJ1 = leer.nextInt();
                
                System.out.println(" JUGADOR 2, ELIJA SU RAZA");
                razaJ2 = leer.nextInt();
                                                System.out.println("  ");

JugarJ1 ju1= new JugarJ1();
JugarJ2 ju2= new JugarJ2();

while (Juego){
                System.out.println(" TURNO JUGADOR 1");
                                System.out.println("  ");

ju1.Juego(razaJ1);
                System.out.println(" ");

                System.out.println(" TURNO JUGADOR 2");
                                System.out.println("  ");

ju2.Juego(razaJ2);

}
                      
    }

    }


