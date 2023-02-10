package boletin3;

import java.util.Scanner;

public class Ejercicio3_hospital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ginecologia = 40 / Traumatologia = 30/ Pediatria =30/

		/*
		 * Obtener la cantidad de dinero que recibir� cada �rea, teniendo en cuenta que
		 * su presupuesto es de 120000 euros.
		 */

		// Existen dos maneras de tratar el siguiente problema:
		// asumimos que la asignacion presupuestaria no varia en los a�os
		// Creamos el programa para que esta s� varie
		// Declaramos una variable para el presupuesto y los porcentajes de cada
		// departamento
		double presupuesto, ginecologiaPor, traumatologiaPor, pediatriaPor;

		System.out.println("�Cual es la asignaci�n presupuestaria?");
		presupuesto = sc.nextDouble();

		System.out.println("A continuaci�n indique los porcentajes de cada departamento");

		System.out.println("Ginecologia: ");
		ginecologiaPor = sc.nextDouble();
		ginecologiaPor /= 100;

		System.out.println("Traumatologia: ");
		traumatologiaPor = sc.nextDouble();
		traumatologiaPor /= 100;

		System.out.println("Pediatria: ");
		pediatriaPor = sc.nextDouble();
		pediatriaPor /= 100;

		System.out.println("La asignaci�n seg�n los datos indicados quedar�a de la siguiente manera; ");

		System.out.println("Ginecologia: " + (presupuesto * ginecologiaPor));
		System.out.println("Traumatologia : " + (presupuesto * traumatologiaPor));
		System.out.println("Pediatria: " + (presupuesto * pediatriaPor));

	}
}