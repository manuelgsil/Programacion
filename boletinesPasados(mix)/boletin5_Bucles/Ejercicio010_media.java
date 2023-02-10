package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio010_media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Escribe un programa que calcule la media de un conjunto de n�meros positivos
		 * introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se
		 * introducir�n. El usuario indicar� que ha terminado de introducir los datos
		 * cuando meta un n�mero negativo.
		 */

		double mediaTotal, n, contador = 0, sumaNumeros = 0;
		boolean limite = false;

		System.out.println("Introduzca los par�metros para realizar la media");
		System.out.println("Para indicar que ha terminado de introducir datos inserte un numero negativo  ");
		while (limite == false) {
			System.out.println("Numero: ");
			n = sc.nextDouble();

			if (n <= 0) {
				System.out.println("ejecuci�n detenida");
				limite = true;
				mediaTotal = sumaNumeros / contador;
				System.out.println("La media total de los numeros introducidos seria: " + mediaTotal);

			}
			// Colocamos el contador y la suma de n�meros fuera del condicional
			sumaNumeros += n;
			contador++;
		}

	}

}
