
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posicionesarray;

import javax.swing.JOptionPane;
/**
 *
 * @author Marco
 */
public class PosicionesArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int tamano; //variable para almacenar
        tamano = Integer.parseInt(JOptionPane.showInputDialog("Defina el tamano del array")); //usuario ingresa el tamano del array
        int num[] = new int[tamano]; //se inicializa el array
        
        rellenarArray(num);
        mostrarArray(num);
        
    }
    public static void rellenarArray(int lista[]){
        for(int i = 0; i<lista.length; i++){
            String texto = JOptionPane.showInputDialog("Introduce un numero: ");
            lista[i]=Integer.parseInt(texto);
            }//Fin del metodo rellenarArray
        } 
    public static void mostrarArray(int lista[]){
        for (int i = 0; i<lista.length; i++){
            System.out.println("en el espacio " + i + "esta el valor: " +lista[i]);
            JOptionPane.showMessageDialog(null, "En el espacio " + i + " esta el valor: " + lista[i]);
    } //Fin del metodo mostarArray
    
    }   
}
    