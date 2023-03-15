package EjerciciosDeClase;

	import java.util.Scanner;

import MetodosStatic.Utils.Utilidades;

	public class Menu {

		public static void main(String[] args) {
			//La clase utilidades esta dentro de MetodosStatid

			String menu;

			do {

				
				Scanner scan = new Scanner(System.in);
				//Aqui lo que he hecho es llamar a la funcion utilidades
				Utilidades.pintarMen();
				
				menu = Utilidades.pideDatos("Elige una opcion");
				
				
				if (menu.equalsIgnoreCase("1")) {
					validarEmail();

				} else if (menu.equalsIgnoreCase("2")) {
					pintaCuadrado();

				} else if (menu.equalsIgnoreCase("3")) {
					System.out.println("\nOpción 3 seleccionada");

				} else if (menu.equalsIgnoreCase("4")) {
					System.out.println("\nSe ha salido del menú");
					//modificacion borrar

				} else {
					System.out.println("\nOpción seleccionada no válida");
				}

			} while (!menu.equalsIgnoreCase("4"));

		}

		// Creamos una función
		public static void validarEmail() {

			String email = Utilidades.pideDatos("Introduce el Email");

			email = email.trim();
			String mensajeError = "";

			// Validamos el email
			// El email debe contener solo una @
			if (email.indexOf("@") == -1) {
				mensajeError += "El email no tiene arroba. ";
			} else if (email.indexOf("@") != email.lastIndexOf("@")) {
				mensajeError += "El email no puede tener mÃ¡s de una arroba. ";
			} else {
				// DespuÃ©s de la @ tiene que haber al menos un punto
				String dominio = email.substring(email.indexOf("@") + 1);
				if (dominio.indexOf(".") == -1) {
					mensajeError += "DespuÃ©s de la @ debe haber al menos un punto. ";
				} else {

					int diferencia = dominio.length() - (dominio.lastIndexOf(".") + 1);
					if (diferencia < 2 || diferencia > 6) {
						mensajeError += "DespuÃ©s del Ãºltimo punto solo puede haber " + "entre 2 y 6 caracteres. ";
					}
				}
			}

			// El email no puede tener espacios en blanco
			if (email.contains(" ")) {
				mensajeError += "El email no puede tener espacios en blanco. ";
			}

			// Compruebo si ha habido errores
			if (mensajeError.equals("")) {
				System.out.println("El email " + email + " es correcto");
			} else {
				System.out.println("El email " + email + " no es correcto " + mensajeError);
			}

		}

		// Para crear una fucnión
		public static void pintaCuadrado() {
			int tamaño = 4;

			for (int i = 0; i < 4; i++) { // Filas
				for (int j = 0; j < 4; j++) { // Columnas
					if (i == 0 || i == 3) {
						System.out.print("X\t");
					} else {
						if (j == 0 || j == tamaño - 1) {
							System.out.print("X\t");
						} else {
							System.out.print("\t");
						}
					}

				}
				System.out.print("\n");
			}

		}

	}

