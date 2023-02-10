package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio012_sumaParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * Visualiza por pantalla la suma de los números pares y la suma de los impares
		 * desde 1 hasta 100.
		 */
		int pares = 0, impares = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				pares = i;
				System.out.println("Par: " + pares);
			} else {
				impares = i;
				System.out.println("Impar: " + impares);
			}

		}

	}

}
