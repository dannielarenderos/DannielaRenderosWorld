/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Builders.Edificaciones;
import CentroMando.CentroMando;
import Directores.DirectorC;
import Directores.DirectorE;
import Directores.DirectorM;
import Builders.Milicia;
import Builders.Milicia;

import Directores.DirectorV;
import Builders.Vehiculo;
import Builders.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danniela Renderos
 */
public class JugarJ2 {

    public static int FaseGlobal = 0,
            faseJ1 = 0, faseJ2 = 0, Rec1J2 = 100, Rec2J2 = 100;

    public static ArrayList<ArrayList<String>> ListaEdi2 = new ArrayList();
    public static ArrayList<ArrayList<String>> ListaEdVehiculoT1J2 = new ArrayList();
    public static ArrayList<ArrayList<String>> ListaEdVehiculoT2J2 = new ArrayList();
    public static ArrayList<ArrayList<String>> ListaEdRecursosT1J2 = new ArrayList();
        public static ArrayList<ArrayList<String>> ListaEdRecursosT2J2 = new ArrayList();

    public static ArrayList<ArrayList<String>> ListaEdRecursosT3J2 = new ArrayList();
    public static ArrayList<ArrayList<String>> ListaBaseMiliJ2 = new ArrayList();

    Scanner leer = new Scanner(System.in);

    public void Juego(int raza) {
        DirectorV veh = new DirectorV();
        DirectorM mil = new DirectorM();
        DirectorE edi = new DirectorE();

        int opc = 10;
        while (opc != 6) {

            System.out.println(" MENÚ ");
            System.out.println("1. CREAR EDIFICACIONES ");
            System.out.println("2. CREAR MILICIA ");
            System.out.println("3. CREAR VEHÍCULOS ");
            System.out.println("4. RECOLECTAR RECURSOS ");
            System.out.println("5. ATACAR ");
            System.out.println("6. SALIR");

            System.out.println("INGRESE EL NÚMERO DE LO QUE DESEA HACER ");
            System.out.println(" ");
            opc = leer.nextInt();

            switch (raza) {
                case 1: //RAZA 1
                    switch (opc) {
                        case 1: //EDIFICACIONES

                            System.out.println(" CREAR EDIFICACIONES ");

                            System.out.println("1. EDIFICIO VEHÍCULO 1 ");
                            System.out.println("2. EDIFICIO VEHÍCULO 2 ");
                            System.out.println("3. EDIFICIO RECURSO 1 ");
                            System.out.println("4. EDIFICIO RECURSO 2 ");
                            System.out.println("5. EDIFICIO RECURSO 3 ");
                            System.out.println("6. EDIFICIO MILICIA ");
                            System.out.println("");

                            System.out.println("ESCOJA EL EDIFICIO A CREAR");

                            int op = leer.nextInt();

                            switch (op) {
                                case 1:

                                    ArrayList EdificioV1J1 = new ArrayList();
                                    Edificaciones v1 = edi.getEdificio("Edificio de tanques", 100, 1, 30, 30);
                                    EdificioV1J1.add(v1);
                                    System.out.println("");
                                    int flag = FaseGlobal + faseJ1;

                                    Rec1J2 = Rec1J2 - v1.getCostor1();
                                    Rec2J2 = Rec2J2 - v1.getCostor2();

                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        ListaEdi2.add(EdificioV1J1);
                                        ListaEdVehiculoT1J2.add(EdificioV1J1);
                                        int ListEdif = ListaEdi2.size();
                                        int lisV1J1 = ListaEdVehiculoT1J2.size();
                                        System.out.println("NUMERO DE EDIFICIOS DE TANQUES DISPONIBLES" + lisV1J1);
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES " + ListEdif);
                                        System.out.println("NUMERO DE RECURSO 1 DISPONIBLE " + Rec1J2);
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                                case 2:

                                    ArrayList EdificioV2j1 = new ArrayList();
                                    Edificaciones v2 = edi.getEdificio(" Edificio de aviones", 100, 1, 25, 25);
                                    EdificioV2j1.add(v2);
                                    Rec1J2 = Rec1J2 - v2.getCostor1();
                                    Rec2J2 = Rec2J2 - v2.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                        ListaEdi2.add(EdificioV2j1);
                                        ListaEdVehiculoT2J2.add(EdificioV2j1);
                                        int ListEdifi = ListaEdi2.size();
                                        int lisV2J1 = ListaEdVehiculoT1J2.size();
                                        System.out.println("NUMERO DE EDIFICIOS DE AVIONES DISPONIBLES" + lisV2J1);
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListEdifi);
                                        Rec1J2 = Rec1J2 - v2.getCostor1();
                                    }
                                     else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");
                                    }
                                    break;

                                case 3:
                                    ArrayList EdificioR1j1 = new ArrayList();
                                    Edificaciones r1 = edi.getEdificio(" Edificio de oro", 100, 1, 25, 25);
                                    EdificioR1j1.add(r1);
                                    Rec1J2 = Rec1J2 - r1.getCostor1();
                                    Rec2J2 = Rec2J2 - r1.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        System.out.println("");
                                        ListaEdi2.add(EdificioR1j1);
                                        ListaEdRecursosT1J2.add(EdificioR1j1);
                                        int lisR1J1 = ListaEdRecursosT1J2.size();
                                        System.out.println("NUMERO DE EDIFICIOS DE ORO DISPONIBLES" + ListaEdi2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());

                                        System.out.println("");
                                    }
                                    else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;

                                case 4:
                                    ArrayList EdificioR2j1 = new ArrayList();
                                    Edificaciones r2 = edi.getEdificio(" Edificio de plata", 100, 1, 25, 25);
                                    EdificioR2j1.add(r2);
                                    Rec1J2 = Rec1J2 - r2.getCostor1();
                                    Rec2J2 = Rec2J2 - r2.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                        System.out.println(EdificioR2j1);
                                        System.out.println("");
                                        ListaEdi2.add(EdificioR2j1);
                                        ListaEdRecursosT2J2.add(EdificioR2j1);
                                        System.out.println("NUMERO DE EDIFICIOS DE PLATA DISPONIBLES" + ListaEdRecursosT2J2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());

                                        System.out.println("");
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                                case 5:
                                    ArrayList EdificioR3j1 = new ArrayList();
                                    Edificaciones r3 = edi.getEdificio(" Edificio de energía solar", 100, 1, 25, 25);
                                    EdificioR3j1.add(r3);
                                    Rec1J2 = Rec1J2 - r3.getCostor1();
                                    Rec2J2 = Rec2J2 - r3.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        System.out.println(EdificioR3j1);
                                        System.out.println("");
                                        ListaEdi2.add(EdificioR3j1);
                                        ListaEdRecursosT3J2.add(EdificioR3j1);
                                        System.out.println("NUMERO DE EDIFICIOS DE ENERGÍA SOLAR DISPONIBLES" + ListaEdRecursosT3J2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());
                                    }else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                                case 6:

                                    ArrayList EdificioMj1 = new ArrayList();
                                    Edificaciones basemilitar = edi.getEdificio(" Edificio base militar", 100, 1, 25, 25);
                                    Rec1J2 = Rec1J2 - basemilitar.getCostor1();
                                    Rec2J2 = Rec2J2 - basemilitar.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                        EdificioMj1.add(basemilitar);
                                        System.out.println("");
                                        ListaEdi2.add(EdificioMj1);
                                        ListaBaseMiliJ2.add(EdificioMj1);
                                        System.out.println("NUMERO DE BASES MILITARES DISPONIBLES" + ListaBaseMiliJ2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());
                                    }else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                            }

                            break;
                        case 2:

                            System.out.println(" CREAR MILICIA ");

                            System.out.println("1. CREAR SUPER SOLDADOS  ");
                            System.out.println("2. CREAR ESCUADRONES ");
                            System.out.println("");
                            System.out.println("ESCOJA LA MILICIA A CREAR");
                            int opMili = leer.nextInt();

                            if (ListaBaseMiliJ2.size() > 0) {
                                System.out.println("DISPONE DE " + ListaBaseMiliJ2.size() + " EDIFICIOS, EN CUÁL BASE MILITAR LOS DESEA INGRESAR?");
                                int meter = leer.nextInt();

                                switch (opMili) {
                                    case 1:
                                        Milicia soldado = mil.getMilicia("Súper soldado", 50, 10, 2, 30, 30);
                                        Rec1J2 = Rec1J2 - soldado.getCostor1();
                                        Rec2J2 = Rec2J2 - soldado.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                            System.out.println(ListaBaseMiliJ2.get(meter - 1).add(soldado.toString()));
                                            System.out.println(ListaBaseMiliJ2.get(meter - 1));
                                        } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                        break;
                                    case 2:
                                        Milicia escuadron = mil.getMilicia("Escuadrón", 50, 10, 2, 30, 30);
                                        Rec1J2 = Rec1J2 - escuadron.getCostor1();
                                        Rec2J2 = Rec2J2 - escuadron.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                            System.out.println(ListaBaseMiliJ2.get(meter - 1).add(escuadron.toString()));
                                            System.out.println(ListaBaseMiliJ2.get(meter - 1));
                                        }
                                        else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                        break;
                                }

                            } else {
                                System.out.println("Primero se deben de crear los edificios");
                            }

                            break;

                        case 3:
                            System.out.println(" CREAR VEHÍCULOS ");

                            System.out.println("1. CREAR TANQUE ");
                            System.out.println("2. CREAR AVIÓN ");
                            System.out.println("");
                            System.out.println("ESCOJA EL VEHÍCULO A CREAR");
                            int opVeh = leer.nextInt();

                            switch (opVeh) {
                                case 1:
                                    if (ListaEdVehiculoT1J2.size() > 0) {
                                        System.out.println("DISPONE DE " + ListaEdVehiculoT1J2.size() + " EDIFICIOS PARA TANQUES, EN CUÁL LO DESEA INGRESAR?");
                                        int meter = leer.nextInt();
                                        Vehiculo v1 = veh.getVehiculo("Tanque", 40, 10, 2, 20, 20);
                                        Rec1J2 = Rec1J2 - v1.getCostor1();
                                        Rec2J2 = Rec2J2 - v1.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                            System.out.println(ListaEdVehiculoT1J2.get(meter - 1).add(v1.toString()));
                                            System.out.println(ListaEdVehiculoT1J2.get(meter - 1));
                                        } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    } else {

                                        System.out.println("Primero se debe de crear el edificio para tanques");

                                    }
                                    break;

                                case 2:

                                    if (ListaEdVehiculoT2J2.size() > 0) {
                                        System.out.println("DISPONE DE " + ListaEdVehiculoT2J2.size() + " EDIFICIOS PARA AVIONES, EN CUÁL LO DESEA INGRESAR?");
                                        int meter = leer.nextInt();
                                        Vehiculo v2 = veh.getVehiculo("avión", 50, 10, 2, 30, 30);
                                        Rec1J2 = Rec1J2 - v2.getCostor1();
                                        Rec2J2 = Rec2J2 - v2.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                            System.out.println(ListaEdVehiculoT2J2.get(meter - 1).add(v2.toString()));
                                            System.out.println(ListaEdVehiculoT2J2.get(meter - 1));
                                        } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    } else {
                                        System.out.println("Primero se debe de crear el edificio para aviones");
                                    }

                                    break;
                            }
                            break;

                        case 4:
                            System.out.println("----RECOLECTAR RECURSOS----");
                            System.out.println(" 1. RECOLECTAR DE EDIFICIO DE RECURSOS TIPO 1");
                            System.out.println(" 2. RECOLECTAR DE EDIFICIO DE RECURSOS TIPO 2");
                            System.out.println(" INGRESE DE CUAL EDIFICIO DESEA RECOLECTAR ");
                            int recolectar;
                            recolectar = leer.nextInt();
                            switch (recolectar) {
                                case 1:
                                    if (ListaEdRecursosT1J2.isEmpty()) {
                                        System.out.println(" PRIMERO DEBE DE CREAR EDIFICIO DE ESTE RECURSO ");
                                    } else {
                                        Rec1J2 = Rec1J2 + (ListaEdRecursosT1J2.size() * 25);
                                        System.out.println(Rec1J2);

                                        ListaEdRecursosT1J2.clear();
                                    }

                                    break;
                                case 2:
                                    if (ListaEdRecursosT2J2.isEmpty()) {
                                        System.out.println(" PRIMERO DEBE DE CREAR EDIFICIO DE ESTE RECURSO ");
                                    } else {
                                        Rec1J2 = Rec1J2 + (ListaEdRecursosT2J2.size() * 25);
                                        System.out.println(" RECURSO TIPO 1 DISPONIBLE " + Rec1J2);

                                        ListaEdRecursosT1J2.clear();
                                        System.out.println(" EDIFICIO DE RECURSO TIPO 1 DISPONIBLE " + ListaEdRecursosT2J2.size());
                                    }
                                    break;

                            }
                            break;

                    }
                    break;
//                 RAZA 2
                case 2:
                    switch (opc) {
                        case 1:
                            System.out.println(" CREAR EDIFICACIONES ");
                            System.out.println("1. EDIFICIO VEHÍCULO 1 ");
                            System.out.println("2. EDIFICIO VEHÍCULO 2 ");
                            System.out.println("3. EDIFICIO RECURSO 1 ");
                            System.out.println("4. EDIFICIO RECURSO 2 ");
                            System.out.println("5. EDIFICIO RECURSO 3 ");
                            System.out.println("6. EDIFICIO MILICIA ");
                            System.out.println("");

                            System.out.println("ESCOJA EL EDIFICIO A CREAR");

                            int op = leer.nextInt();

                            switch (op) {
                                case 1:

                                    ArrayList EdificioV1J1 = new ArrayList();
                                    Edificaciones v1 = edi.getEdificio("Edificio de carros de bombas", 100, 2, 30, 30);
                                    EdificioV1J1.add(v1);
                                    System.out.println("");
                                    Rec1J2 = Rec1J2 - v1.getCostor1();
                                    Rec2J2 = Rec2J2 - v1.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                        ListaEdi2.add(EdificioV1J1);
                                        ListaEdVehiculoT1J2.add(EdificioV1J1);
                                        int ListEdif = ListaEdi2.size();
                                        int lisV1J1 = ListaEdVehiculoT1J2.size();
                                        System.out.println("NUMERO DE EDIFICIOS DE CARROS DE BOMBAS DISPONIBLES" + lisV1J1);
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListEdif);
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                                case 2:

                                    ArrayList EdificioV2j1 = new ArrayList();
                                    Edificaciones v2 = edi.getEdificio(" Edificio de aviones avienta misiles", 100, 2, 25, 25);
                                    EdificioV2j1.add(v2);
                                    Rec1J2 = Rec1J2 - v2.getCostor1();
                                    Rec2J2 = Rec2J2 - v2.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                        ListaEdi2.add(EdificioV2j1);
                                        ListaEdVehiculoT2J2.add(EdificioV2j1);
                                        int ListEdifi = ListaEdi2.size();
                                        int lisV2J1 = ListaEdVehiculoT1J2.size();
                                        System.out.println("NUMERO DE EDIFICIOS DE AVIONES TIRA MISIL DISPONIBLES" + lisV2J1);
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListEdifi);
                                    }else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;

                                case 3:
                                    ArrayList EdificioR1j1 = new ArrayList();
                                    Edificaciones r1 = edi.getEdificio(" Edificio de diamente", 100, 2, 50, 50);
                                    EdificioR1j1.add(r1);
                                    Rec1J2 = Rec1J2 - r1.getCostor1();
                                    Rec2J2 = Rec2J2 - r1.getCostor2();

                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                        System.out.println("");
                                        ListaEdi2.add(EdificioR1j1);
                                        ListaEdRecursosT1J2.add(EdificioR1j1);
                                        int lisR1J1 = ListaEdRecursosT1J2.size();
                                        System.out.println("NUMERO DE EDIFICIOS DE DIAMANTES DISPONIBLES" + ListaEdi2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());

                                        System.out.println("");
                                    }else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;

                                case 4:
                                    ArrayList EdificioR2j1 = new ArrayList();
                                    Edificaciones r2 = edi.getEdificio(" Edificio de rubíes", 100, 2, 30, 30);
                                    EdificioR2j1.add(r2);
                                    Rec1J2 = Rec1J2 - r2.getCostor1();
                                    Rec2J2 = Rec2J2 - r2.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                        System.out.println(EdificioR2j1);
                                        System.out.println("");
                                        ListaEdi2.add(EdificioR2j1);
                                        ListaEdRecursosT2J2.add(EdificioR2j1);
                                        System.out.println("NUMERO DE EDIFICIOS DE RUBÍES DISPONIBLES" + ListaEdRecursosT2J2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());

                                        System.out.println("");
                                    }
else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                                case 5:
                                    ArrayList EdificioR3j1 = new ArrayList();
                                    Edificaciones r3 = edi.getEdificio(" Edificio de energía eólica", 100, 1, 25, 25);
                                    EdificioR3j1.add(r3);
                                    Rec1J2 = Rec1J2 - r3.getCostor1();
                                    Rec2J2 = Rec2J2 - r3.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                        System.out.println(EdificioR3j1);
                                        System.out.println("");
                                        ListaEdi2.add(EdificioR3j1);
                                        ListaEdRecursosT2J2.add(EdificioR3j1);
                                        System.out.println("NUMERO DE EDIFICIOS DE ENERGÍA EÓLICA DISPONIBLES" + ListaEdRecursosT2J2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                                case 6:

                                    ArrayList EdificioMj1 = new ArrayList();
                                    Edificaciones basemilitar = edi.getEdificio(" Edificio base militar", 100, 1, 25, 25);
                                    Rec1J2 = Rec1J2 - basemilitar.getCostor1();
                                    Rec2J2 = Rec2J2 - basemilitar.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        EdificioMj1.add(basemilitar);
                                        ListaEdi2.add(EdificioMj1);
                                        System.out.println("");
                                        ListaBaseMiliJ2.add(EdificioMj1);
                                        System.out.println("NUMERO DE BASES MILITARES DISPONIBLES" + ListaBaseMiliJ2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println(" CREAR MILICIA ");

                            System.out.println("1. CREAR SUPER SOLDADOS  ");
                            System.out.println("2. CREAR ESCUADRONES ");
                            System.out.println("");
                            System.out.println("ESCOJA LA MILICIA A CREAR");
                            int opMili = leer.nextInt();

                            if (ListaBaseMiliJ2.size() > 0) {
                                System.out.println("DISPONE DE " + ListaBaseMiliJ2.size() + " EDIFICIOS, EN CUÁL BASE MILITAR LOS DESEA INGRESAR?");
                                int meter = leer.nextInt();

                                switch (opMili) {
                                    case 1:
                                        Milicia soldado = mil.getMilicia("Súper soldado", 50, 10, 2, 30, 30);
                                        Rec1J2 = Rec1J2 - soldado.getCostor1();
                                        Rec2J2 = Rec2J2 - soldado.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                            System.out.println(ListaBaseMiliJ2.get(meter - 1).add(soldado.toString()));
                                            System.out.println(ListaBaseMiliJ2.get(meter - 1));
                                        }
                                        else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                        break;
                                    case 2:
                                        Milicia escuadron = mil.getMilicia("Escuadrón", 50, 10, 2, 30, 30);
                                        Rec1J2 = Rec1J2 - escuadron.getCostor1();
                                        Rec2J2 = Rec2J2 - escuadron.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                            System.out.println(ListaBaseMiliJ2.get(meter - 1).add(escuadron.toString()));
                                            System.out.println(ListaBaseMiliJ2.get(meter - 1));
                                        } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                        break;

                                }
                            } else {
                                System.out.println("Primero se deben de crear los edificios");
                            }

                            break;

                        case 3:
                            System.out.println(" CREAR VEHÍCULOS ");

                            System.out.println("1. CREAR CARRO DE BOMBA");
                            System.out.println("2. CREAR AVIÓN DE MISIL");
                            System.out.println("");
                            System.out.println("ESCOJA EL VEHÍCULO A CREAR");
                            int opVeh = leer.nextInt();

                            switch (opVeh) {
                                case 1:
                                    if (ListaEdVehiculoT1J2.size() > 0) {
                                        System.out.println("DISPONE DE " + ListaEdVehiculoT1J2.size() + " EDIFICIOS PARA CARRO DE BOMBAS, EN CUÁL LO DESEA INGRESAR?");
                                        int meter = leer.nextInt();
                                        Vehiculo v1 = veh.getVehiculo("Carro Bomba", 40, 10, 2, 20, 20);
                                        Rec1J2 = Rec1J2 - v1.getCostor1();
                                        Rec2J2 = Rec2J2 - v1.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                            System.out.println(ListaEdVehiculoT1J2.get(meter - 1).add(v1.toString()));
                                            System.out.println(ListaEdVehiculoT1J2.get(meter - 1));
                                        } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    } else {
                                        System.out.println("Primero se debe de crear el edificio para carro de bombas");

                                    }
                                    break;

                                case 2:

                                    if (ListaEdVehiculoT2J2.size() > 0) {
                                        System.out.println("DISPONE DE " + ListaEdVehiculoT2J2.size() + " EDIFICIOS PARA AVIONES TIRA MISIL, EN CUÁL LO DESEA INGRESAR?");
                                        int meter = leer.nextInt();
                                        Vehiculo v2 = veh.getVehiculo("Avión tira Misil", 50, 10, 2, 30, 30);
                                        Rec1J2 = Rec1J2 - v2.getCostor1();
                                        Rec2J2 = Rec2J2 - v2.getCostor2();

                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                            System.out.println(ListaEdVehiculoT2J2.get(meter - 1).add(v2.toString()));
                                            System.out.println(ListaEdVehiculoT2J2.get(meter - 1));
                                        }
else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }                                    } else {
                                        System.out.println("Primero se debe de crear el edificio para aviones tira misil");
                                    }

                                    break;
                            }
                            break;

                        case 4:
                            System.out.println("----RECOLECTAR RECURSOS----");
                            System.out.println(" 1. RECOLECTAR DE EDIFICIO DE RECURSOS TIPO 1");
                            System.out.println(" 2. RECOLECTAR DE EDIFICIO DE RECURSOS TIPO 2");
                            System.out.println(" INGRESE DE CUAL EDIFICIO DESEA RECOLECTAR ");
                            int recolectar;
                            recolectar = leer.nextInt();
                            switch (recolectar) {
                                case 1:
                                    if (ListaEdRecursosT1J2.isEmpty()) {
                                        System.out.println(" PRIMERO DEBE DE CREAR EDIFICIO DE ESTE RECURSO ");
                                    } else {
                                        Rec1J2 = Rec1J2 + (ListaEdRecursosT1J2.size() * 25);
                                        System.out.println(" RECURSO TIPO 1 DISPONIBLE " + Rec1J2);

                                        ListaEdRecursosT1J2.clear();
                                        System.out.println(" EDIFICIO DE RECURSO TIPO 1 DISPONIBLE " + ListaEdRecursosT1J2.size());

                                    }

                                    break;
                                case 2:
                                    if (ListaEdRecursosT2J2.isEmpty()) {
                                        System.out.println(" PRIMERO DEBE DE CREAR EDIFICIO DE ESTE RECURSO ");
                                    } else {
                                        Rec1J2 = Rec1J2 + (ListaEdRecursosT2J2.size() * 25);
                                        System.out.println(" RECURSO TIPO 1 DISPONIBLE " + Rec1J2);

                                        ListaEdRecursosT1J2.clear();
                                        System.out.println(" EDIFICIO DE RECURSO TIPO 1 DISPONIBLE " + ListaEdRecursosT2J2.size());
                                    }
                                    break;

                            }
                            break;
                    }
                    break;
                //TERCERA RAZA
                case 3:

                    switch (opc) {
                        case 1:
                            System.out.println(" CREAR EDIFICACIONES ");
                            System.out.println("1. EDIFICIO VEHÍCULO 1 ");
                            System.out.println("2. EDIFICIO VEHÍCULO 2 ");
                            System.out.println("3. EDIFICIO RECURSO 1 ");
                            System.out.println("4. EDIFICIO RECURSO 2 ");
                            System.out.println("5. EDIFICIO RECURSO 3 ");
                            System.out.println("6. EDIFICIO MILICIA ");
                            System.out.println("");

                            System.out.println("ESCOJA EL EDIFICIO A CREAR");

                            int op = leer.nextInt();

                            switch (op) {
                                case 1:

                                    ArrayList EdificioV1J1 = new ArrayList();
                                    Edificaciones v1 = edi.getEdificio("Edificio de drones lanza bombas", 100, 2, 35, 35);
                                    EdificioV1J1.add(v1);
                                    System.out.println("");
                                    Rec1J2 = Rec1J2 - v1.getCostor1();
                                    Rec2J2 = Rec2J2 - v1.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        ListaEdi2.add(EdificioV1J1);
                                        ListaEdVehiculoT1J2.add(EdificioV1J1);
                                        int ListEdif = ListaEdi2.size();
                                        int lisV1J1 = ListaEdVehiculoT1J2.size();
                                        System.out.println("NUMERO DE EDIFICIOS DE DRONES LANZA BOMBAS DISPONIBLES" + lisV1J1);
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListEdif);

                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                                case 2:

                                    ArrayList EdificioV2j1 = new ArrayList();
                                    Edificaciones v2 = edi.getEdificio(" Edificio de barco de explosivos ", 100, 2, 25, 25);
                                    EdificioV2j1.add(v2);
                                    Rec1J2 = Rec1J2 - v2.getCostor1();
                                    Rec2J2 = Rec2J2 - v2.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        ListaEdi2.add(EdificioV2j1);
                                        ListaEdVehiculoT2J2.add(EdificioV2j1);
                                        int ListEdifi = ListaEdi2.size();
                                        int lisV2J1 = ListaEdVehiculoT1J2.size();
                                        System.out.println("NUMERO DE EDIFICIOS DE BARCOS TIRA EXPLOSIVOS" + lisV2J1);
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListEdifi);
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;

                                case 3:
                                    ArrayList EdificioR1j1 = new ArrayList();
                                    Edificaciones r1 = edi.getEdificio(" Edificio de ónix", 100, 2, 50, 50);
                                    EdificioR1j1.add(r1);
                                    Rec1J2 = Rec1J2 - r1.getCostor1();
                                    Rec2J2 = Rec2J2 - r1.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        System.out.println("");
                                        ListaEdi2.add(EdificioR1j1);
                                        ListaEdRecursosT1J2.add(EdificioR1j1);
                                        int lisR1J1 = ListaEdRecursosT1J2.size();
                                        System.out.println("NUMERO DE EDIFICIOS DE ÓNIX DISPONIBLES" + ListaEdi2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());

                                        System.out.println("");
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;

                                case 4:
                                    ArrayList EdificioR2j1 = new ArrayList();
                                    Edificaciones r2 = edi.getEdificio(" Edificio de ópalo", 100, 2, 30, 30);
                                    EdificioR2j1.add(r2);
                                    Rec1J2 = Rec1J2 - r2.getCostor1();
                                    Rec2J2 = Rec2J2 - r2.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        System.out.println(EdificioR2j1);
                                        System.out.println("");
                                        ListaEdi2.add(EdificioR2j1);
                                        ListaEdRecursosT2J2.add(EdificioR2j1);
                                        System.out.println("NUMERO DE EDIFICIOS DE ÓPALO DISPONIBLES" + ListaEdRecursosT2J2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());

                                        System.out.println("");
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                                case 5:
                                    ArrayList EdificioR3j1 = new ArrayList();
                                    Edificaciones r3 = edi.getEdificio(" Edificio de energía hidráulica", 100, 1, 25, 25);
                                    EdificioR3j1.add(r3);
                                    Rec1J2 = Rec1J2 - r3.getCostor1();
                                    Rec2J2 = Rec2J2 - r3.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        System.out.println(EdificioR3j1);
                                        System.out.println("");
                                        ListaEdi2.add(EdificioR3j1);
                                        ListaEdRecursosT2J2.add(EdificioR3j1);
                                        System.out.println("NUMERO DE EDIFICIOS DE ENERGÍA HIDRÁULICA DISPONIBLES" + ListaEdRecursosT2J2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                                case 6:

                                    ArrayList EdificioMj1 = new ArrayList();
                                    Edificaciones basemilitar = edi.getEdificio(" Edificio base militar", 100, 1, 25, 25);
                                    EdificioMj1.add(basemilitar);
                                    Rec1J2 = Rec1J2 - basemilitar.getCostor1();
                                    Rec2J2 = Rec2J2 - basemilitar.getCostor2();
                                    if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                        ListaEdi2.add(EdificioMj1);
                                        System.out.println("");
                                        ListaBaseMiliJ2.add(EdificioMj1);
                                        System.out.println("NUMERO DE BASES MILITARES DISPONIBLES" + ListaBaseMiliJ2.size());
                                        System.out.println("NUMERO DE EDIFICIOS DISPONIBLES" + ListaEdi2.size());
                                    } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println(" CREAR MILICIA ");

                            System.out.println("1. CREAR SUPER SOLDADOS  ");
                            System.out.println("2. CREAR ESCUADRONES ");
                            System.out.println("");
                            System.out.println("ESCOJA LA MILICIA A CREAR");
                            int opMili = leer.nextInt();

                            if (ListaBaseMiliJ2.size() > 0) {
                                System.out.println("DISPONE DE " + ListaBaseMiliJ2.size() + " EDIFICIOS, EN CUÁL BASE MILITAR LOS DESEA INGRESAR?");
                                int meter = leer.nextInt();

                                switch (opMili) {
                                    case 1:
                                        Milicia soldado = mil.getMilicia("Súper soldado", 50, 10, 2, 30, 30);
                                        Rec1J2 = Rec1J2 - soldado.getCostor1();
                                        Rec2J2 = Rec2J2 - soldado.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                            System.out.println(ListaBaseMiliJ2.get(meter - 1).add(soldado.toString()));
                                            System.out.println(ListaBaseMiliJ2.get(meter - 1));
                                        } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                        break;
                                    case 2:
                                        Milicia escuadron = mil.getMilicia("Escuadrón", 50, 10, 2, 30, 30);
                                        Rec1J2 = Rec1J2 - escuadron.getCostor1();
                                        Rec2J2 = Rec2J2 - escuadron.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                            System.out.println(ListaBaseMiliJ2.get(meter - 1).add(escuadron.toString()));
                                            System.out.println(ListaBaseMiliJ2.get(meter - 1));
                                        } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                        break;
                                }
                            } else {
                                System.out.println("Primero se deben de crear los edificios");
                            }

                            break;

                        case 3:
                            System.out.println(" CREAR VEHÍCULOS ");

                            System.out.println("1. CREAR CARRO DE BOMBA");
                            System.out.println("2. CREAR AVIÓN DE MISIL");
                            System.out.println("");
                            System.out.println("ESCOJA EL VEHÍCULO A CREAR");
                            int opVeh = leer.nextInt();

                            switch (opVeh) {
                                case 1:
                                    if (ListaEdVehiculoT1J2.size() > 0) {
                                        System.out.println("DISPONE DE " + ListaEdVehiculoT1J2.size() + " EDIFICIOS PARA CARRO DE BOMBAS, EN CUÁL LO DESEA INGRESAR?");
                                        int meter = leer.nextInt();
                                        Vehiculo v1 = veh.getVehiculo("Carro Bomba", 40, 10, 2, 20, 20);
                                        Rec1J2 = Rec1J2 - v1.getCostor1();
                                        Rec2J2 = Rec2J2 - v1.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {
                                            System.out.println(ListaEdVehiculoT1J2.get(meter - 1).add(v1.toString()));
                                            System.out.println(ListaEdVehiculoT1J2.get(meter - 1));
                                        } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    } else {
                                        System.out.println("Primero se debe de crear el edificio para carro de bombas");

                                    }
                                    break;

                                case 2:

                                    if (ListaEdVehiculoT2J2.size() > 0) {
                                        System.out.println("DISPONE DE " + ListaEdVehiculoT2J2.size() + " EDIFICIOS PARA AVIONES TIRA MISIL, EN CUÁL LO DESEA INGRESAR?");
                                        int meter = leer.nextInt();
                                        Vehiculo v2 = veh.getVehiculo("Avión tira Misil", 50, 10, 2, 30, 30);
                                        Rec1J2 = Rec1J2 - v2.getCostor1();
                                        Rec2J2 = Rec2J2 - v2.getCostor2();
                                        if (Rec1J2 >= 0 && Rec1J2 >= 0) {

                                            System.out.println(ListaEdVehiculoT2J2.get(meter - 1).add(v2.toString()));
                                            System.out.println(ListaEdVehiculoT2J2.get(meter - 1));
                                        } else {
                                        System.out.println("NO HAY RECURSOS DISPONIBLES PARA ");

                                    }
                                    } else {
                                        System.out.println("Primero se debe de crear el edificio para aviones tira misil");
                                    }

                                    break;
                            }
                            break;

                        case 4:
                            System.out.println("----RECOLECTAR RECURSOS----");
                            System.out.println(" 1. RECOLECTAR DE EDIFICIO DE RECURSOS TIPO 1");
                            System.out.println(" 2. RECOLECTAR DE EDIFICIO DE RECURSOS TIPO 2");
                            System.out.println(" INGRESE DE CUAL EDIFICIO DESEA RECOLECTAR ");
                            int recolectar;
                            recolectar = leer.nextInt();
                            switch (recolectar) {
                                case 1:
                                    if (ListaEdRecursosT1J2.isEmpty()) {
                                        System.out.println(" PRIMERO DEBE DE CREAR EDIFICIO DE ESTE RECURSO ");
                                    } else {
                                        Rec1J2 = Rec1J2 + (ListaEdRecursosT1J2.size() * 25);
                                        System.out.println(" RECURSO TIPO 1 DISPONIBLE " + Rec1J2);

                                        ListaEdRecursosT1J2.clear();
                                        System.out.println(" EDIFICIO DE RECURSO TIPO 1 DISPONIBLE " + ListaEdRecursosT1J2.size());

                                    }

                                    break;
                                case 2:
                                    if (ListaEdRecursosT2J2.isEmpty()) {
                                        System.out.println(" PRIMERO DEBE DE CREAR EDIFICIO DE ESTE RECURSO ");
                                    } else {
                                        Rec1J2 = Rec1J2 + (ListaEdRecursosT2J2.size() * 25);
                                        System.out.println(" RECURSO TIPO 1 DISPONIBLE " + Rec1J2);

                                        ListaEdRecursosT1J2.clear();
                                        System.out.println(" EDIFICIO DE RECURSO TIPO 1 DISPONIBLE " + ListaEdRecursosT2J2.size());
                                    }
                                    break;

                            }
                            break;
                    }
                    break;

            }
        }

    }
}
