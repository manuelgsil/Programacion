package boletin4_Condicionales;

import java.util.Scanner;

public class Ejercicio1_DiaSemana {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida por teclado un d�a de la semana y que imprima
		 * por pantalla qu� asignatura toca a primera hora ese d�a.
		 */

		Scanner sc = new Scanner(System.in);
		String dia;

		System.out.println("Introduzca un dia lectivo de la semana ");
		dia = sc.nextLine();

		if (dia.equalsIgnoreCase("Lunes")) {
			System.out.println("A primera hora hay base de datos");
		} else if (dia.equalsIgnoreCase("martes")) {
			System.out.println("A primera hora hay Entornos");
		}

		else if (dia.equalsIgnoreCase("miercoles")) {
			System.out.println("A primera hora hay Lenguajes de marca");
		}

		else if (dia.equalsIgnoreCase("Jueves")) {
			System.out.println("A primera hora hay Programacion");
		}

		else if (dia.equalsIgnoreCase("Viernes")) {

			System.out.println("A primera hora hay Sistemas");

		} else {
			System.out.println("Introduzca un dia valido");
		}
		;

	}

}
