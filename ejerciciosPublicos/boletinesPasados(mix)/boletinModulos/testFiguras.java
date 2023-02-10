package boletinModulos;

import java.util.Scanner;

public class testFiguras {

	public static void main(String[] args) {

		menuFiguras();
	}

	/*
	 * Ejercicio 3: Diseñar un programa que nos permita calcular áreas y volúmenes
	 * de distintas figuras geométricas, como conos, pirámides y cilindros, según
	 * elija el usuario.
	 */
	/**
	 * Author: Manuel
	 * 
	 * 
	 * Menu que nos permite acceder a los distintos metodos almacenados
	 */
	static void menuFiguras() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		System.out.println("Escoja la figura deseada: \n1.Cubo \n2.Cono \n3.Esfera");
		opcion = comprobadorOpciones(sc.nextInt());
		switch (opcion) {
		case 1:
			CalculosCubo();
			break;
		case 2:
			CalculosCono();

			break;
		case 3:
			calculosEsfera();
			break;

		}
	}

	/**
	 * Author: Manuel
	 * 
	 * 
	 * Menu que nos permite acceder a las formulas del Cubo Tiene dos metodos
	 * insertados que nos permiten validar los datos introducidos por el usuario
	 * 
	 * @see {@link #comprobadorDatos(double) @link #comprobadorOpciones(int)}
	 * 
	 */
	static void CalculosCubo() {
		int opcion;
		double diagonal, area, volumen, resul = 0, lado;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el lado");
		lado = comprobadorDatos(sc.nextDouble());

		System.out.println("Escoja la opción deseada: \n1.Diagonal \n2.Area\n3.volumen");

		opcion = comprobadorOpciones(sc.nextInt());

		switch (opcion) {
		case 1:
			diagonal = Math.sqrt(3) * lado;
			resul = diagonal;
			break;
		case 2:
			area = 6 * Math.pow(lado, 2);
			resul = area;
			break;

		case 3:
			volumen = Math.pow(lado, 3);
			resul = volumen;
			break;

		}
		System.out.println(resul);
	}

	/**
	 * Author: Manuel
	 * 
	 * 
	 * Menu que nos permite acceder a las formulas del Cono Tiene dos metodos
	 * insertados que nos permiten validar los datos introducidos por el usuario
	 * 
	 * @see {@link #comprobadorDatos(double) @link #comprobadorOpciones(int)}
	 * 
	 */
	static void CalculosCono() {

		Scanner sc = new Scanner(System.in);
		int opcion;
		double altura, areaBase, volumen, alturaLateral, resul = 0, radio;

		System.out.println("Introduzca el radio");
		radio = comprobadorDatos(sc.nextDouble());

		System.out.println("Escoja la opción deseada: \n1.areaBase \n2.Volumen \n3.AlturaLateral");

		opcion = comprobadorOpciones(sc.nextInt());

		areaBase = Math.PI * Math.pow(radio, 2); // Coloco esta formula aqui porque es necesaria para algunas opciones

		switch (opcion) {
		case 1:
			resul = areaBase;
			break;
		case 2:
			System.out.print("Introduzca la altura del cono: ");
			altura = comprobadorDatos(sc.nextDouble());
			volumen = Math.round((Math.PI * (radio * radio) * altura) / 3); // VOLUMEN SE ME FIJA A 0
			resul = volumen;
			break;

		case 3:
			System.out.print("Introduzca la altura del cono: ");
			altura = comprobadorDatos(sc.nextDouble());
			alturaLateral = Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2));
			resul = alturaLateral;
			break;

		}
		System.out.println(resul);

	}

	/**
	 * Author: Manuel
	 * 
	 * 
	 * Menu que nos permite acceder a las formulas de la Esfera Tiene dos metodos
	 * insertados que nos permiten validar los datos introducidos por el usuario
	 * 
	 * @see {@link #comprobadorDatos(double) @link #comprobadorOpciones(int)}
	 * 
	 */
	static void calculosEsfera() {
		Scanner sc = new Scanner(System.in);
		int opcion;

		double longitud, area, volumen, resul = 0, radio;

		System.out.println("Introduzca el radio");
		radio = comprobadorDatos(sc.nextDouble());

		System.out.println("Escoja la opción deseada: \n1.Longitud \n2.Area\n3.volumen");
		opcion = comprobadorOpciones(sc.nextInt());

		switch (opcion) {
		case 1:
			longitud = (2 * Math.PI) * radio;
			resul = longitud;
			break;
		case 2:
			area = (4 * Math.PI) * Math.pow(radio, 2);
			resul = area;
			break;

		case 3:
			volumen = ((4 / 3) * Math.PI) * Math.pow(radio, 3);
			resul = volumen;
			break;

		}
		System.out.println(resul);
	}

	/**
	 * @author: Manuel
	 * @param num es el dato introducido por el usuario que será comprobado
	 * @return devuelve el numero admitido, en este caso cualquier positivo
	 */
	static int comprobadorOpciones(int num) {
		Scanner sc = new Scanner(System.in);
		while (num < 1 || num > 3) { // Hemos limitado el numero de opciones a 3 que son las que hay en el menu

			System.out.println("Introduzca una opcion valida:");
			num = sc.nextInt();
		}

		return num;
	}

	static double comprobadorDatos(double info) {
		Scanner sc = new Scanner(System.in);
		while (info < 0) {
			System.out.print("Introduzca un numero positivo: ");
			info = sc.nextDouble();
		}

		return info;
	}

}
