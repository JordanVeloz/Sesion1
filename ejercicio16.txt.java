/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    //Ejercicio16: Ciclos DO WHILE
package app;

import javax.swing.JOptionPane;


public class ejercicio16 {

    public static void main(String[] args) {
        //Entrada
        String palabra="";
        int indice = 0;
        int longitud = 0;
        //Proceso
        palabra = JOptionPane.showInputDialog(null,"Ingrese una palabra: ");
        longitud = palabra.length();
        do{
           JOptionPane.showMessageDialog(null,palabra.toUpperCase().charAt(indice));
           indice++;
        }while(indice<longitud);
        }
    }
    

