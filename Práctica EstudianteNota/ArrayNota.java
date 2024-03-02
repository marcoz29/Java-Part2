package com.progra1.estudiantenota;

/**
 *
 * @author ariel
 */
public class ArrayNota
{
	private int notas[];
	
	public ArrayNota(int tamanio) // tamanio del vector nota
	{
		notas = new int[tamanio];
	}
	
	public void llenarNota(int posicion, int nota)
	{
		notas[posicion] = nota;
	}
	
	public int buscarNota(int nota)//recorre el array para buscar por nota
	{
		int posicion = -1;
		
		for(int i = 0; i < notas.length; i++) 
		{
			if(notas[i] == nota)
			{
				posicion = i;
			} 
		}
		return posicion;		
	}
	
	public int devolverNota(int posicion) //retorna la nota
	{
		int nota = -1;
		if ((posicion>=0) && (posicion<notas.length))
		{
			nota = notas[posicion];
		}
		return nota; 
	}	
}
