package boletin2;

import java.util.Scanner;

public class ejercicio2_media3relaes {

	public static void main(String[] args) {
		// Crearemos un programa que calcule la media de 3 números enteros

		// El primer paso sería crear un Scanner que recoja los números
		Scanner scannernum = new Scanner(System.in);
		
		// Indicamos las instrucciones al usuario
		System.out.println("Introduzca 3 números");
		// creamos las variables relacionadas con el scanner
		
		double numeroReal1 = scannernum.nextDouble();
		double numeroReal2 = scannernum.nextDouble();
		double numeroReal3 = scannernum.nextDouble();
		// Ahora operaremos con ellos
		
		double media = (numeroReal1 + numeroReal2 + numeroReal3) / 3;
		// Ahora volvemos a sacar el número por pantalla
		System.out.println(media);
	}
}
