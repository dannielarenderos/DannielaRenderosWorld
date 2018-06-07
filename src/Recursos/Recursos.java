/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import Edificaciones.*;

/**
 *
 * @author Danniela Renderos
 */
public class Recursos {

    private String tipo;
    private int cantidad;
    private int fase;
    private int costo;

    public Recursos() {
    }

    public Recursos(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    
    private Recursos(Builder b) {
        this.tipo = b.tipo;
        this.cantidad = b.cantidad;
        this.fase = b.fase;
        this.costo = b.costo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getFase() {
        return fase;
    }

    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Recursos{"
                + "cantidad='" + cantidad + '\''
                + ", fase='" + fase + '\''
                + ", tipo='" + tipo + '\''
                + ", costo='" + costo + '\''
                + '}';
    }

    public static class Builder {

        private String tipo;
        private int cantidad;
        private int fase;
        private int costo;

        public Builder(String tipo, int cantidad, int fase, int costo) {
            this.tipo = tipo;
            this.cantidad = cantidad;
            this.fase = fase;
            this.costo = costo;

        }

        public Recursos build() {
            return new Recursos(this);
        }
    }
}
