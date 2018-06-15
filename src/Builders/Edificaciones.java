/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builders;

/**
 *
 * @author Danniela Renderos
 */

public class Edificaciones {

    private String tipo;
    private int vida;
    private int fase;
    private int costor1;
    private int costor2;

    
    public Edificaciones() {
    }

    private Edificaciones(Builder b) {
        this.tipo = b.tipo;
        this.vida = b.vida;
        this.fase = b.fase;
        this.costor1 = b.costor1;
        this.costor2 = b.costor2;

    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getFase() {
        return fase;
    }

    public int getCostor1() {
        return costor1;
    }

    public int getCostor2() {
        return costor2;
    }

    @Override
    public String toString() {
        return "Edificaciones{"
                + "vida='" + vida + '\''
                + ", fase='" + fase + '\''
                + ", tipo='" + tipo + '\''
                + ", costo recurso 1='" + costor1 + '\''
                                + ", costo recurso 2='" + costor2 + '\''

                + '}';
    }

    public static class Builder {

        private String tipo;
        private int vida;
        private int fase;
        private int costor1;
        private int costor2;

        public Builder(String tipo, int vida, int fase, int costor1, int costor2)
        {
            this.tipo = tipo;
            this.vida = vida;
            this.fase = fase;
            this.costor1 = costor1;
                        this.costor2 = costor2;


        }

        public Edificaciones build() {
            return new Edificaciones(this);
        }
    }
}
