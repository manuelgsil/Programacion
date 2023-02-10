package boletin3;

import java.util.Scanner;

public class Ejercicio3_hospital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ginecologia = 40 / Traumatologia = 30/ Pediatria =30/

		/*
		 * Obtener la cantidad de dinero que recibirá cada área, teniendo en cuenta que
		 * su presupuesto es de 120000 euros.
		 */

		// Existen dos maneras de tratar el siguiente problema:
		// asumimos que la asignacion presupuestaria no varia en los años
		// Creamos el programa para que esta sí varie
		// Declaramos una variable para el presupuesto y los porcentajes de cada
		// departamento
		double presupuesto, ginecologiaPor, traumatologiaPor, pediatriaPor;

		System.out.println("¿Cual es la asignación presupuestaria?");
		presupuesto = sc.nextDouble();

		System.out.println("A continuación indique los porcentajes de cada departamento");

		System.out.println("Ginecologia: ");
		ginecologiaPor = sc.nextDouble();
		ginecologiaPor /= 100;

		System.out.println("Traumatologia: ");
		traumatologiaPor = sc.nextDouble();
		traumatologiaPor /= 100;

		System.out.println("Pediatria: ");
		pediatriaPor = sc.nextDouble();
		pediatriaPor /= 100;

		System.out.println("La asignación según los datos indicados quedaría de la siguiente manera; ");

		System.out.println("Ginecologia: " + (presupuesto * ginecologiaPor));
		System.out.println("Traumatologia : " + (presupuesto * traumatologiaPor));
		System.out.println("Pediatria: " + (presupuesto * pediatriaPor));

	}
}