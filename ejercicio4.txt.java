/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Ejercicio Verificacion de dos numeros pares a partir del uso de operadores logicos
public class ejercicio4 {

    public static void main(String[] args) {
       //Entrada
       int numero1=4;
       int numero2=8;
       int residuo1=0;
       int residuo2=0;
       //Proceso
       residuo1 = numero1 % 2;
       residuo2 = numero2 % 2;
       if (residuo1 ==0 && residuo2 == 0){
       //Salida
       System.out.println("Los dos numeros son pares");
       }else{
       System.out.println("Los dos numeros no son pares");
       }
    }
    
}
