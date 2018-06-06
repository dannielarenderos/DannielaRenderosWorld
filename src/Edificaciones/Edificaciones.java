/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

/**
 *
 * @author Danniela Renderos
 */
public class Edificaciones {

    private String tipo;
    private int vida;
    private int fase;
    private int costo;

    public Edificaciones() {
    }

    private Edificaciones(Builder b) {
        this.tipo = b.tipo;
        this.vida = b.vida;
        this.fase = b.fase;
        this.costo = b.costo;
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

    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Edificaciones{"
                + "vida='" + vida + '\''
                + ", fase='" + fase + '\''
                + ", tipo='" + tipo + '\''
                + ", costo='" + costo + '\''
                + '}';
    }

    public static class Builder {

        private String tipo;
        private int vida;
        private int fase;
        private int costo;

        public Builder(String tipo, int vida, int fase, int costo) {
            this.tipo = tipo;
            this.vida = vida;
            this.fase = fase;

        }

        public Edificaciones build() {
            return new Edificaciones(this);
        }
    }
}
