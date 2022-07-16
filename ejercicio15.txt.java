/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio15 {

    public static void main(String[] args) {
        // Entrada
        int numeroIngresado = 0;
            int contadorAscendente = 0;
        int contadorDescendente = 0;
        //Proceso
        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "*****Menu de Conversiones******" + "\n"
                + "1.Presentar secuencia Ascendente" + "\n" + "2.Presentar secuencia Descendente" + "\n"
                + "3.Salir"));
        //Evaluar los dos escenarios con switch
        switch (entrada) {
            case 1:
                //Generamos los dos escenarios con switch
                while (numeroIngresado < 9) {
                    numeroIngresado++;
                    JOptionPane.showMessageDialog(null, numeroIngresado);
                }
                break;
            case 2:
                //Generamos la secuencia descendente
                numeroIngresado--;
                while(numeroIngresado >1){
                    JOptionPane.showMessageDialog(null, numeroIngresado);
                    numeroIngresado--;
                }
                break;
        }
    }
}
        
  
