package boletinModulos;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Realiza un programa que pinte una pirámide por pantalla. La altura de la
		 * pirámide se debe pedir por teclado. El carácter con el que se pinta la
		 * pirámide también se debe pedir por teclado
		 */

		int altura, espacio;

		String string;
		char c;

		System.out.println("Introduzca un caracter para dibujar los espacios");
		string = sc.nextLine();
		c = string.charAt(0);

		System.out.println("Introduzca el tamaño de la piramide");
		altura = sc.nextInt();

		for (int i = 1; i <= altura; i++) { // inicializamos en 1. Va ir repitiendo el ciclo segun la altura que le
											// indiquemos
			for (int j = 0; j <= altura - i; j++) { // Estos van a ser los espacios hasta el numero // J = 0 importante
													// (Altura-x)= espacios
				System.out.print(c);
			}
			for (int k = 1; k <= i; k++) { // Relleno numerico
				System.out.print(k);
			}
			for (int l = 1; l < i; l++) { //Otro bucle que iguale la variable i por lo que tendremos una repeticion de las misas ejecuciones
				System.out.print(l);	 // Relleno numerico
			}
			for(int m=0; m <= altura -i; m++) { //Otro bucle para generar espacios
				System.out.print(c);
			}
			System.out.println();
			// salto de linea para que imprima secuencialmente
		}
		for(int n=1;n<=(altura*2)+1;n++) { // un ultimo bucle sin anidar que se encargue de cerrar el cuadrado
			System.out.print(c);		//La base de la piramide sera el resultadod de multiplicar su altura *2 + 1
		}

	}
}
