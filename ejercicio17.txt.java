/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio17 {

    public static void main(String[] args) {
        // Entrada
        String palabra = "";
        int longitud = 0;
        String palabraNueva = "";
        //Proceso
        palabra = JOptionPane.showInputDialog("Ingrese una palabra: ");
        longitud = palabra.length();
        for (int indice = longitud - 1; indice >= 0; indice--) {
            //Armamo la nueva palabra
            palabraNueva = palabraNueva + palabra.charAt(indice);
        }
        //Salida
        if (palabra.equals(palabraNueva)) {
            JOptionPane.showMessageDialog(null, "Es Palindrona");
        } else {
            JOptionPane.showMessageDialog(null, "No es Palindrona");

        }
    }

}
