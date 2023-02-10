package boletin2;

public class Ejercicio7_Elcapitalquepierde_esperanza {
	
	public static void main(String[] args) {

		double capital, interesAnio1, interesAnio2, interesAnio3;

		capital = 10000;

		interesAnio2 = -500;

		interesAnio1 = 0.10 * capital;

		capital += interesAnio1;

		System.out.println("El capital tras el primer anio es " + capital);

		capital += interesAnio2;

		System.out.println("El capital tras el segundo anio es " + capital);

		interesAnio3 = 0.12 * capital;

		capital += interesAnio3;

		System.out.println("El capital tras el tercer anio es " + capital);

	}
}
