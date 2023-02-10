package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio019_factorIncremento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * Programa que pida por teclado: • Un valor inicial (inicial). • Un factor de
		 * incremento (incremento). Los dos valores deben ser mayores que cero y de tipo
		 * entero. Si son menores o iguales que cero se pedirán de nuevo. Se desea:
		 * Visualizar una serie de 5 números, comenzando en inicial e incrementando
		 * según el factor de incremento. Visualizar el resultado de sumar los 5
		 * números.
		 */

		int valorInicial, factorIncremento, sumaValores = 0, numeroSucesion = 0;
		boolean limite = false;

		// PEDIMOS AL USUARIO LOS DATOS
		System.out.println("Introduzca un valor inicial");
		valorInicial = sc.nextInt();
		// CREAMOS UNA ESTRUCTURA UN BUCLE FOR CONDICIONAL (SE REPITE SI NO ES EL VALOR
		// QUE QUEREMOS/
		for (valorInicial = valorInicial; valorInicial <= 0; valorInicial = sc.nextInt()) {
			System.out.println("Introduzca un numero mayor que 0");
			;

		}

		System.out.println("Introduzca un factor de incremento");
		factorIncremento = sc.nextInt();

		for (factorIncremento = factorIncremento; factorIncremento <= 0; factorIncremento = sc.nextInt()) {
			System.out.println("Introduzca un numero mayor que 0");
			;
		}

		System.out.println("El valor inicial escogido es " + valorInicial);
		System.out.println("El factor de incremento es " + factorIncremento);

		while (limite == false) {
			numeroSucesion++;
			valorInicial += factorIncremento;
			System.out.println("Incremento numero " + numeroSucesion + " " + valorInicial);
			sumaValores += valorInicial;
			if (numeroSucesion == 5) {
				limite = true;
				System.out.println("La suma total seria: " + sumaValores);
			}

		}

	}
}
