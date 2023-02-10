package boletin4_Condicionales;

import java.util.Scanner;

public class Ejercicio10_numeroDivisible5 {

	public static void main(String[] args) {
		// Declaramos las variables

		Scanner input = new Scanner(System.in);

		int numero;

		// Pregunta

		System.out.println("Introduzca un numero: ");

		numero = input.nextInt();

		// Condiciones

		if ((numero % 2) == 0) {// Que es par

			if ((numero % 5) == 0) {// Que es divisible entre 5

				System.out.println("El numero es par y divisible entre 5.");

			} else {// Que NO es divisible entre 5

				System.out.println("El numero es par y no es divisible entre 5.");

			}

		} else {// Que es impar

			if ((numero % 5) == 0) {

				System.out.println("El numero es impar y divisible entre 5.");

			} else {

				System.out.println("El numero es impar y no es divisible entre 5.");
			}
		}

	}

}
