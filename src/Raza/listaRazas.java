package Raza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Danniela Renderos
 */
public class listaRazas {
    private static ArrayList listaRazas;
    
    private listaRazas(){
        listaRazas=new ArrayList<>();
    }


    public ArrayList<Raza> getArray(){
        return this.listaRazas;
    }
    public void anniadir(Raza r){
        listaRazas.forEach(Lz -> {
            
                            });
        }
     
//    public void mostrar(){
//        int i=1;
//        System.out.println("-----Razas disponibles-------");
//        for(Raza r: listaRaza){
//            System.out.println(i+" "+r.raza);
//            i++;
//        }
//    }
}
