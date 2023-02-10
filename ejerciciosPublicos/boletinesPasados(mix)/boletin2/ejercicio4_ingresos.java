package boletin2;

import java.util.Scanner;

public class ejercicio4_ingresos {
	
/*
		 * Suponiendo que ingresamos 5000 euros en un banco que nos paga el 6% de
		 * intereses, calcula el dinero que tendremos después de un año. Imprima el
		 * resultado por pantalla.
		 */
	
	public static void main(String[] args) {
	
		System.out.println(calculadoraInteres(100,0.06)); // Esto si lo le pido al usuario que me de un 0,06 exacto
		System.out.println(calculadoraInteres2(100,6));		// vamos a probar tambien con INT
	}

private static double calculadoraInteres2(double cantidad, int interes) {
	double interesFuncional;
	interesFuncional = (double)interes/100; // lo hago asi para que el usuario tenga que introducir un entero simplemente
	
	interesFuncional*=cantidad;
	System.out.println("De su cantidad inicial de: "+ cantidad);
	cantidad+=interesFuncional;
	System.out.println("ahora tiene un total de: "+cantidad);
	
	
	return cantidad;
	
	
}

private static double calculadoraInteres(double cantidad, double interes) {
	Scanner sc = new Scanner(System.in);
	
	interes=cantidad*interes;
	System.out.println("De su cantidad inicial de: "+ cantidad);
	cantidad+=interes;
	System.out.println("ahora tiene un total de: "+cantidad);
	
	
	return cantidad;
	
}

}
