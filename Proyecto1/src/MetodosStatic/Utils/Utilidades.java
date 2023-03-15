package MetodosStatic.Utils;

import java.util.Scanner;

public class Utilidades {
//	Vamos a trabajar con el ejercicio del menu y vamos ha hacer parte de las funciones que haciamos en ese ejercicio las vamos ha hacer en este
//	Pintar menu

	public static void pintarMen() {
		/**
		 * Esto es para que cuando pinches en el metodo donde has importado la funcion te apareca esto como hayuda
		 * Para que apareca en el funcion
		 */
		System.out.println(
				"\nSeleccione la opción deseada entre:\n1) Validar email\n2) Pintar el cuadrado\n3) Mostrar datos\n4) Salir");
	}
	
	
	public static void pintarMen(String menu) {
		/**
		 * Esto es para que cuando pinches en el metodo donde has importado la funcion te apareca esto como hayuda
		 *Esto lo que hace es que a partir de un string que le metas a al funcion te va a imprimir lo que le has puesto
		 */
		System.out.println(menu);
	}
	
	public static void pintarMen(String[] menu) {
		/**
		 * Aqui lo que hace es que como se llaman igual pero cogen distintos tipos de datos si no le pones nada te cojera la primera funcion
		 * si le mentes un string te cojera la segunda funcion
		 * si le metes un array te cojera la tercera Esto se llama sobrecarga y consiste en poner varias funciones todas 
		 * con el mismo dato y dependiento de que tipo de dato le pongas inicializa una u otra
		 */
		
		for (String opcion:menu) {
			System.out.println(opcion);
		}
	}
		
	public static void pintarMen(String menu,String Caracter) {
		/**
		 * Esto es para que segun el caracter que separe los parabras te las separe en forma de string lo primero te crea un string y lo 
		 * segundo segun el caracter de division pongas lo almacena en un array
		 */
		String [] opciones = menu.split(Caracter);
		pintarMen(opciones);
		
	}
	
	
	
	
	public static String pideDatos(String mensaje) {
		/**
		 * Creas una variable y metes lo de pedir el dato y alamacenarlo 
		 * Eso antes estaba en la clase menu pero ahora hemos creado esto
		 */
		String resultado = "";
		
		System.out.println(mensaje);
		Scanner scan = new Scanner(System.in);
		resultado = scan.nextLine();
		
		return resultado ;
	}
	
		
	
	

}
