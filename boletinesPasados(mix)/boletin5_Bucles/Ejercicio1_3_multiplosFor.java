package boletin5_Bucles;

public class Ejercicio1_3_multiplosFor {

	public static void main(String[] args) {
		for (int i = 5; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i);
				System.out.print(" ");

				ejercicio2while();
				ejercicio3doWhile();
			}

		}

	}

	private static void ejercicio3doWhile() {
		// Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle dowhile.
		int i = 0;

		do {
			if (i % 5 == 0)
				System.out.println(i);
			i++;
		} while (i <= 100);
	}

	private static void ejercicio2while() {
		// Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
		int i = 5;
		while (i <= 100) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++;

		}

	}
}
