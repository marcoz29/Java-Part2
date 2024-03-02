/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejocadenas;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class ManejoCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    String nombre = "marco";
    String nombre2 = "MARCO";
    
    //length
        JOptionPane.showMessageDialog(null, "La cantidad de letras que contiene la palabra es de: " + nombre.length(), "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        
        //chatAT
        JOptionPane.showMessageDialog(null, "La tercera letra es: " + nombre.charAt(2));
        
        //Comparar cadenas si o no son iguales
        if(nombre.equals(nombre2)){
            System.out.println("Las dos cadenas son iguales");
        }else{
            System.out.println("Las dos cadenas son diferentes");
        }
        if(nombre.equalsIgnoreCase(nombre2)){
            System.out.println("Las dos cadenas son iguales");
        }else{
            System.out.println("Las dos cadenas son diferentes");
        }
    
    //compareTo
    int resultado2 = nombre2.compareToIgnoreCase(nombre);
    JOptionPane.showMessageDialog(null, resultado2);
    
    //Elimina espacios en blanco
    String cadena = "buenos dias\n buenas noches\n hasta luego";
    String nombreModificado = cadena.trim(); //Elimina espacios antes y despues de la cadena
    System.out.println(nombreModificado.replace(" ",""));
    System.out.println(nombreModificado.replaceAll("\s", ""));
    
    //Extraccion de sub cadenas
    String str = "Hoy es 30 de mayo";
    String subStr= str.substring(2);
    System.out.println(subStr);
    
    //minuscula a mayuscula
    System.out.println("nombre: " + nombre.toUpperCase());
    //A minuscula
    JOptionPane.showMessageDialog(null,"nombre: " + nombre.toLowerCase());
    
    }
}
