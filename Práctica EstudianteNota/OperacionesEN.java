/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra1.estudiantenota;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class OperacionesEN {

    //se llama a los arreglos estudiantes y notas
    ArrayEstudiante miEstudiante;
    ArrayNota miNota;
    int tamArray = 0;

    public OperacionesEN() {
        tamArray = Integer.parseInt(JOptionPane.showInputDialog("Para crear el registro: \n Ingrese la cantidad de Estudiantes"));

        miEstudiante = new ArrayEstudiante(tamArray);
        miNota = new ArrayNota(tamArray);

    }//fin del constructor

    public void menu() {
        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema de notas de estudiantes\nDigite una operacion a realizar:\n 1. Llenar Notas\n"
                    + " 2. Sacar Promedio de Notas\n 3. Ordenar Notas de Mayor a Menor\n 4.Sumar Notas\n 5. Nota Mayor\n 6. Nota Menor\n 7. Limpiar Notas\n 8. Modificar Notas\n"
                    + " 9. Eliminar Notas\n 10. Imprimir Notas\n 11. Salir"));

            switch (opcion) {
                case 1:
                    ingresarNotas();
                    break;
                case 2:
                    promedioNotas();
                    break;
                case 3:
                    ordenarNotas();
                    break;
                case 4:
                    sumarNotas();
                    break;
                case 5:
                    notaMayor();
                    break;
                case 6:
                    notaMenor();
                    break;
                case 7:
                    limpiarNotas();
                    break;
                case 8:
                    //modificarNotas
                    break;
                case 9:
                    //eliminarNotas
                    break;
                case 10:
                    //imprimirNotas
                    break;
                case 11:
                    //salir
                    System.exit(0);
                    break;

            }//fin del switch

        } while (opcion != 12);

    }//fin del metodo menu

    public void ingresarNotas() {

        //variables
        String nombre;
        int calificacion;

        for (int i = 0; i < tamArray; i++) {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            this.miEstudiante.llenarEstudiante(i, nombre);

            calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del estudiante " + nombre));
            this.miNota.llenarNota(i, calificacion);

        }//fin del for
    }//fin del metodo ingresarNotas

    public double promedioNotas() {

        //variables
        int i;
        double promedio = 0;

        for (i = 0; i < tamArray; i++) {
            promedio += miNota.devolverNota(i) / tamArray;
        }
        System.out.println("El promedio de las notas es: " + promedio);
        return promedio;

    }//fin del metodo promedioNotas

    public void ordenarNotas() {

        //variables
        int ordenarN;
        String ordenarE;

        for (int j = 0; j < tamArray; j++) {
            for (int k = 0; k < tamArray - 1; k++) {
                
                if(miNota.devolverNota(k)>miNota.devolverNota(k+1))
                {
                    //ordenar notas
                    ordenarN = miNota.devolverNota(k);
                    miNota.llenarNota(k, miNota.devolverNota(k+1));
                    miNota.llenarNota((k+1), ordenarN);
                    
                    //ordenar estudiante
                    ordenarE = miEstudiante.devolverEstudiante(k);
                    miEstudiante.llenarEstudiante(k, miEstudiante.devolverEstudiante(k+1));
                    miEstudiante.llenarEstudiante((k+1), ordenarE);
                }//fin del if
                
               
            }//fin del for k

        }//fin del for j
      System.out.println(imprimirNotas(miNota, miEstudiante));
    }//fin del metodo ordenarNotas
    
    public int sumarNotas(){
        
        //variable
        int suma = 0;
        for(int i = 0; i<tamArray; i++){
            suma+= miNota.devolverNota(i);
            
        }//fin del for
        System.out.println("La suma total de las notas es: "+suma);
        return suma;
    }//fin del metodo sumarNotas
    
    public int notaMayor(){
        
        //variables
        int mayor = 0;
        int indice = 0;
        int i;
        for(i=0; i<tamArray; i++){
            if(miNota.devolverNota(i)>mayor){
                mayor = miNota.devolverNota(i);
                indice = i;
            }//fin del if
        }//fin del for
        
        System.out.println("La nota mayor es: " +mayor+ " del estudiante: " +miEstudiante.devolverEstudiante(indice));
        return mayor;
        
    }//fin del metodo notaMayor
    
    public int notaMenor(){
        int menor = 9990;
        int indice = 0;
        int i;
        
        for(i=0; i<tamArray; i++){
            if(miNota.devolverNota(i) < menor){
                menor= miNota.devolverNota(i);
                indice = i;
            }//fin del if
        }//fin del for
        return menor;
    }//fin del metodo notaMenor
    
    public void limpiarNotas(){//inicilizamos ambos arrays
        
        for(int i=0; i<tamArray; i++)
        {
            miEstudiante.llenarEstudiante(i, " null ");
            miNota.llenarNota(i, 0);
        }
        
        System.out.println("Se ha limpiado el registro de estudiante con sus notas respectivas");
    }//fin del metodo limpiarNotas
    
    
    //aquí finalizó la lección 5
    public void modificarNotas(){
        String modificar = JOptionPane.showInputDialog("Ingrese el nombre del estudiante que desea modificar la nota: ");
		
		for(int i = 0; i < tamArray; i++)
		{
			if(modificar.equals(miEstudiante.devolverEstudiante(i)))
			{
				int notaNueva = Integer.parseInt(JOptionPane.showInputDialog("Digite la nueva nota para el estudiante: " + modificar));
				miNota.llenarNota(i, notaNueva);
			}
		}
	}
	
	public void eliminarNotas()
	{
		String eliminar = JOptionPane.showInputDialog("Digite el nombre del estudiante que desea borrar del registro");
		
		for (int i = 0; i < tamArray; i++)
		{
			if(eliminar.equals(miEstudiante.devolverEstudiante(i)))
			{
				miEstudiante.llenarEstudiante(i, " null");
				miNota.llenarNota(i, 0);
			}
		}
	}
	
	public String imprimirNotas(ArrayNota miRegistro, ArrayEstudiante registroNombre)
	{
		String imprimir = "";
		for(int i=0; i < tamArray;i++)
		{
			imprimir+=miRegistro.devolverNota(i)+", "+registroNombre.devolverEstudiante(i)+"\n";
		}
		return imprimir;		
	}


    
    

}//fin de la clase OperacionesEN

