package boletin4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_salarioTrabajdor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Escribe un programa que calcule el salario semanal de un trabajador teniendo
		 * en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a
		 * 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
		 */

		// DECLARAMOS LAS VARIABLES

		double sueldo = 0, horas, horasExtra;

		final double PAGO_ORDINARIA = 12, PAGO_EXTRAORDINARIA = 16;

		System.out.println("Introduzca las horas en jornada ordinaria");

		horas = sc.nextDouble();

		if (horas > 0 && horas <= 40) {

			sueldo = horas * PAGO_ORDINARIA;

		} else if (horas > 40) {

			// Primero averiguamos el número de horas extras

			horasExtra = horas - 40;

			// A raiz de esto podemos calcular el sueldo con unas operaciones aritmeticas

			sueldo = (horasExtra * PAGO_EXTRAORDINARIA) + (horas - horasExtra) * PAGO_ORDINARIA;
		}

		System.out.println("Su salario es: " + sueldo + " euros");

	}

}
