/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio3: Inicializar un numero que permite verificar si es multiplo de 7
package app;
public class ejercicio3 {
    public static void main(String[] args) {
        //Entrada
        int numero1=35;
        int residuo=0;
        //Proceso
        residuo= numero1 % 7;
        if (residuo==0){
        //Salida    
            System.out.println("Si es multiplo de 7");
        }else{
             System.out.println("No es multiplo de 7");
        }
     
    }
    
}
