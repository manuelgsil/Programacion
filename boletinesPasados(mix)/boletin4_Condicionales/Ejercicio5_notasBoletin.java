package boletin4_Condicionales;

import java.util.Scanner;

public class Ejercicio5_notasBoletin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * Realiza un programa que pida 3 notas y calcule su media. El programa ha de
		 * indicar la nota en formato boletín (insuficiente, suficiente, bien, notable o
		 * sobresaliente).
		 */

		double nota1, nota2, nota3, media;

		System.out.println("Introduzca las calificaciones");

		nota1 = sc.nextDouble();
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("Revise la calificacion");
		}
		nota2 = sc.nextDouble();
		if (nota2 < 0 || nota2 > 10) {
			System.out.println("Revise la calificacion");
		}
		nota3 = sc.nextDouble();
		if (nota3 < 0 || nota3 > 10) {
			System.out.println("Revise la calificacion");
		}
		media = (nota1 + nota2 + nota3) / 3;

		System.out.println("Su media ha sido de: " + media);

		if (media >= 0 && media < 5) {
			System.out.println("Insuficiente");
		} else if (media >= 5 && media < 6) {
			System.out.println("aprobado");
		} else if (media >= 6 && media < 7) {
			System.out.println("Bien");
		} else if (media >= 7 && media <= 8) {
			System.out.println("Notable");
		} else if (media > 8 && media <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Revise las calificaciones introducidas");

		}
	}

}
