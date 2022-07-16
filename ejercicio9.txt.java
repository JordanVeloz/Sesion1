/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author usuario
 */
public class ejercicio9 {

    public static void main(String[] args) {
        // Ejercicio9: Aplicacion que me permita validar el lugar de votacion, la edad, la mesa de un proceso de elecciones
        //Entrada
        String Nombre = "Jordan";
        boolean Lugar = true;
        boolean Edad = false;
        boolean Mesa = true;
        //Proceso
        if (Lugar == true) {
            if (Edad == true) {
                if (Mesa == true) {
                System.out.println(Nombre + " Esta acto para realizar el proceso de votacion");
            } else {
                System.out.println(Nombre+ " No se encuentra en la mesa correcta, pero esta en el lugar correcto ");
            }
            }else {
                System.out.println(Nombre + " No tiene la edad para realizar el proceso de votacion"); 
                System.out.println("Edad minima para realizar este proceso es de 16 años");
            }
        }else{
            System.out.println(Nombre + " No se encuentra en el establecimiento correcto");
        }
    }

}
