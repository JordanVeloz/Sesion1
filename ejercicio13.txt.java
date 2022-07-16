/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Ciclo13: Menu de Conversiones
package app;

import javax.swing.JOptionPane;

public class ejercicio13 {

    public static void main(String[] args) {
        // Entrada
        String numeroEnteroString = "5";
        String numeroDecimalString = "2.50";
        char caractersexo = 'M';
        int numeroEnteroConvertido=0;
        double numeroDecimalConvertido=0.0;
        String caracterSexoString = "";
        //Proceso
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null,"*****Menu de Conversiones******" + "\n"
                + "1.Convertir de String - Entero" + "\n" + "2.Convertir de String - Double" + "\n"
                +"3.Convertir de Char - String" + "\n" + "4.Salir"));
        //Aplicacion de anidaciones (if)
        if (entrada == 1) {
            //Presento la conversion de String Entero
            numeroEnteroConvertido = Integer.parseInt (numeroEnteroString);
            JOptionPane.showMessageDialog(null, "La conversion String - Entero es: " + numeroEnteroConvertido);
        } else if (entrada ==2){
            numeroDecimalConvertido = Double.parseDouble (numeroDecimalString);
            JOptionPane.showMessageDialog(null, "La conversion String - Double es: " + numeroDecimalConvertido);
       } else if (entrada ==3){
            caracterSexoString = String.valueOf (caractersexo);
            JOptionPane.showMessageDialog(null, "La conversion Char - String es: " + caracterSexoString);
       }else{
            JOptionPane.showMessageDialog(null,"!Gracias por utilizar el sistema!");
            System.exit(0);
       }
    }
        }
    
  
