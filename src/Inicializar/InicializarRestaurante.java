/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicializar;
import Interfaz.Interfaz;
import Logica.*;
/**
 *
 * @author Jose Aranda
 * 
 * dar datos iniciales al restaurante y organizarlo
 * 
 */
public class InicializarRestaurante {
    private Restaurante iniciarRestaurante;
    private final static Empleados pepe = new Empleados("Pepe", 1200000);
    private final static Inventario iniciar = new Inventario(2000, 2000, 50, 50);
    
    private final static Plato plato1 = new Plato("lentejas", "pescado", 18000);
    private final static Plato plato2 = new Plato ("lentejas", "res", 15000);
    private final static Plato plato3 = new Plato ("arroz", "pescado", 17000);
    private final static Plato plato4 = new Plato ("arroz", "res", 13000);
    private final static Menu menu = new Menu (plato1, plato2, plato3, plato4);
    

    public InicializarRestaurante() {
        this.iniciarRestaurante = new Restaurante(0, 0, 0, pepe, iniciar, menu);
        Interfaz interfaz = new Interfaz(iniciarRestaurante);
    }
    
    
}
