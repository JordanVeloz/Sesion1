/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 //Conversiones en Java
package app;

import javax.swing.JOptionPane;

public class ejercicio12 {
    
    public static void main(String[] args) {
        // Entrada
        String numeroEnteroString = "5";
        String numeroDecimalString = "2.50";
        int numeroEnteroConvertido=0;
        double numeroDecimalConvertido=0.0;
        //Proceso
        numeroEnteroConvertido = Integer.parseInt(numeroEnteroString);
        numeroDecimalConvertido = Double.parseDouble(numeroDecimalString);
        //Salida
        JOptionPane.showMessageDialog(null, "El numero entero convertido es: "+ numeroEnteroString);
        JOptionPane.showMessageDialog(null, "El numero decimal convertido es: "+ numeroDecimalConvertido);
    }
    
}
