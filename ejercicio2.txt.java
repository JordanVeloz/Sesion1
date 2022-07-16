/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio2: Validacion numero par/impar
package app;

public class ejercicio2 {

    public static void main(String[] args) {
        //Entrada* 
        int numero1 = 2;
        int residuo = 0;
        //Proceso 
        residuo = numero1 % 2;
        if (residuo == 0) {
            //Salida-resultados
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }

}
