package boletin2;

import java.util.Scanner;

public class Ejercicio5_formulaFC {

	public static void main(String[] args) {

		/*
		 * Desarrolla un programa que transforme 86 grados Fahrenheit a Celsius y 33
		 * grados Celsius a Fahrenheit. Imprima el resultado por pantalla.
		 */

		// Declaramos el esc�ner

		Scanner valoresGrados = new Scanner(System.in);

		//

		double gradosCelsius;

		double gradosFahrenheit, formulaFahrenheit, formulaCelsius;

		System.out.println("Indica los grados celsius para hacer la conversi�n");

		gradosCelsius = valoresGrados.nextDouble();

		formulaFahrenheit = ((gradosCelsius * 9) / 5) + 32;

		System.out.println("La conversi�n ser�an " + formulaFahrenheit + " grados fahrenheit");

		System.out.println("Indica los grados Fahrenheit para hacer la conversi�n");

		gradosFahrenheit = valoresGrados.nextDouble();

		formulaCelsius = ((gradosFahrenheit - 32) / 9) * 5;

		System.out.println("La conversi�n ser�an " + formulaCelsius + " grados Celsius");

	}

}
