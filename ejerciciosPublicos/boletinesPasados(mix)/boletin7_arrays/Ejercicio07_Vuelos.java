package boletin7_arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07_Vuelos {
	public static Scanner scInt = new Scanner(System.in);
	public static Scanner scString = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Ejercicio 6: (Sistema de Reserva de Vuelos). Una peque�a compa��a a�rea acaba
		 * de comprar un ordenador para su sistema de reserva de vuelos. Escribir un
		 * programa que asigne asientos para cada vuelo del �nico avi�n de la compa��a
		 * (capacidad: 20 asientos). El programa debe contemplar zona de fumadores y no
		 * fumadores. Los no fumadores ocuparan los asientos 1-15 y los fumadores el
		 * resto. Utiliza un array de una dimensi�n para representar los asientos del
		 * avi�n. Utiliza 0 para indicar asiento vac�o y 1 asiento ocupado. El programa
		 * nunca debe hacer "overbooking", es decir, reasignar un asiento que ya est�
		 * ocupado. Si la secci�n de fumadores se llena, el programa debe preguntar al
		 * pasajero si desea un asiento en la zona de no fumadores, y viceversa. Si
		 * acepta, entonces has de realizar la asignaci�n de asiento correspondiente. Si
		 * no acepta, avise de la salida del pr�ximo vuelo.
		 */

		int[] asientos = new int[20]; // Declaramos un ARRAY con 20 posiciones

		asientos = cargarArray(asientos); // llamamos al metodo que nos carga el array (en este caso podemos modificar
											// el metodo invocado
											// para cargarlo segun nuestras preferencias

		preguntarUsuario(asientos); // Este metodo tiene como funcion preguntar al usuario si desea reserver el
									// billete.
									// tendremos que introducir el array cargado para trabajar con el
									// posteriormente.

	}

	/**
	 * Este metodo nos sirve para cargar de manera automatica el array que simular�
	 * los asientos del avion.
	 * 
	 * @param arrayParaCargar. Introducimos el array que ser� cargado
	 * @return Devuelve el mismo array cargado
	 */
	private static int[] cargarArray(int[] arrayParaCargar) {

		Random aleatorio = new Random();

		for (int i = 0; i < arrayParaCargar.length; i++) {
			arrayParaCargar[i] = aleatorio.nextInt(-1, 1) + 1;
			; // Con esta formula asignamos valores entre 0 y 1

		}
		return arrayParaCargar;
	}

	/**
	 * Este metodo almacena es el men� principal del programa, donde le preguntamos
	 * al usuario si desea reservar un billete. contiene llamadas a distintos
	 * metodos. Como elemento principal nos encontramos un bucle do while que se
	 * ejecuta hasta que el usuario haya terminado de reservar sus billetes.
	 * 
	 * @see #comprobadorEleccion(String, boolean) #comprobarAsientos(int[])
	 * 
	 * 
	 * 
	 * @param asientos Debe introducirse el array que almacena las plazas del avion
	 */
	private static void preguntarUsuario(int[] asientos) {
		String opcion = "";
		boolean eleccion = false;

		System.out.println("Desea reservar un billete? \n-Si.\n-No."); // Le preguntamos al usuario si quiere reservar.
		opcion = scString.nextLine(); // Escaner para la recogida de datos
		eleccion = comprobadorEleccion(opcion, eleccion); // Llamada a m�todo que nos permite reducir la cantidad de
															// codigo en este metodo
		// y por la cual se carga el booleano 'eleccion'.

		do { // Este bucle se ejecutar� hasta que el valor de eleccion sea FALSE.
			if (eleccion) {
				comprobarAsientos(asientos); // Se comprobar� la disponibilidad de los asientos y empieza una llamada
												// anidada
				System.out.println("Quiere reservar otra plaza?"); // Una vez que se termine la anidaci�n se le
																	// preguntar� si quiere otro billete
				opcion = scString.nextLine();
				eleccion = comprobadorEleccion(opcion, eleccion);
			}
		} while (eleccion);
		System.out.println("Adios!");
	}

	/**
	 * Este metodo nos permite validar la opcion del usuario siendo las unicas
	 * opciones posibles 'si'o 'no'.
	 * 
	 * @param opcion   (Ser� introducida por el usuario)
	 * @param eleccion valor booleano que retornaremos y que est� previamente
	 *                 cargado con False.
	 * @return Devuelve el valor booleano resultado del bucle condicional
	 */
	private static boolean comprobadorEleccion(String opcion, boolean eleccion) {

		while (!(opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no"))) { // Con esta condicion solo marcamos
																					// dos opciones posibles
			System.out.println("introduzca una opcion valida"); // le pedimos al usuario que reintroduzca los datos
			opcion = scString.nextLine();
		}

		if (opcion.equalsIgnoreCase("si")) // Si la opcione es 'si' marcamos el booleano como true
			eleccion = true;
		else
			eleccion = false; // En el caso de que sea 'no' se establecer� como falso

		return eleccion;
	}

	/**
	 * Con este metodo comprobaremos la disponibilidad de los asientos en el array.
	 * 
	 * El objetivo principal de esta funci�n es identificar el numero de asientos
	 * libres, lo que nos permitir� crear una nueva array con el tama�o exacto de
	 * asientos disponibles que haya.
	 * 
	 * Para ello usaremos otro metodo:
	 * 
	 * @see {@link #arrayAsientosLibres(int[], int)}
	 * 
	 *      Dicho array ser� lo que mostraremos al usuario a traves de otra llamada
	 *      a otro metodo:
	 * 
	 * @see {@link #mostrarAsientos(int[], int[])}
	 * 
	 * @param asientos (el array que hemos cargado previamente que define la
	 *                 situaci�n de los asientos)
	 */
	private static void comprobarAsientos(int[] asientos) {
		int[] asientosLibres; // creamos un nuevo array para posteriormente mostrarlo por pantalla segun
								// nuestras preferencias
		int zonaNofumadores = 0, // Variable para almacenar los asientos disponibles de la zona de No Fumadores
				zonaFumadores = 0, // Variable para almacenar los asientos disponibles de la zona de Fumadores
				tamanioAsientosLibres; // Con esta �ltima variable crearemos un nuevo array que nos permitir� definir
										// la situaci�n
		for (int i = 0; i < asientos.length; i++) {

			int disponibilidad = asientos[i]; // con esta variable declarada dentro del bucle vamos comprobando la
												// disponibilidad de los asientos

			if (disponibilidad == 0 && (i) <= 15) // Si resulta que est� libre y es <=15 estar� dentro de la zona de no
													// fumadores
				zonaNofumadores++; // y almacenamos aqu� el numero

			else if (disponibilidad == 0 && i > 15) // Si resulta que est� libre (=0) y es <=15 estar� dentro de la zona
													// de fumadores
				zonaFumadores++; // y almacenamos aqu� el numero
		}

		tamanioAsientosLibres = zonaFumadores + zonaNofumadores; // el numero de asientos libres sera igual a la suma de
																	// las variables anteriores

		asientosLibres = arrayAsientosLibres(asientos, tamanioAsientosLibres); // Llamamos a un metodo que nos permitir�
																				// cargar un array con los asientos
																				// disponibles
		// En esta llamada tiene como parametros el array original de los asientos y el
		// numero de asientos libres en total

		mostrarAsientos(asientosLibres, asientos);

	}

	/**
	 * Esta funcion nos sirve para copiar los asientos disponibles del array
	 * original al nuevo array. Este array generado contendra unica y exclusivamente
	 * aquellas posiciones libres. Para ello nos apollaremos en una variable
	 * {@value posicion} que nos servir� como punto de referencia para movernos en
	 * el array a generar.
	 * 
	 * @param arrayACopiar Este array se corresponde al array original, el de los
	 *                     asientos que cargamos al principio
	 * @param tamanio      El tamanio sera el numero de asientos libres que hemos
	 *                     deducido anteriormente
	 * @return devolver� un array con los asientos disponibles
	 */
	private static int[] arrayAsientosLibres(int[] arrayACopiar, int tamanio) {

		int[] asientosLibres; // Declaramos un array que nos permita almacenar los asientos disponibles
		int posicion = 0; // nos apoyaremos en esta variable llamada posici�n para movernos dentro del
							// array
		asientosLibres = new int[tamanio]; // Con esta sentencia declaramos el tamanio de asientosLibres con la
											// informacion recabada anteriormente

		for (int i = 0; i < arrayACopiar.length; i++) { // Con este bucle nos moveremos en el array original para saber
														// asientos estan libres
			if (arrayACopiar[i] == 0) { // si resulta que est� libre
				asientosLibres[posicion] = i; // copiaremos el asiento a nuestra nueva array en el valor de la posicion
												// que empieza en 0
				posicion++; // Una vez que hayamos copiado el asiento que est� disponible, el valor auxiliar
							// de POSICION se incrementar� desplaz�ndose
							// el mismo n�mero de veces que asientos haya disponibles en el ARRAY ORIGINAL.
			}

		}

		return asientosLibres; // Devolveremos el array asientos libres, es decir, la informaci�n exacta de
								// disponibilidad en el avion
	}

	/**
	 * Este metodo nos permitir� mostrar los asientos disponibles y reservar la
	 * opci�n del usuario a trav�s del uso de un IF anidado. Contiene una llamada a
	 * metodo @see {@link #asignarAsiento(int[])} que nos permitir� asignar la
	 * posici�n indicada por el usuario en el ARRAY ORIGINAL. Una vez este metodo
	 * finaliza se vuelve al metodo principal {@link #preguntarUsuario(int[])}
	 * 
	 * @param asientosLibres Este es el array que hemos cargado previamente con la
	 *                       situaci�n de los asientos disponibles
	 * 
	 * @param asientosAvion  el array ORIGINAL.
	 */
	private static void mostrarAsientos(int[] asientosLibres, int[] asientosAvion) {
		int asientosLibresNofumadores = 0, asientosLibresFumadores = 0;

		System.out.println(" * * *  A tener en cuenta * * * ");
		System.out.println("1.-Los asientos para no fumadores estan numerados del 1 al 15");
		System.out.println("2.-Los asientos para fumadores del 16 al 20");
		System.out.println();

		for (int i : asientosLibres) { // Volvemos a realizar una comprobaci�n de que zona son de fumadores o no ya que
										// estamos analizando
			if ((i + 1) <= 15) // los asientos del arrayCopia, no el ORIGINAL, y con esta informaci�n
								// realizaremos unos condicionales que nos permitir�n indicarle al usuario la
								// situaci�n del avion
				asientosLibresNofumadores++;
			else
				asientosLibresFumadores++;
		}

		if (asientosLibresNofumadores == 0 && asientosLibresFumadores != 0) { // Si solo hay asientos en FUMADORES
			System.out.println("Desea un asiento en la zona de fumadores?");
			System.out.println("Asientos libres en fumadores:" + asientosLibresFumadores);
			for (int i : asientosLibres) {
				if (i > 15) {
					System.out.print(" " + (i + 1));
				}
			}
			asignarAsiento(asientosAvion);
		} else if (asientosLibresFumadores == 0 && asientosLibresNofumadores != 0) { // Si solo hay asientos en NO
																						// FUMADORES
			System.out.println("Desea un asiento en la zona de no fumadores?");
			System.out.println("Asientos libres en no fumadores: " + asientosLibresNofumadores);
			for (int i : asientosLibres) {
				if (i <= 15) {
					System.out.print(" " + (i + 1));
				}

			}
			asignarAsiento(asientosAvion);
		} else if (asientosLibresNofumadores == 0 && asientosLibresFumadores == 0) // SI no hay asientos libres en el
																					// avion
			System.out.println("No hay asientos disponibles en este vuelo. El proximo saldr� ma�ana");

		else { // Cuando hay en asientos en ambas zonas
			System.out.println("Asientos libres en fumadores: " + asientosLibresFumadores);
			System.out.println("Asientos libres en no fumadores: " + asientosLibresNofumadores);
			System.out.print("n� asiento: ");
			for (int i : asientosLibres) {
				System.out.print(" " + (i + 1));
			}
			asignarAsiento(asientosAvion);
		}

	}

	/**
	 * Este metodo consiste en un bucle que recorre la array original y cambia el
	 * �ndice de 0 a 1 segun la plaza seleccionada por el usuario. SI no fuera as�,
	 * tendr�a que escoger otro asiento.
	 * 
	 * @param asientosAvion recibe el array original y asignamos mediante un bucle
	 *                      for y una condici�n la plaza si es que est� disponible
	 */
	private static void asignarAsiento(int[] asientosAvion) {
		int opcionUsuario = 0; // Variable para almacenar la opciond el usuario
		boolean bandera = false; // booleano que utilizaremos para realizar un bucle hasta que escoja un asiento

		System.out.println("\nQue asiento desea escoger?");
		opcionUsuario = scInt.nextInt();
		do {
			for (int i = 0; i < asientosAvion.length; i++) {
				if (opcionUsuario - 1 == i && asientosAvion[i] == 0) { // le restamos 1 a la opcion del usuario ya que
																		// modificamos el array para mostrar
					asientosAvion[i] = 1; // los asientos empezando desde 1 y no desde 0. As� ser� mas coherente de cara
											// a �l.
					System.out.println("plaza reservada"); // Si est� disponible se cambiara a 1 en el indice del array
															// ORIGINAL.
					bandera = true; // Y se detiene el bucle
				} else if (opcionUsuario - 1 == i && asientosAvion[i] == 1) {
					System.out.println("Este asiento no se encuentra disponible");
					System.out.println("Introduzca un asiento disponible");
					opcionUsuario = scInt.nextInt();
					i = 0; // reiniciamos el bucle para que vuelva a repasar las posiciones
					bandera = false;
				}
			}

		} while (!bandera);

		/*
		 * for (int i : asientosAvion) { System.out.print(i + " "); }
		 */
	}
}
