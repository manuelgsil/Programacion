package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio9_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido
		 * por teclado. Hacer uso de while o do-while
		 */

		int numeroIntroducido, contador = 1, digitos;
		boolean limite = false;

		System.out.println("Introduzca un numero para saber sus d�gitos");
		numeroIntroducido = sc.nextInt();

		while (limite == false) {
			numeroIntroducido /= 10;
			contador++;
			if (numeroIntroducido / 10 == 0) {
				System.out.println(contador);
				limite = true;
			}

		}

	}

}
