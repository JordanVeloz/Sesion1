/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Jordan Veloz Torres
 */
public class ejercicio8 {

    public static void main(String[] args) {
        //Entrada
        String Vehiculo = "Ford-F150";
        boolean licencia = false;
        boolean efectivo = true;
        //Proceso
        if (licencia == true) {
            if (efectivo == true) {
                System.out.println(Vehiculo + "Se ejecuta la venta del vehiculo");
            } else {
                System.out.println(Vehiculo + "No se ejecuta la venta del vehiculo");
            }
        } else {
            System.out.println(Vehiculo + "No se ejecuta la venta del vehiculo");
        }
    
}
    
}
