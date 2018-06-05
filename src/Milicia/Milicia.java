/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;


/**
 *
 * @author Danniela Renderos
 */
public class Milicia {

    private String tipo;
    private int vida;
    private int danio;
    private int fase;

    public Milicia() {
    }

    private Milicia(Builder b) {
        this.tipo = b.tipo;
        this.vida = b.vida;
        this.danio = b.danio;
        this.fase = b.fase;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getDanio() {
        return danio;
    }

    public int getFase() {
        return fase;
    }

    @Override
    public String toString() {
        return "Milicia{"
                + "vida='" + vida + '\''
                + ", fase='" + fase + '\''
                + ", tipo='" + tipo + '\''
                + ", daño=" + danio
                + '}';
    }

    public static class Builder {

        private String tipo;
        private int vida;
        private int danio;
        private int fase;

        public Builder(String tipo, int vida, int danio, int fase) {
            this.tipo = tipo;
            this.vida = vida;
            this.danio = danio;
                        this.fase = fase;

        }

        public Milicia build() {
            return new Milicia(this);
        }
    }
}
