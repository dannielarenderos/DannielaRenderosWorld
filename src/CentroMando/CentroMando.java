/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CentroMando;

/**
 *
 * @author Danniela Renderos
 */
public class CentroMando {

    private int vida;

    public CentroMando() {
    }

    private CentroMando(Builder b) {
        this.vida = b.vida;

    }

    @Override
    public String toString() {
        return "Centro de Mando{"
                + "vida='" + vida + '\'' + '}';
    }

    
    public static class Builder {

        private int vida;

        public Builder(int vida) {
            this.vida = vida;

        }

        public CentroMando build() {
            return new CentroMando(this);
        }
    }
}
