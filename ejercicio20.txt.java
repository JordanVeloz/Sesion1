/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio20 {

    public static void main(String[] args) {
        // Entrada
        int numero = 6;
        int antecesores = 0;
        int acumuladorDivisibles = 0;
        //Proceso
        antecesores = numero -1;
        while(antecesores >0){
            if(numero%antecesores==0){
                acumuladorDivisibles= acumuladorDivisibles + antecesores;
            }
            antecesores--;
        }
       //Salida
       if (numero==acumuladorDivisibles){
       JOptionPane.showMessageDialog(null, "Es Perfecto");
       }else{
           JOptionPane.showMessageDialog(null, "No es Perfecto");
       }
            }
        }
