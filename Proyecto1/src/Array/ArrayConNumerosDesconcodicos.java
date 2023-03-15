package Array;

public class ArrayConNumerosDesconcodicos {

	public static void main(String[] args) {
		//Array con numeros desconocidos. Le dices que te cree una matriz con numeros desconocidos con una matriz que te crea lo primero el numero de filas (2) y luego el numero de columnas (3)
		int [][]	numeros = new int[2][3];
		
		//Para meter valores a la matri
		numeros[1][1]=8;
		
		//Para aceder a la informacion de la matriz
		System.out.println(numeros[1][1]);
		
		//Para saber el numero de filas que tiene la matriz
		System.out.println("Numero de filas"+numeros.length);
		
		//Para saber el numero columnas
		System.out.println("Numero de columnas"+ numeros[1].length);
		
		//Para recorer todos los numeros de la matriz
		for (int i = 0; i < numeros.length; i++) {//Para que recorra la fila
			for (int j=0; j<numeros[i].length ; j++) {//Para que recorra la columna
				System.out.print(numeros[i][j]);
			}
			System.out.println();
			
		}
		
	}

}
