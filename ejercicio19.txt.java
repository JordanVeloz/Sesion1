/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio19 {
    public static void main(String[] args) {
        // Entrada
        int numero = 5;
        int antecesores = 0;
        int contadorDivisibles = 0;
        //Proceso
        antecesores = numero - 1;
        while (antecesores >1){
            if (numero % antecesores == 0){
                contadorDivisibles++;
            }
            antecesores--;    
}
        //Validar si el numero es Primo
        if (contadorDivisibles == 0){
            JOptionPane.showMessageDialog(null, "Es Primo");
        }else{
            JOptionPane.showMessageDialog(null, "No es Primo");
        }
        
    }
    
}
