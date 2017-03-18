/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Restaurante;
import java.util.Scanner;

/**
 *
 * @author Jose Aranda
 * 
 * Muestra el menu de opciones al usuario para que escoja la operación que desee
 * 
 */
public class Interfaz {
    private static Scanner opcionE = new Scanner(System.in);
    private static Restaurante restaurante;

    public Interfaz(Restaurante restaurante) {
        this.restaurante = restaurante;
        MostrarMenu();
        /**
         * MostrarMenu llama la función de la interfaz de selección
        */
        
        
        }
    public void MostrarMenu(){
        System.out.println("Digite el numero de la opción correspondiente");
        System.out.println("1. Datos generales. \n2. Datos de empleados \n3. Pedir menu \n4. Ingresar inventario");
        int n = opcionE.nextInt();
        switch(n){
            case 1:
                datosRestaurante();
                break;
                
            case 2:
                datosEmpleado();
                break;
                
            case 3:
                pedirMenu();
                break;
            
            case 4:
                ingresarInventario();
                
            default:
                System.out.println("Escriba un numero valido");
                MostrarMenu();
    }
    }
    /**
     * Imprime los datos basicos del restaurante si el usuario selecciona esta opción
     */
    private void datosRestaurante() {
        System.out.println("ganancias: " + restaurante.getGanancias() +"\nIngresos: " + restaurante.getIngresos() + "\nEgresos: " + restaurante.getEgresos() + "\nArroz: " + restaurante.getInventario().getArroz() + "g\nLentejas: " + restaurante.getInventario().getLenteja() + "g\nPescado: " + restaurante.getInventario().getPescado() + " Unid\nRes: " + restaurante.getInventario().getRes() + " Unid");
        MostrarMenu();
    }   
    /**
     * Imprime datos de los empleados y llama a la funcion menú para seguir las opciones
     */
    private void datosEmpleado() {
        System.out.println("Nombre: " + restaurante.getEmpleados().getNombre() + "\nSueldo: " + restaurante.getEmpleados().getSueldo());
        MostrarMenu();
    }   

    private void pedirMenu() {
        
        /**
         * Menu de selección para el plato deseado
         */
        
        System.out.println("Digite el numero de la opción correspondiente");
        System.out.println("1. Lentejas con pescado \n2. Lentejas con res \n3. Arroz con pescado \n4. Arroz con res");
        int n = opcionE.nextInt();
        switch(n){
            case 1:
                lentejasConPescado();
                break;
            case 2:
                lentejasConRes();
                break;
            case 3:
                arrozConPescado();
                break;
            case 4:
                arrozConRes();
            default:
                System.out.println("ingrese numero válido");
                pedirMenu();
        }
    }
 
    /**
     * 
     * Actualiza los datos del inventario según las compras
     * si no hay mas inventario, no se efectua la compra
     * Los métodos lentejasConPescado, lentejasConRes, arrozConPescado y arrozConRes
     * tienen el mismo propósito, solo que se cambian los valores respectivos
     * 
    */

    private void lentejasConPescado() {
        if(restaurante.getInventario().getLenteja()>50 && restaurante.getInventario().getPescado()>1){
            restaurante.getInventario().setLenteja(restaurante.getInventario().getLenteja()-50);
            restaurante.getInventario().setPescado(restaurante.getInventario().getPescado()-1);
            restaurante.setIngresos(restaurante.getMenu().getPlato1().getPrecio());
            System.out.println("Plato servido exitosamente");
            actualizarGanacias();
            MostrarMenu();
        }
        else{
            System.out.println("no hay suficientes existencias para servir el plato");
            MostrarMenu();
        }
        
    }

    private void lentejasConRes() {
        if(restaurante.getInventario().getLenteja()>50 && restaurante.getInventario().getRes()>1){
            restaurante.getInventario().setLenteja(restaurante.getInventario().getLenteja()-50);
            restaurante.getInventario().setRes(restaurante.getInventario().getRes()-1);
            restaurante.setIngresos(restaurante.getMenu().getPlato2().getPrecio());
            System.out.println("Plato servido exitosamente");
            actualizarGanacias();
            MostrarMenu();
        }else{
            System.out.println("No hay suficientes existencias para servir el plato");
            MostrarMenu();
        }
    }

    private void arrozConPescado() {
        if(restaurante.getInventario().getArroz()>50 && restaurante.getInventario().getPescado()>1){
            restaurante.getInventario().setArroz(restaurante.getInventario().getArroz()-60);
            restaurante.getInventario().setPescado(restaurante.getInventario().getPescado()-1);
            restaurante.setIngresos(restaurante.getMenu().getPlato3().getPrecio());
            System.out.println("Plato servido exitosamente");
            actualizarGanacias();
            MostrarMenu();
        }
        else{
            System.out.println("No hay suficientes existencias para servir el plato");
            MostrarMenu();
        }
    }

    private void arrozConRes() {
        if(restaurante.getInventario().getArroz()>50 && restaurante.getInventario().getRes()>1){
            restaurante.getInventario().setArroz(restaurante.getInventario().getArroz()-60);
            restaurante.getInventario().setRes(restaurante.getInventario().getRes()-1);
            restaurante.setIngresos(restaurante.getMenu().getPlato4().getPrecio());
            System.out.println("Plato servido exitosamente");
            actualizarGanacias();
            MostrarMenu();
        }
        else{
            System.out.println("No hay suficientes existencias para servir el plato");
            MostrarMenu();
        }
    }
    
    /**
     * Método para llamar opción de compra de productos para inventario
     */

    private void ingresarInventario() {
        System.out.println("Elija la opcion \n1. Ingresar arroz \n2. Ingresar Lenteja \n3. Ingresar pescado \n4. Ingresar res");
        int n = opcionE.nextInt();
        switch(n){
            case 1:
                ingresarArroz();
                break;
            case 2:
                ingresarLenteja();
                break;
            case 3:
                ingresarPescado();
                break;
            case 4: 
                ingresarRes();
                break;
            default: 
                System.out.println("Ingrese opcion valida");
                ingresarInventario();
        }
    }

    private void ingresarArroz() {
        
        /**
         * ingresarArroz, ingresarLentejas, ingresarPescado, ingresarRes
         * pregunta la cantidad de gramos deseados para comprar en el caso de
         * el arroz y las lentejas; para res y pescado es por unidad
         * dependiendo de las ganancias que tenga el local al momento de la compra
         * se efectúa o no
         */
        
        System.out.println("cuantos gramos de arroz desea ingresar teniendo en cuenta que el gramo vale 400");
        int n = opcionE.nextInt();
        if(restaurante.getIngresos()>n*400){
        restaurante.setEgresos(restaurante.getEgresos() + (n*400));
        System.out.println("Compra Realizada exitosamente");
        actualizarGanacias();
        MostrarMenu();
        }
        else
        {
            System.out.println("No hay fondos suficientes para esta compra");
        }
        
    }

    private void ingresarLenteja() {
        
        System.out.println("cuantos gramos de lenteja desea ingresar teniendo en cuenta que el gramo vale 500");
        int n = opcionE.nextInt();
        if(restaurante.getIngresos()>n*500){
        restaurante.setEgresos(restaurante.getEgresos() + (n*500));
        System.out.println("Compra Realizada exitosamente");
        actualizarGanacias();
        MostrarMenu();
        }
        else
        {
            System.out.println("No hay fondos suficientes para esta compra");
            MostrarMenu();
        }
    }

    private void ingresarPescado() {
        
        System.out.println("cuantas unidades de pescado desea ingresar teniendo en cuenta que la unidad vale 7000");
        int n = opcionE.nextInt();
        if(restaurante.getIngresos()>n*7000){
        restaurante.setEgresos(restaurante.getEgresos() + (n*7000));
        System.out.println("Compra Realizada exitosamente");
        actualizarGanacias();
        MostrarMenu();
        }
        else
        {
            System.out.println("No hay suficientes fondos para esta compra");
            MostrarMenu();
        }
    }

    private void ingresarRes() {
        System.out.println("cuantas unidades de res desea ingresar teniendo en cuenta que la unidad vale 6000");
        int n = opcionE.nextInt();
        if(restaurante.getIngresos()>n*6000){
        restaurante.setEgresos(restaurante.getEgresos() + (n*6000));
        System.out.println("Compra Realizada exitosamente");
        actualizarGanacias();
        MostrarMenu();
        }else
        {
            System.out.println("No hay suficientes fondos para esta compra");
            MostrarMenu();
        }
    }

    /**
     * actualiza las ganancias y las incluye a la lista para tener los datos
     * llevar la contabilidad de ingresos, egresos y ganancias, así como el inventario
     * e información del restaurante
     */
    private void actualizarGanacias() {
        restaurante.setGanancias(restaurante.getIngresos()-restaurante.getEgresos());
    }
}
    

