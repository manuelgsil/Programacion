package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio014_numeroMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Haz una función que dados 3 números a, b y c introducidos por teclado
		 * devuelva cuál es el mayor
		 */

		int a, b, c;
		boolean limite = false;
		System.out.println("Introduzca tres numero para saber su orden de mayor a menor");
		System.out.println("Si desea salir del programa introduzca 0 0 0");

		while (limite == false) {

			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if (a > b && a > c) {
				if (b > c) {
					System.out.println(a + " " + "" + b + " " + c);
				} else {
					System.out.println((a + " " + c + "" + b));
					;
				}
			} else if (b > a && b > c) {
				if (a > c && c < b) {
					System.out.println(b + " " + a + " " + c);
				} else {
					System.out.println((b + " " + c + "" + a));
				}
			} else if (c > a && c > b) {
				if (b > a) {
					System.out.println(c + " " + b + " " + a);
				} else {
					System.out.println(c + " " + a + " " + b);
				}
			}
			if (a == 0 && b == 0 && c == 0)
				limite = true;

		}

	}
}
