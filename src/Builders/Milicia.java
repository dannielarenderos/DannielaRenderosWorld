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
public class Milicia {

    private String tipo;
    private int vida;
        private int costor1;
    private int costor2;
    private int danio;
    private int fase;

    public Milicia() {
    }

    private Milicia(Builder b) {
               this.tipo = b.tipo;
        this.vida = b.vida;
        this.danio = b.danio;
        this.fase = b.fase;
        this.costor1 = b.costor1;
        this.costor2 = b.costor2;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getCostor1() {
        return costor1;
    }

    public void setCostor1(int costor1) {
        this.costor1 = costor1;
    }

    public int getCostor2() {
        return costor2;
    }

    public void setCostor2(int costor2) {
        this.costor2 = costor2;
    }

    
    
    @Override
    public String toString() {
        return "Edificaciones{"
                + "vida='" + vida + '\''
                + ", fase='" + fase + '\''
                                + ", daño='" + danio + '\''

                + ", tipo='" + tipo + '\''
                + ", costo recurso 1='" + costor1 + '\''
                                + ", costo recurso 2='" + costor2 + '\''

                + '}';
    }

    public static class Builder {

        private String tipo;
        private int vida;
        private int fase;
                private int danio;

        private int costor1;
        private int costor2;

        public Builder(String tipo, int vida, int fase,int danio, int costor1, int costor2)
        {
            this.tipo = tipo;
            this.vida = vida;
            this.fase = fase;
            this.danio = danio;
            this.costor1 = costor1;
                        this.costor2 = costor2;
        }
        
        
        public Milicia build() {
            return new Milicia(this);
        }
    }
}
