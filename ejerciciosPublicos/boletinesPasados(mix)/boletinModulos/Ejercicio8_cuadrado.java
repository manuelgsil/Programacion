package boletinModulos;

import java.util.Scanner;

public class Ejercicio8_cuadrado {
	/*
	 * Ejercicio 8: Desarrollar un método que tenga como parámetro de entrada, la
	 * altura y base de un cuadrado. El método debe mostrar por pantalla un cuadrado
	 * pintado con asteriscos con dichas dimensiones. Por ejemplo para 3 y 5 sería:
	 *****
	 *****
	 *****
	 */
	public static void main(String[] args) {
		int altura, base;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce altura");
		altura = sc.nextInt();
		System.out.println("Introduce base");
		base = sc.nextInt();
		cuadrado(altura, base);

	}

	static void cuadrado(int altura, int base) {
		for (int i = 0; i < altura; i++) { //lo que le pido es que repita la base 3 veces
			for (int j = 0; j < base; j++) { // Aqui anidamos el siguiente bucle for que es el que se encarga de imprimir los asteriscos
				System.out.print("*");
			}
			System.out.println(); // al salir de la anidacion, en el bucle principal, le pido un salto de linea
		}

	}

}
