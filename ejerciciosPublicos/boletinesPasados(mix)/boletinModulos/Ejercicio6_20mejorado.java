package boletinModulos;

import java.util.Scanner;

public class Ejercicio6_20mejorado {

	public static void main(String[] args) {

		/*
		 * Modifica el ejercicio 20 del tema 3, boletín 5, utilizando el método
		 * desarrollado en el ejercicio 5, para que en lugar de introducir el número el
		 * primer jugador al inicio, el número entre 1 y 50 se generé automáticamente.
		 */

		menu();
	}

	/**
	 * Menu que nos muestra las opciones de juego
	 */
	static void menu() {

		Scanner sc = new Scanner(System.in); // Creamos 2 SC por el tema de bugearse
		Scanner scN = new Scanner(System.in); // al recoger datos numericos y Strings
		int opcion;
		String nombre_jugador1, nombre_jugador2; // Creamos los Strings de los nombres

		System.out.println("1. Un jugador"); // Indicamos las opciones del menu
		System.out.println("2. Jugador cooperativo");
		System.out.print("Introduzca una opcion:");

		opcion = comprobadorOpciones(sc.nextInt()); // Usamos nuestro comprobador de opciones
													// para que escoja entre 1 y 2

		switch (opcion) {
		case 1:
			System.out.println("Introduzca el nombre del jugador");
			System.out.println("Nombre jugador 1: ");
			nombre_jugador1 = scN.nextLine();

			unicoJugador(nombre_jugador1);
			break;
		case 2: // SEGUN sea la modalidad esocgida se le pedirá un nombre o dos.
			System.out.println("Introduzca el nombre de los jugadores");
			System.out.println("Nombre jugador 1: ");
			nombre_jugador1 = scN.nextLine();

			System.out.println("Nombre jugador 2: ");
			nombre_jugador2 = scN.nextLine();

			jugadorCoop(nombre_jugador1, nombre_jugador2);
			break;

		}
	}

	/**
	 * Modalidad de un solo jugador en la que tiene que adivinar el numero generado
	 * aleatoriamente entre 1 y 50
	 * 
	 * @param nombre recibe el nombre del jugador como parametro
	 */
	public static void unicoJugador(String nombre) {

		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = 0, numeroBuscador, intento = 1, opcion; // Creamos las variables necesarias

		boolean bandera = false; // Bandera para el bucle que usaremos para obtener el numAleatorio

		System.out.println("Se genera un numero aleatorio entre 1 y 50. Tiene 5 intentos para averiguar cual es");
		separador(2); // Le indicamos al jugador como va la vaina

		// Generamos el numero aleatorio mediante invocacion
		while (bandera == false) { // Aqui usamos un bucle para obtener el numero pinzado
			if (numeroAleatorio <= 50 && numeroAleatorio > 0)
				bandera = true;
			else
				generadorAleatorio(); // O me das el numero o sigues llamando
		}
		System.out.println(numeroAleatorio);

		System.out.println(nombre + " Trate de averiguar el numero");
		numeroBuscador = comprobadorNegativos(sc.nextInt()); // Cuidamos que no introduzca numNegativos

		while (intento != 5) { // Con esta condicion indicamos que se repetirá hasta el intento 5
			if (numeroBuscador > numeroAleatorio) {
				System.out.println("Buscas un numero mas pequeño");
				numeroBuscador = comprobadorNegativos(sc.nextInt()); // + comprobaciones
				intento++;
			} else if (numeroBuscador < numeroAleatorio) {
				System.out.println("Buscas un numero mas grande");
				numeroBuscador = comprobadorNegativos(sc.nextInt());
				intento++;
			} else {
				System.out.println("¡Enhorabuena " + nombre + " Acertaste!");
				System.out.println("Lo conseguiste en al " + intento + " intento");
				intento = 5; // Igualamos el num de intentos a 5 para salir del bucle en caso de que
								// acierte
			}
		}

		System.out.println("No lo conseguiste esta vez!");
		System.out.println("El numero era: " + numeroAleatorio);// Mensajito
		separador(3);
		System.out.println("1.Volver a jugar\2.Salir"); // Puede salir o volver a jugar
		opcion = comprobadorOpciones(sc.nextInt());
		switch (opcion) {
		case 1:
			unicoJugador(nombre);
			break;
		case 2:
			break;
		}

	}

	/**
	 * Modalidad cooperativa donde los jugadores delimitaran su propio arco de
	 * numeros. Tienen 6 intentos a compartir para adivinar el nuermo aleatorio
	 * 
	 * @param nombre1 Nombre del jugador uno
	 * @param nombre2 Nombre del jugador dos
	 */
	static void jugadorCoop(String nombre1, String nombre2) {
		Scanner sc = new Scanner(System.in);
		int numeroj1, numeroj2, numeroAleatorio, numeroBuscador, intento = 1, opcion;
		boolean bandera = false; // = planteamiento que en el anterior metodo. Ligeras diferencias

		System.out.println("Ambos jugadores trataran de averiguar el numero generado aleatoriamente.");
		System.out.println("El numero aleatorio estará pinzado entre los números que delimiten los jugadores");
		// Los jugadores establecen su propio limite

		System.out.println(nombre1 + " Introduzca un numero");
		numeroj1 = comprobadorNegativos(sc.nextInt());
		System.out.println(nombre2 + " introduzca un numero");
		numeroj2 = comprobadorNegativos(sc.nextInt());

		numeroAleatorio = numeroPinzado(numeroj1, numeroj2); // Con esta variable señalando al metodo
		// obtenemos el numeroAleatorio comprendido entre esos valores

		System.out.println("Comienza " + nombre1);

		numeroBuscador = comprobadorNegativos(sc.nextInt());
		// TODO seria mejorable condicionar la entrada de datos a los pinzados por ellos
		// mismos

		while (intento != 6) {
			if (numeroBuscador > numeroAleatorio) {
				System.out.println("Buscas un numero mas pequeño");
				numeroBuscador = comprobadorNegativos(sc.nextInt()); // Mismo planteamiento que
				// en el bucle del anterior metodo solo que hemos aumentado los intentos a 6
				intento++;
			} else if (numeroBuscador < numeroAleatorio) {
				System.out.println("Buscas un numero mas grande");
				numeroBuscador = comprobadorNegativos(sc.nextInt());
				intento++;
			} else {
				System.out.println("Enhorabuena " + nombre1 + " y " + nombre2 + " Acertasteis!");
				System.out.println("Lo conseguiste en al " + intento + " intento");
				intento = 6;
			}
		}
		System.out.println("No lo conseguisteis esta vez!");
		System.out.println("El numero era: " + numeroAleatorio);
		System.out.println("1.Volver a jugar\2.Salir");

		opcion = comprobadorOpciones(sc.nextInt());
		if (opcion == 1)
			jugadorCoop(nombre1, nombre2);
		else {
			System.out.println("Adios");
		}

	}

	/**
	 * Con este metodo generamos un numero aleatorio entre los valores indicados por
	 * el usuario
	 * 
	 * @param numero1
	 * @param numero2
	 * @return numero aleatorio comprendido entre ambos numeros
	 */
	static int numeroPinzado(int numero1, int numero2) {
		int aleatorio, mayor, menor;
		boolean bandera = false;
		aleatorio = generadorAleatorio();

		if (numero1 > numero2) { // Con este condicional averiguamos cual es el mayor o el menor de los numeros
			mayor = numero1;
			menor = numero2;
		} else {
			menor = numero1;
			mayor = numero2; // informacion que usaremos para delimitar el bucle
		}

		while (bandera == false) {
			if (aleatorio < mayor && aleatorio > menor)
				bandera = true;
			else
				aleatorio = generadorAleatorio();
		}

		return aleatorio;
	}

	/**
	 * Genera un numero aleatorio
	 * 
	 * @return
	 */
	static int generadorAleatorio() {

		int aleatorio = (int) (Math.random() * 100);

		return aleatorio;
	}

	static void separador(int espacios) {
		for (int i = 0; i <= espacios; i++) {
			System.out.println();
			;
		}

	}

	/**
	 * @author: Manuel
	 * @param num es el dato introducido por el usuario que será comprobado
	 * @return devuelve el numero admitido, en este caso cualquier positivo
	 */
	static int comprobadorOpciones(int num) {
		Scanner sc = new Scanner(System.in);
		while (num < 1 || num > 2) { // Hemos limitado el numero de opciones a 2 que son las que hay en el menu

			System.out.println("Introduzca una opcion valida:");
			num = sc.nextInt();
		}

		return num;
	}

	/**
	 * Para controlar la introduccion de numeros negativos sin tener que repetir
	 * codigo
	 * 
	 * @param num
	 * @return
	 */
	static int comprobadorNegativos(int num) {
		Scanner sc = new Scanner(System.in);
		while (num < 0) {
			System.out.println("introduzca un numero positivo");
			num = sc.nextInt();
		}
		return num;
	}

}
