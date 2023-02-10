package boletinModulos;

import java.util.Scanner;

public class Fecha_mejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int anio, mes, dia;

		System.out.println("Introduzca anio");
		anio = comprobadorValores(sc.nextInt());
		System.out.println("Introduzca mes");
		mes = comprobadorValores(sc.nextInt());
		System.out.println("introduzca dia");
		dia = comprobadorValores(sc.nextInt());

		comprobadorFecha(anio, mes, dia);

	}

	private static void comprobadorFecha(int anio, int mes, int dia) {
		String resultado = "";
		boolean bisiesto = false; // Creamos un booleano para señalar si el año es bisiesto o no
		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) // formula que nos permite averigurar dicha informacion
			bisiesto = true;

		switch (mes) { // Creamos un switch donde su clave valor seran los meses
		case 1, 3, 5, 7, 8, 10, 12: // Cada numero corresponde con un mes 1=enero, 3=marzo, etc.
			if (dia <= 31 && dia > 0) // Un condicional que delimite los dias validos de sus respectivos meses
				resultado = "Es una fecha valida";
			else
				resultado = "No es una fecha valida";
			break;
		case 4, 6, 9, 11:
			if (dia <= 30 && dia > 0)
				resultado = "Es una fecha valida";
			else
				resultado = "No es una fecha valida";
			break;
		case 2: // En el case 2, aquel al que corresponde al mes de febrero
			if (dia <= 28 && dia > 0 && bisiesto == false) { // es donde tenemos que agregar un ELSE IF para señalar
				resultado = "Es una fecha valida"; // la diferencia entre un bisiesto y un no bisiesto.
			} else if (dia <= 29 && dia > 0 && bisiesto == true) { // Febrero bi tiene un dia mas (29) por lo que si
																	// nuestro booleano
				resultado = "Es una fecha valida"; // ha dado TRUE se activará la segunda condición y nos lo dará
			} else // por valido.
				resultado = "No es una fecha valida";
			break;
		}
		System.out.println(resultado);
	}

	private static int comprobadorValores(int valor) {
		Scanner sc = new Scanner(System.in);
		boolean error = true;
		
		
		while (error == true) {

			if (valor <= 0) {
				System.out.println("Introduzca un valor positivo");
				valor = sc.nextInt();
			} else {
				error = false;
			}

		}
		return valor;

	}
}