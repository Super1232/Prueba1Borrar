package Strings;

public class strin {

	public static void main(String[] args) {
		//Un string es inmutable es decir que una vez que le das un valor ya no se puede cambiar
		
		//Para poner todo el string en mayusculas 
		String nombre = "Caperucita roja";
		
		//Esto no es que cambia el string a todo mayusculas si no que crea un nuevo string y el objeto anterior se elimina porque la variables se elimina y para que aparezca en mayuscula actualizam la variable
		nombre = nombre.toUpperCase();
		
		System.out.println(nombre);
		
		//Para comparar dos strings 
		String lobo1 = "Lobo";
		String lobo2 = "Lobo";
		System.out.println(lobo1==lobo2);
		
		//Para ver en que acaba un string En este caso caperucita roja acaba en ja
		System.out.println(nombre.endsWith("OJA"));
		
		//Para ver en que valor empieza 
		System.out.println(nombre.startsWith("CAPE"));
		
		//Para saber en que posicion esta un determinado caracter Si no lo encuentra te devuelve menos uno 
		System.out.println(nombre.indexOf("A"));
		
		//Esto es igual solo que empezando desde el final
		System.out.println(nombre.lastIndexOf("A"));
		
		//Esto lo que hace es eliminar los espacios en blanco de izquierda a derecha pero te mantiene los espacios del medio
		System.out.println("    asd ad   ".trim());
		
		//Esto elimina todos los espacios en blaco que tenga el string
		System.out.println("   AAD  D GF D  DSF".replace(" ",""));
		
		//Esto lo que hace es eliminar todo hasta la posicion que le pongas 
		System.out.println(nombre.substring(3));
	
		//Si quieres imprimir solo un intervalo 
		System.out.println(nombre.substring(5,9));
		
		//Ejercicio en clase solo imprimir roja
		//Lo que hacemos es buscar la posicion
		int posicion=nombre.indexOf("ROJA");
		//Despues cuando ya tienes la posicion 
		System.out.println(nombre.substring(posicion));
		
		//Esto lo que hace es si te dan la informacion troceada por puntos y comas
		String Cadena = "N1;A1;DNI1;23;MADRID";
		//Lo que haces es crear un split para que te cree strings separados en la lista y te cree objetos para cada uno que este separado por un putno y coma
		String [] valores= Cadena.split(";");
		//String es de que esta compuesta la lista valor es como si fuera la i en python y valores es de donde viene la lista
		for(String valor:valores) {
			System.out.println(valor);
			
		
		}
		
		
		

	
	}

}
