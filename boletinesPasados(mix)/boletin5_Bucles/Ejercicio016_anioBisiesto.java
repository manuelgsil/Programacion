package boletin5_Bucles;

public class Ejercicio016_anioBisiesto {

	public static void main(String[] args) {
		/*
		 * Programa que visualice todos los años bisiestos comprendidos entre 2000 y
		 * 2100, ambos inclusive. Un año es bisiesto si es divisible entre 4 y no es
		 * divisible entre 100 o si es divisible entre 400. Un número es divisible por
		 * otro si el resto de la división es 0
		 */

		int i = 2000;
		while (i <= 2100) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i + " Bisiesto");
			} else {
				System.out.println(i + " No bisiesto");
			}
			i++;
		}
// ES RECOMENDABLE QUE HUBIERA SIDO FOR
		correcionSandra();
	}

	private static void correcionSandra() {
		int anio = 0;

		System.out.println("Los anios bisiestos del 2000 al 2100 son");

		for (anio = 2000; anio <= 2100; anio++) {

			if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)) {

				System.out.println(anio);

			}

		}
	}
}