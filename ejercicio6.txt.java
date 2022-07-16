/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
//Ejercicio6: Aplicacion que valide el servicio de parquimetro de Vehiculos

/**
 *
 * @author Jordan Veloz Torres
 */
public class ejercicio6 {

    public static void main(String[] args) {
        //Entrada
        String Vehiculo = "Auto";
        //Proceso
        if (Vehiculo.equals("Auto") || Vehiculo.equals("SUV") || Vehiculo.equals("Camion")) {
            System.out.println(" Tiene acceso al parquimetro.");
        } else {
            System.out.println("No tiene acceso al parquimetro.");
        }
    }
}
