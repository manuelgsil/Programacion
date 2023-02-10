package boletin5_Bucles;

import java.util.Scanner;

public class Ejercicio013_ContadorNegativoPositivo {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea una lista de diez números y determine cuántos son
		 * positivos, y cuántos son negativos.
		 */
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido;

		System.out.println("Introduzca un numero");
		numeroIntroducido = sc.nextInt();
		for (int contador = 1; contador < 10; contador++) {
			if (numeroIntroducido > 0) {
				System.out.println("Positivo");
				System.out.println("Introduzca otro numero");
				numeroIntroducido = sc.nextInt();
			} else {
				System.out.println("Negativo");
				System.out.println("Introduzca otro numero: ");
				numeroIntroducido = sc.nextInt();
			}

			correcionJesus();

		}

	}

	private static void correcionJesus() {
		

			Scanner sc=new Scanner(System.in);

			int positivos=0;

			int negativos=0;

			System.out.println("Introduce tu numero");

			

			for(int numero=0;numero<=10;numero++) {

				int introduceNumero=sc.nextInt();

				if (introduceNumero>=0){

					positivos++;

				}

				else{

					negativos++;

				}

			

				}

			System.out.println("Los numeros positivos han sido= "+positivos);

			System.out.println("Los numeros negativos han sido= "+negativos);

		
		
	}
}
