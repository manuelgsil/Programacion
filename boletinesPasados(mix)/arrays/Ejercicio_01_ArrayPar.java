package arrays;

import java.util.Scanner;

public class Ejercicio_01_ArrayPar {

	public static void main(String[] args) {

		/*
		 * Implementa un metodo que dado un array cargado aleatoriamente, genere de �l
		 * otro array que contenga los elementos pares que se encuentran en el
		 */

		int[] arrayPar;

		// 1. debemos pedirle al usuario de que tama�o quiere el array
		// para ello, anteriormente debemos haber cargado la referencia
		// Y posteriormente, le indicamos a la memoria cuanto espacio
		// debe reservar.

		// 2. Tras esto, debemos cargar esta array con numeros aleatorios.
		// Para ello usaremos Math.random.

		// ESTE PROCESO SE HAR� MEDIANTE LA LLAMADA A DOS METODOS. Uno de ellos anidado.

		int[] array_aleatorio = arrayAleatorio(); // 1 metodo que nos genera el array aleatorio. Hay otra llamada en su
													// interior

		// 3. Una vez cargado, debemos escribir un nuevo metodo
		// que nos permita identificar la CANTIDAD de numeros pares
		// y CUALES son.

		// Antes de ello haremos una impresion por pantalla de nuestro Array hasta ahora

		System.out.println("ARRAY ALEATORIO");
		System.out.println("--------------");
		for (int i : array_aleatorio) {
			System.out.println(i);
		}

		arrayPar = arrayPar(array_aleatorio); // Ahora usamos el array referenciado anterior para cargarlo con la
												// llamada al metodo

		/*
		 * Dentro de este metodo tambien hay otro anidado. Concretamente el que nos da
		 * la cantidad de numeros pares en el array aleatorio
		 */

		System.out.println("------------");
		System.out.println("Array PAR");
		System.out.println("-----------");
		for (int i : arrayPar) {
			System.out.println(i);
		}
		System.out.println("-----------");

		
	}

	private static boolean comprobadorBooleano(int condicion) {
		boolean resultado = false;
		if (condicion  % 2 == 0) 
				resultado=true;
		return resultado;

	}

	/**
	 * Funcion que nos permite generar un array con el tama�o que precisemos. Los
	 * numeros se generaran aleatoriamente y su rango es del 1 al 99.
	 * 
	 * @see {@link #numeroAleatorio}.
	 * 
	 * 
	 * @return devuelve el array que le hayamos especificado
	 */
	private static int[] arrayAleatorio() {
		Scanner sc = new Scanner(System.in);

		int[] arrayUsuario; // La primera array que definir� el usuario
		int tamanio; // El tama�o definido por el usuario

		System.out.println("Cuantos datos se introduciran en el array?");
		tamanio = sc.nextInt();

		arrayUsuario = new int[tamanio];

		for (int i = 0; i < tamanio; i++) { // Mediante un bucle for normal
											// recorreremos los espacios de la array y
											// estableceemos
											// los valores aleatorios en cada hueco.
			arrayUsuario[i] = numeroAleatorio();
		}

		return arrayUsuario; // devolvemos el array al main

	}

	private static int[] arrayPar(int[] array_para_comprobar) {
		int[] arrayPares; // Referenciamos la nueva Array
		int tamanio_nueva_array; // Creamos una variable para almacenar el tama�o de la array ref
		int posicion = 0; // Una variable para ir cambiando la posicion
		boolean siPar=false;

		// Usamos nuestra variable para almacenar el
		// tama�o de la nueva array
		tamanio_nueva_array = cantidadPares(array_para_comprobar); // Llamamos al metodo que comprueba
																	// la cantidad de pares que tiene

		arrayPares = new int[tamanio_nueva_array]; // Creamos la array con el tama�o justo

		for (int i = 0; i < array_para_comprobar.length; i++) { // bucle FOR con el que nos movemos en el arrayALEATORIO
			siPar=comprobadorBooleano(array_para_comprobar[i]); // con este booleano aveiguamos si es divisible entre dos
			if(siPar==true) {
				arrayPares[posicion] = array_para_comprobar[i]; // Si fuera as�, copiamos el par a su posicion
				posicion++; // Nos movemos una posici�n en nuestra ARRAY PAR
			}

		}
		return arrayPares; // la devolusi�
	}

	/**
	 * Este metodo genera un numero aleatorio a traves de Math.random. Casteamos el
	 * dato a int en la misma funcion.
	 * 
	 * @return devuelve un numero comprendido entre el 1 y el 99
	 */
	private static int numeroAleatorio() {

		int numeroAleatorio = (int) (Math.random() * 100);

		return numeroAleatorio;
	}

	/**
	 * Mediante esta funcion podemos almacenar la cantidad de numeros pares que
	 * exista en el array
	 * 
	 * @param array_para_comprobar (El array que queramos introducir)
	 * @return devuelve la cantidad de numeros pares que tiene dicho array
	 */
	private static int cantidadPares(int[] array_para_comprobar) {
		int cantidadPares = 0;

		for (int i = 0; i < array_para_comprobar.length; i++) { // bucle for que continua hasta el tama�o de la array
			if (array_para_comprobar[i] % 2 == 0)
				cantidadPares++;

		}
		return cantidadPares;
	}

}
