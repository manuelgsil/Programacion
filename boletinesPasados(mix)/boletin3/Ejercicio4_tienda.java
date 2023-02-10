package boletin3;

import java.util.Scanner;

public class Ejercicio4_tienda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * El dueño de una tienda compra un artículo a un precio determinado. Obtener el
		 * precio a que lo debe vender para obtener una ganancia del 30%. Asigna el
		 * precio que creas conveniente, e intenta realizarlo utilizando operadores con
		 * asignación (*=, +=, -=...)
		 */

		double precioArticulo, porcentaje, beneficio;

		System.out.println("Indique el precio del articulo a vender");
		precioArticulo = sc.nextDouble();

		System.out.println("Ahora indique el beneficio que quiere obtener");
		porcentaje = sc.nextDouble(); // Hasta aquí la recogida de información

		porcentaje /= 100; // Operador de asignacion para que divida entre 100 y tener directamente el %
		beneficio = precioArticulo * porcentaje; // realizamos la operacion

		// aqui indicamos el beneficio neto y luego la suma al precio de articulo
		System.out.println("el beneficio que busca se traduciría en; " + beneficio + "€");
		precioArticulo += beneficio;
		System.out.println("Por lo que debería vender a: " + precioArticulo + "€");

	}

}
