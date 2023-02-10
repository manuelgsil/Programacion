package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio8_ {

	public static void main(String[] args) {

		/*
		 * Muestra la tabla de multiplicar de un número introducido por teclado.
		 * Formatea la salida de la siguiente manera: 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6
		 */
		Scanner sc = new Scanner(System.in); // creamos el scanner para recoger datos
		System.out.println("Que tabla de multiplicar quieres saber");

		int tabla = sc.nextInt(), limite = 0;
		while (limite <= 10) {
			{
				System.out.println(tabla + "x" + limite + "=" + tabla * limite);
			}
			limite++;

		}

	}

}
