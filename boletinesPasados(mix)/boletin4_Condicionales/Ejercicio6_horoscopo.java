package boletin4_Condicionales;

import java.util.Scanner;

public class Ejercicio6_horoscopo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Escribe un programa que nos diga el horóscopo a partir del día (número) y el
		 * mes de nacimiento (String). Por ejemplo: Dime tu mes de nacimiento: enero hay
		 * que trabajar en el programa con la cadena “enero”.
		 */

		int dia;
		String mes;

		System.out.println("Introduce tu mes de nacimiento");
		mes = sc.nextLine();
		System.out.println("Introduce tu dia de nacimiento");
		dia = sc.nextInt();

		mes = mes.toLowerCase();

		switch (mes) {
		case "enero":
			if (dia >= 20) {
				System.out.println("Acuario");
			} else {
				System.out.println("Capricornio");
			}
			break;

		case "febrero":
			if (dia >= 19) {
				System.out.println("Piscis");
			} else {
				System.out.println("Acuario");
			}
			break;
		case "marzo":
			if (dia <= 20) {
				System.out.println("Piscis");
			} else {
				System.out.println("Aries");
			}
			break;

		case "abril":
			if (dia <= 19) {
				System.out.println("Aries");
			} else {
				System.out.println("Tauro");
			}
			break;
		case "mayo":
			if (dia <= 20) {
				System.out.println("Tauro");
			} else {
				System.out.println("Géminis");
			}
			break;

		case "junio":
			if (dia >= 21) {
				System.out.println("Cancer");
			} else {
				System.out.println("Geminis");
			}
			break;

		case "julio":
			if (dia >= 23) {
				System.out.println("leo");
			} else {
				System.out.println("Cancer");
			}
			break;

		case "agosto":
			if (dia >= 23) {
				System.out.println("Virgo");
			} else {
				System.out.println("Leo");
			}
			break;

		case "septiembre":
			if (dia >= 23) {
				System.out.println("Libra");
			} else {
				System.out.println("Virgo");
			}
			break;
		case "octubre":
			if (dia >= 23) {
				System.out.println("Escorpio");
			} else {
				System.out.println("Libra");
			}
			break;
		case "noviembre":
			if (dia >= 22) {
				System.out.println("Sagitario");
			} else {
				System.out.println("Escorpio");
			}
			break;
		case "diciembre":
			if (dia >= 22) {
				System.out.println("Capricornio");
			} else {
				System.out.println("Sagitario");
			}
			break;

		}
	}
}
