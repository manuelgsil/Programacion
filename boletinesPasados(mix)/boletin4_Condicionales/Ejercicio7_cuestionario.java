package boletin4_Condicionales;

import java.util.Scanner;

public class Ejercicio7_cuestionario {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		int respuesta, puntuacion = 0;

		/*
		 * Realiza un minicuestionario con 3 preguntas tipo test sobre la asignatura de
		 * programaci�n. Cada pregunta tiene 3 respuestas, pero solo una v�lida. Cada
		 * pregunta acertada sumar� un punto. El programa mostrar� al final la
		 * calificaci�n obtenida. Ejemplo de pregunta tipo test. C�al de estas
		 * sentencias genera un error: 1 � int i = �1�; 2 � int i = -1; 3 � int i =
		 * (int)2.2; Respuesta: (el usuario tendr�a que responder aqu�)
		 */

		System.out.println("A continuaci�n te voy a hacer unas preguntitas maquinoide");

		System.out.println("Vamos a ver c�mo andamos de programaci�n");

		System.out.println("Seleccione la respuesta correcta\n" + "1 � int i = �1�;\n" + "2 � int i = -1;\n"
				+ "3 � int i = (int)2.2;");

		System.out.println("Respuesta: " + (respuesta = sc.nextInt()));

		switch (respuesta) {
		case 1:
			puntuacion++;
			break;

		default:
			puntuacion = 0;
			break;
		}
		System.out.println("Seleccione la respuesta correcta\n" + "1 � Java es un lenguaje de tipado debil\n"
				+ "2 � Java es la primera version de Javascript\n" + "3 � Java pertenece a Oracle\n");

		System.out.println("Respuesta: " + (respuesta = sc.nextInt()));
		switch (respuesta) {
		case 3:
			puntuacion++;
			break;

		default:
			break;
		}

		System.out.println("");
		System.out.println("Dado el siguiente enunciado �Qu� se mostrar�?\n" + "\n" + "int x = 5;\n" + "int y = 5;\n"
				+ "y *= x++;\n" + "System.out.println(x);\n" + "\n" + "1 �  25\n" + "2 � 6\n" + "3 �  30 ");

		System.out.println("Respuesta: " + (respuesta = sc.nextInt()));
		System.out.println("");
		switch (respuesta) {
		case 2:
			puntuacion++;
			break;

		default:
			break;
		}

		System.out.println("Su puntuacion ha sido: " + puntuacion);

	}

}
