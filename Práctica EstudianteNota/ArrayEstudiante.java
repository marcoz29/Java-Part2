package com.progra1.estudiantenota;

/**
 *
 * @author ariel
 */
public class ArrayEstudiante
{
	private String estudiantes[];
	
	public ArrayEstudiante(int tamanio)
	{
		estudiantes = new String[tamanio];
	}
	
	public void llenarEstudiante(int posicion, String nombre)
	{
		estudiantes[posicion] = nombre;
	}
	
	public int buscarEstudiante(String nombre)
	{
		int posicion = -1;
		
		for(int i = 0; i < estudiantes.length; i++)
		{
			if(estudiantes[i] == nombre)
			{
				posicion = i;
			} 
		}
		return posicion;			
	}
	
	public String devolverEstudiante(int posicion)
	{
		String nombre = "";
		if ((posicion>=0) && (posicion<estudiantes.length))
		{
			nombre = estudiantes[posicion];
		}//Fin del if
		return nombre;		
	}
        
        
}
