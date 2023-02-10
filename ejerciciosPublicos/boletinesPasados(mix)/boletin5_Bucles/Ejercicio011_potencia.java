package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio011_potencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
		 * los 5 siguientes números enteros a partir de uno que se introduce por
		 * teclado. Ejemplo: numero 13 Numero Cuadrado Cubo 13 26 39 14 28 42
		 */
		int numeroIntroducido,  cuadrado,cubo;
		System.out.println("Introduce numero");
		numeroIntroducido=sc.nextInt();
		for(int contador=1;contador<=5;contador++){
	
			cuadrado= numeroIntroducido*numeroIntroducido;
			cubo=numeroIntroducido*numeroIntroducido*numeroIntroducido;
			
		System.out.println(" numero: "+numeroIntroducido+" "+" cuadrado: "+cuadrado+" cubo: "+cubo);
		numeroIntroducido++;
		
		}

	}

}
