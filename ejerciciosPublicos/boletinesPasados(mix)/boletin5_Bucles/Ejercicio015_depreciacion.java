package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio015_depreciacion {

	public static void main(String[] args) {

		/*
		 * Un ordenador se deprecia cada a�o un 40% sobre el valor del a�o anterior.
		 * Obtener un listado de la depreciaci�n a lo largo de los a�os, suponiendo que
		 * por debajo de 300 euros no se deprecia. La salida podr�a ser: PRECIO
		 * ADQUISICI�N 2000 A�OS VALOR_ORDENADOR 1 1200 2 720 3 432 4 259,2 El ordenador
		 * se depreci� en 4 a�os
		 */
		Scanner sc = new Scanner(System.in);
		double precioOrdenador;
		final double DEPRECIACION = 0.4, RESULTADO_DEPRECIACION = 0.6;

		System.out.println("Introduzca el precio del ordenador");
		precioOrdenador = sc.nextDouble();
		System.out.println(" ");
		System.out.println("Si suponemos una depreciaci�n del 40%");
		System.out.println("El valor del ordenador quedar� tal que as�: ");
		System.out.println("Hay que recordar que el precio del equipo nunca bajar� de 300 euros");
		for (int i = 1; i <= 4; i++) {

			if (precioOrdenador * RESULTADO_DEPRECIACION > 300) {
				precioOrdenador *= RESULTADO_DEPRECIACION;
				System.out.println(i + " anio " + "el ordenador valdr� " + precioOrdenador);
			} else {
				System.out.println("Ha alcanzado el limite de su depreciacion");
				break; // Con esto salimos del bucle de manera forzada
			}

			

		}
correcionJorge();
	}

	private static void correcionJorge() {

		double valorOrdenador = 0, DEPRECIACION = 0.40;

		int anio = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor del ordenador");

		valorOrdenador = sc.nextDouble();

		System.out.println("PRECIO DE ADQUISICION " + valorOrdenador);

		System.out.println("ANIO\t\tVALOR_ORDENADOR");

		while (valorOrdenador >= 300) {

			valorOrdenador -= (valorOrdenador * DEPRECIACION);

			anio++;

			System.out.println(anio + "\t\t" + valorOrdenador);

		}

		System.out.println("El ordenador se deprecio en " + anio + " anios");

	}

}
