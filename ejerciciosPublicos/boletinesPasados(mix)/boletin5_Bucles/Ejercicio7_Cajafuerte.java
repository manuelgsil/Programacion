package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio7_Cajafuerte {

	public static void main(String[] args) {
		/*
		 * Realiza el control de acceso a una caja fuerte. La combinación será un número
		 * de 4 cifras que estará guardado en una variable. El programa nos pedirá la
		 * combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo
		 * siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte
		 * se ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir
		 * la caja fuerte
		 */
		Scanner sc = new Scanner(System.in);
		final int PASS = 1234;
		int clave, intento = 0;

		System.out.println("introduzca la clave de la caja fuerte");
		System.out.println("Dispone de cuatro intentos");
		System.out.println("Clave: ");
		clave = sc.nextInt();
		switch (clave) {

		case 1234:
			System.out.println("Acceso concedido. Disfrute de su euro");
			break;

		default:
			while (clave != PASS) {
				System.out.println("Clave incorrecta");
				intento++;
				System.out.println("Este es el intento numero: " + intento);
				System.out.println("Al cuarto se bloqueara");
				if (intento < 4) {
					System.out.println("Introduzca la clave de nuevo: ");
					clave = sc.nextInt();
				} else {
					System.out.println("Acceso denegado");
					break;
				}

			}

		}

	}
}
