/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar variable a usar
        String mensajeSolicitud = "Ingrese un numero";
        String textoIngresado = "";
        int numeroIngresado = 0;
        
        //Solicitar valores al usuario
       textoIngresado = JOptionPane.showInputDialog(mensajeSolicitud);
       System.out.println(textoIngresado);
       
       //Convertir el texto a numero
       numeroIngresado = Integer.parseInt(textoIngresado);
       
       //Proceso de validar si numero es par o impar
       if (numeroIngresado % 2 == 0) {
           JOptionPane.showMessageDialog(null, "El numero ingresado es par.");
       } else { 
           JOptionPane.showMessageDialog(null, "El numero ingresado no es par");
       }
        
    }
    
}
