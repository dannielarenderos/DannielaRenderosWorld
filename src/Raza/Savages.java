package Raza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Danniela Renderos
 */
public class Savages extends Raza {

    @Override
    public void Play() {
        this.ataque = ataque;
        this.vida = vida;
        this.costo = costo;
        System.out.println("Ataque: " + this.ataque + " vida: " + this.ataque + "Costo: " + this.costo);

//        listaRazas lista= listaRazas.getInstance();
//
//        lista.anniadir(this);
    }
}
