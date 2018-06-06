/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Danniela Renderos
 */
public class Vehiculo {

    private String tipo;
    private int vida;
    private int danio;
    private int fase;
    private int costo;

    public Vehiculo() {
    }

    private Vehiculo(Builder b) {
        this.tipo = b.tipo;
        this.vida = b.vida;
        this.danio = b.danio;
        this.fase = b.fase;
        this.costo = b.costo;
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

    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Vehiculo{"
               + "vida='" + vida + '\''
                + ", fase='" + fase + '\''
                + ", tipo='" + tipo + '\''
                + ", daño='" + danio + '\''
                + ", costo='" + costo + '\''
                + '}';
    }

    public static class Builder {

        private String tipo;
        private int vida;
        private int danio;
        private int fase;
        private int costo;

        public Builder(String tipo, int vida, int danio, int fase, int costo) {
            this.tipo = tipo;
            this.vida = vida;
            this.danio = danio;
            this.fase = fase;
            this.costo = costo;

        }

        public Vehiculo build() {
            return new Vehiculo(this);
        }
    }
}
