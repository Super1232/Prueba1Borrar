package Array;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		
		//Esto es una lista
		String []  Colores = {"Rojo","Azul","Amarillo"};
		
		//Para aceder a los valores y elijes la posicion
		System.out.println(Colores[0]);
		
		//Para ver el tamaño del Array
		System.out.println(Colores.length);
		
		//Para recorre el Aray con el for tradicional vamos a ir cambiando la posicion del valor
		for (int i = 0; i < Colores.length; i++) {
			System.out.println(Colores[i]);
			
		}
		
		//Para hacerlo con un nuevo bucle (Foreach) A la derecha ponemos el elemento que queremos recorrer y a al izquierda el tipo de datos del array
		for(String Color : Colores) {
		System.out.println(Colores);
		}
		
		
		
		//Array con numeros desconocidos. Le dices que te cree una matriz con numeros desconocidos con una matriz que te crea lo primero el numero de filas (2) y luego el numero de columnas (3)
		int [][]	numeros = new int[2][3];
		
		//Para aceder a la informacion de la matriz
		System.out.println(numeros[1][1]);
		
		//Para meter valores a la matri
		numeros[1][1]=8;
		
		//Para saber el numero de filas que tiene la matriz
		System.out.println("Numero de filas"+numeros.length);
		
		//Para saber el numero columnas
		System.out.println("Numero de columnas"+ numeros[1].length);
		
		
		
		

}

}
