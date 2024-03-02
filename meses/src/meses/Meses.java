/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meses;

import javax.swing.JOptionPane;

/**
 * @since 22-03-2022
 * @author Marco.Rivera
 * @version 1.0
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Declaro un vector con meses del ano
//        String[] meses = new String[12];
//        meses[0] = "Enero";
//        meses[11] = "Diciembre";
//        
//        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero mes"));
//        
//        JOptionPane.showMessageDialog(null,"El mes ingresado corresonde a: " + meses[mes - 1]);;
double notaMin=95;
        int cantidadEstudiantes=10;
        double notas[] = new double[cantidadEstudiantes];
        //Antes del ciclo se pide la cantidad de estudiantes y la nota minima
        for(int i=0; i<cantidadEstudiantes; i++){
            notas[i] = 100-i;   //Aqui se le asigna segun diga el usuario la nota a cada alumno
        }
        //En este ciclo se separan los que pasaron y los que no
        for(int i=0; i<cantidadEstudiantes; i++){
            if(notas[i]>=notaMin){
                System.out.println(notas[i]);
            }
        }
        
    }
    
}
