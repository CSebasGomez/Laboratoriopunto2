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
 * Clase principal para empaquetar las demas clases
 * 
 */
public class Restaurante {
    
    private int ganancias;
    private int ingresos;
    private int egresos;
    private Empleados empleados;
    private Inventario inventario;
    private Menu menu;

    public Restaurante(int ganancias, int ingresos, int egresos, Empleados empleados, Inventario inventario, Menu menu) {
        this.ganancias = ganancias;
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.empleados = empleados;
        this.inventario = inventario;
        this.menu = menu;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public int getEgresos() {
        return egresos;
    }

    public void setEgresos(int egresos) {
        this.egresos = egresos;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    
    
}
