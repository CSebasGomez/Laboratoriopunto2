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
 * registro de inventario
 * 
 */
public class Inventario {
    private int arroz;
    private int lenteja;
    private int pescado;
    private int res;

    public Inventario(int arroz, int lenteja, int pescado, int res) {
        this.arroz = arroz;
        this.lenteja = lenteja;
        this.pescado = pescado;
        this.res = res;
    }

    public int getArroz() {
        return arroz;
    }

    public int getLenteja() {
        return lenteja;
    }

    public int getPescado() {
        return pescado;
    }

    public int getRes() {
        return res;
    }

    public void setArroz(int arroz) {
        this.arroz = arroz;
    }

    public void setLenteja(int lenteja) {
        this.lenteja = lenteja;
    }

    public void setPescado(int pescado) {
        this.pescado = pescado;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
