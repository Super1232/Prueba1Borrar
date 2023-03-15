package ValidadorDeEmail;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {

//		Pedir un email, y pasar las siguientes validaciones
//		1. Solo tiene que tener una @
//		2. No puede tener espacios en blanco
//		3. Despues de la @ tiene que haber al menos un punto
//		4. Despues del ultimo punto solo puede haber entre 
//		    2 y 6 caracteres
//		Indicar si el email es valido o no y en caso de que no lo sea el motivo
		
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca el Email");
		String Email = lectura.next();
		
		//Para que no tenga espacios en blanco
		String EmailSinEspacios;
		EmailSinEspacios = Email.replace(" ","");
		
		int Comprobador1 = 0, Comprobador2 = 0, Comprobador3 = 0;
		
		
		//Para validar los arrobas
		int posicion, contador=0;
		//Busco la posicion del primer arroba
		posicion = EmailSinEspacios.indexOf("@");
		//Este bucle lo hago para que si hay mas @ siga funcionando
		while(posicion != -1) {
			contador++;
			//Aqui a partir de donde a encontrado el ultimo arroba sige contando 
			posicion=EmailSinEspacios.indexOf("@",posicion+1);
		}
		
		if(contador>=1 && contador <2) {
			
			//Para que haya un punto despues del arroba

			int posicion1, contador1 = -1;
			//Busco la posicion del primer arroba
			posicion1 = EmailSinEspacios.lastIndexOf(".");
			//Este bucle lo hago para que si hay mas @ siga funcionando
			while(posicion1 != -1) {
				contador1++;
				//Aqui a partir de donde a encontrado el ultimo arroba sige contando 
				posicion1=EmailSinEspacios.indexOf(".",posicion+1);
			}
			if (contador1==0) {
			
				System.out.println(" Error le falta bun punto despues del arroba");
				Comprobador1++;
			}
				
		}else {
			System.out.println("Error este email contiene con un numero de arrobas incorrecto");
			Comprobador1++;		
			}
		
		int Total, Final,CaracteresUltimos=0;
		Total=EmailSinEspacios.length();
		Final=EmailSinEspacios.lastIndexOf(".");
		CaracteresUltimos = Total - Final;

		if (Final<0) {
			System.out.println("Error al codigo le faltan puntos");
			
		}
		else {
			
		if(CaracteresUltimos>6 || CaracteresUltimos<2) {
				System.out.println("Error este email no tiene un numero los caracteres finales correc");
				Comprobador3++;
			}
		}
		
		
		
		
		
		
		
		
		if(Comprobador1==0 && Comprobador2==0 && Comprobador3==0) {
			System.out.println("Este email esta validado");
		}
		else {
			System.out.println("Este email no ha sido validado devido a los fallos anteriores");
		}
		
		
		
		
		
		
	}

}
