/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio18 {

    public static void main(String[] args) {
        // Entrada
        String celular = "";
        int longitud = 0;
        //Proceso
        celular = JOptionPane.showInputDialog("Ingrese su numero de celular correctamente: ");
        longitud = celular.length();
        for (int indice = 0; indice < longitud; indice++) {
            //Validacion
            if (celular.charAt(indice) == '0' || celular.charAt(indice) == '1' || celular.charAt(indice) == '2'
                    || celular.charAt(indice) == '3' || celular.charAt(indice) == '4' || celular.charAt(indice) == '5' || celular.charAt(indice) == '6'
                    || celular.charAt(indice) == '7' || celular.charAt(indice) == '8' || celular.charAt(indice) =='9'){
            //Romper el ciclo
            }else{
            JOptionPane.showMessageDialog(null,"El numero ingresado no esta correcto.");
            indice = longitud;
           
        }
        }
    }

}
