package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio020_Juego {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Programa que permita el siguiente juego: Un primer jugador teclea un n�mero
		 * entre 1 y 50 (debe comprobarse que sea correcto). El segundo jugador
		 * intentar� adivinarlo. Para ello tendr� como m�ximo 5 intentos y el programa
		 * ir� sacando mensajes indicando si el n�mero a adivinar es mayor o menor al
		 * n�mero introducido por el jugador 2. Al final se indicar� si el jugador gan�
		 * o perdi�. Si se adivina el n�mero antes de que finalicen los 5 intentos el
		 * programa finaliza.
		 */

		int buscador, intento, numeroMisterioso;

		System.out.println("Tiene 5 intentos para adivinar un numero");

		System.out.println("El numero a buscar est� comprendido entre 1 y 50");
		System.out.println(" ");
		System.out.println("Jugador 1: INTRODUZCA EL NUMERO MISTERIOSO");
		numeroMisterioso = sc.nextInt();
		for (numeroMisterioso = numeroMisterioso; numeroMisterioso > 50
				|| numeroMisterioso < 1; numeroMisterioso = sc.nextInt()) {
			System.out.println("Introduzca un numero valido");

		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("Jugador 2: Tiene 5 intentos para descubrir el numero introducido");
		System.out.println(" ");
		System.out.println("Introduzca un numero");
		buscador = sc.nextInt();

		for (buscador = buscador; buscador > 50 || buscador < 1; buscador = sc.nextInt()) {
			System.out.println("Introduzca un numero valido");
		}

		intento = 1;

		while (intento < 5) {

			if (buscador > numeroMisterioso) {
				System.out.println("Estas buscando un numero menor");
				System.out.println("Numero de intentos: " + intento);
				System.out.println("Introduce otro numero");
				buscador = sc.nextInt();
			} else if (buscador < numeroMisterioso) {
				System.out.println("Estas buscando un numero mayor");
				System.out.println("Numero de intentos: " + intento);
				System.out.println("Introduce otro numero");
				buscador = sc.nextInt();
			} else if (buscador == numeroMisterioso) {
				System.out.println("ACERTASTE!");
				System.out.println("Numero de intentos: " + intento);
				intento = 5;
			}
			intento++;
			if (intento == 5)
				System.out.println("Se acabaron los intentos");
		}

	}

}
