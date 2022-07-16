/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author usuario
 */
public class ejercicio10 {

    public static void main(String[] args) {
        // Entrada
        String empleado = "Jordan Veloz";
        String cargo = "Gerente de Compras";
        double pagohora = 20.0;
        int numeroHora = 160;
        double sueldo = 0.0;
        double iess = 0.0;
        double netoRecibir = 0.0;
        //Proceso
        sueldo = numeroHora * pagohora;
        iess = sueldo * 0.09;
        netoRecibir = sueldo - iess;
        //Salida
        System.out.println("---------Rol del mes de mayo 2022------------");
        System.out.println("Empleado: " + empleado);
        System.out.println("Cargo: " + cargo);
        System.out.println("Descuento IESS: " + iess);
        System.out.println("Valor Neto a Recibir:" + netoRecibir);
    }

}
