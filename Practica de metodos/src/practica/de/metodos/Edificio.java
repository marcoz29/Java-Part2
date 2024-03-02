/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.de.metodos;

import java.awt.font.TextAttribute;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Edificio {
    boolean[][] edificio;
    Scanner input = new Scanner(System.in);

    public void Edificio() {
        System.out.println("Digite la cantidad de edificios: ");
        int pisos = input.nextInt();
        System.out.println("Digite la cantidad de habitaciones: ");
        int habitaciones = input.nextInt();
        edificio = new boolean[pisos][habitaciones];
        System.out.println("Se creo correctamente la matriz");
        for (int i = 0; i <pisos; i++) {
            System.out.print("{");
            for(int j = 0; j<habitaciones; j++){
                System.out.print(edificio[i][j]);
                if (j<edificio[i].length-1){
                    System.out.print("-");
                }

            }

            System.out.println("}");

        }

    }
        public void reserva(){
        System.out.println("Digite el numero de piso: ");
        int piso = input.nextInt();
        System.out.println("Digite el numero de habitacion: ");
        int habitacion = input.nextInt();
        if (!edificio[piso][habitacion]) {
            edificio[piso][habitacion] = true;
            System.out.println("Se agrego correctamente");
        } else {
            System.out.println("El espacion esta ocupado");
        }

        for (int i = 0; i < edificio.length; i++) {

            System.out.print("{");

            for (int j = 0; j < edificio[i].length; j++) {
                System.out.print(edificio[i][j]);
                if (j < edificio[i].length - 1) {
                    System.out.print("-");

                }
            }
        }
    }

}
