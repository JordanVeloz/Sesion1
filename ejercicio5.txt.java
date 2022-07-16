/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Ejercicio5: Aplicacion que permita validar el listado de invitados de una fiesta en el rango de edad
//18 a 30 años
package app;

/**
 *
 * @author Veloz Torres Jordan
 */
public class ejercicio5 {

 
    public static void main(String[] args) {
        //Entrada
        String nombre = "Jorge";
        int edad = 30;
        //Proceso
        if (edad >=18 && edad<= 30){
            System.out.println(nombre + " Tiene acceso al evento");
        }else{
            System.out.println(nombre + "No tiene acceso al evento");
        }
    }
    
}
