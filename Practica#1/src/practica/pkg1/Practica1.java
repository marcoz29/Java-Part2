/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar las variables
        String mensajeUno = "Ingrese un primer valor.";
        String mensajeDos = "Ingrese un segundo valor.";
        
        String valorUnoSolocitado;
        String valorDosSolicitado;
        
        int valorNumeroUno = 0;
        int valorNumeroDos = 0;
        int resultado;
        
        //Solicitar valores al usuario
        valorUnoSolocitado = JOptionPane.showInputDialog(mensajeUno);
        valorDosSolicitado = JOptionPane.showInputDialog(mensajeDos);
        
        //Convertir los valores de texto a numeros
        valorNumeroUno = Integer.parseInt(valorUnoSolocitado);
        valorNumeroDos = Integer.parseInt(valorDosSolicitado);
        
        //Realizamos el proceso de sumar los numeros
       resultado = valorNumeroUno + valorNumeroDos;
        
        //Enviamos el mensaje al usuario
        JOptionPane.showMessageDialog(null, "El resultado de la sumatoria de los numeros es: " + resultado);

    }
    
}
