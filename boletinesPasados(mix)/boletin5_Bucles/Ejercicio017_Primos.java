package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio017_Primos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Escribe un programa que diga si un número introducido por teclado es o no
		 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
		 * unidad. Por ejemplo el 7. Pues recorriendo desde el 1 hasta el 7 veo que 7
		 * solo es divisible por 1 y por 7 es primo.
		 */

		int numero, contador = 1, primoComprobador = 0; // declaramos la ultima variable para usarlo en los
														// condicionales

		// SI primo comprobador es 2 significara que solo es divisible entre dos numeros
		// (el mismo y 1)
		System.out.println("Introduzca un numero para averigurar si es primo o no");
		numero = sc.nextInt();
		while (contador <= numero) {

			if (numero % contador == 0) {
				primoComprobador++;
				// System.out.println(primoComprobador);
			}
			contador++;

		}
		if (primoComprobador == 2) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

		correcionMoises();

	}

	private static void correcionMoises() {
		/*
		 * 
		 * Escribe un programa que diga si un número introducido por teclado es o no
		 * 
		 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
		 * 
		 * unidad. Por ejemplo el 7. Pues recorriendo desde el 1 hasta el 7 veo que 7
		 * 
		 * solo es divisible por 1 y por 7  es primo.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int numero, i = 2;

		boolean esPrimo = true;

		System.out.println("Escribe un numero y te digo si es primo o no:");

		numero = sc.nextInt();

		while (i < numero && esPrimo == true) {

			if (numero % i == 0) {

				esPrimo = false;

			}

			i++;

		}

		if (esPrimo == true)

			System.out.println("El numero " + numero + " es primo");

		else

			System.out.println("El numero " + numero + "  no es primo");

	}

}
