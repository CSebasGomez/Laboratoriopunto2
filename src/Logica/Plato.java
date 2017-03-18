/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Jose Aranda
 * 
 * Combinar ingredientes
 * 
 */
public class Plato {
    private String ingr1;
    private String ingr2;
    private int precio;

    public Plato(String ingr1, String ingr2, int precio) {
        this.ingr1 = ingr1;
        this.ingr2 = ingr2;
        this.precio = precio;
    }

    public String getIngr1() {
        return ingr1;
    }

    public void setIngr1(String ingr1) {
        this.ingr1 = ingr1;
    }

    public String getIngr2() {
        return ingr2;
    }

    public void setIngr2(String ingr2) {
        this.ingr2 = ingr2;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
