package sieteymediaGestion;

import java.util.Scanner;

import sieteymediaModelo.Carta;

public class Menu {
	private static Scanner scInt = new Scanner(System.in);

	public static void main(String[] args) {
		menu();

	}

	/**
	 * Menu principal del juego en el que anidamos los distintos metodos que hemos
	 * empleado para construir el juego a traves de un bucle DO WHILE y un SWITCH.
	 * 
	 * En primera instancia, tenemos los metodos que usamos para mostrar informacion
	 * por pantalla:
	 * 
	 * @see {@link #pantallazoMenu() #reglas()}
	 * 
	 *      y por otro, tendriamos {@link #jugar()} en el cual reside el core del
	 *      programa.
	 * 
	 */
	private static void menu() {
		int opcion;
		Carta cartaReseteo = new Carta(0); // declaramos esta carta para propositos posteriores

		System.out.println("************************\n\tBienvenido");
		do {
			pantallazoMenu(); // En los metodos hemos almacenado los sysout del menu
			System.out.println("Introduzca una opcion");
			opcion = scInt.nextInt();
			switch (opcion) { // En cada case esta indicado el contenido del metodo anterior
			case 1:
				reglas(); // Metodo que muestra las reglas del juego
				break;

			case 2:
				jugar(); // Metodo principal del juego
				resetearJuego(cartaReseteo); // Cuando salimos del juego reseteamos los valores de la variable SUMATOTAL
												// de nuestro OBJETO CARTA
												// para poder volver a jugar si asi quisiera el usuario
				break;
			case 3:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Introduzca una opcion valida");
			}
		} while (opcion != 3); // Mientras no se escoja salir se sigue ejecutando
	}

	private static void reglas() {
		System.out
				.println("El juego consiste en acercarse lo maximo posible a la puntuacion clave, es decir, al 7.50.");
		System.out.println(
				"El jugador saca una carta inicial y a excepcion de sota, caballo y rey (que valen 0.50) el resto de cartas");
		System.out.println("tienen un valor identico a su numeracion.");
		System.out.println(
				"El jugador decidira si plantarse o seguir sacando cartas para acercarse lo maximo posible a la puntuacion clave");

	}

	private static void pantallazoMenu() {
		System.out.println("**********************");
		System.out.println("1.Reglas\n");
		System.out.println("2.Jugar\n");
		System.out.println("3.Salir\n");
		System.out.println("*********************");
	}

	private static void pantallazoJuego() {
		System.out.println("*******************");
		System.out.println("1-  NUEVA CARTA ");
		System.out.println("2-  ME PLANTO ");
		System.out.println("********************");

	}

	private static void jugar() {

		int opcion; // Variable para recoger la informacion del escaner
		double indicadorJuego = 0; // declaramos una variable tipo DOUBLE para almacenar el valor de la SUMATOTAL
									// de los OBJETOS CARTA.
									// Su uso nos permitira usar la misma informacion en distintos metodos para
									// reducir la complejidad
									// ciclomatica. Es decir, podremos dividir los condicionales en distintos
									// metodos.
		do {
			pantallazoJuego(); // 1 . NUEVA CARTA 2. PLANTARSE
			opcion = scInt.nextInt();
			if (opcion == 1)
				indicadorJuego = sacarCarta(); // En nuestra variable almacenamos la llamada al metodo que genera una
												// nueva carta
			resultado(indicadorJuego); // Este mismo indicador será usado como parametro dentro de un metodo que nos
										// indicara si hemos
										// ganado o perdido
		} while (indicadorJuego < 7.50 && opcion != 2); // aqui hemos escogido el DOS como numero de salida

		cartaPlantada(opcion); // y si se plantan, llamaran a este metodo que muestra la proxima carta, el cual
								// tiene como parametro de entrada
								// el NUMERO ENTERO que hayamos indicado como OPCION PARA PLANTARSE

	}

	/**
	 * Metodo que genera un objeto Carta mediante el constructor aleatorio. A su
	 * vez, devuelve el valor total de las cartas que se hayan ido generando.
	 * 
	 * @return la suma total del valor de las cartas generadas hasta el momento
	 */
	private static double sacarCarta() {

		Carta nuevaCarta = new Carta();
		System.out.println(nuevaCarta);

		return nuevaCarta.getSumaTotal();

	}

	/**
	 * Este metodo muestra la carta que hubiera seguido a la del jugador de no
	 * haberse plantado.
	 * 
	 * el parametro de entrada debe debe concidir con el INT que hayas escogido para
	 * que realice la funcion de plantarse
	 * 
	 * @param En este caso el parametro de entrada debe ser un 2
	 */

	private static void cartaPlantada(int opcionSalida) {

		if (opcionSalida == 2) {
			Carta cartaSiguiente = new Carta();
			System.out.println(
					"La siguiente carta era: " + cartaSiguiente.getValor() + " DE " + cartaSiguiente.getPalo());
		}
	}

	/**
	 * Metodo en el que anidamos un IF para indicar al jugador el resultado de sus
	 * acciones: Si gana SI pierde (se le muestra tambien por cuanto se ha pasado de
	 * la puntuacion exacta)
	 * 
	 * @param valorCarta es el atributo sumaTotal de los objetos Carta.
	 */
	private static void resultado(double valorCartas) {

		if (valorCartas == 7.50)
			System.out.println("Ganaste");
		else if (valorCartas > 7.50) {
			System.out.println("Perdiste, te has pasado por: " + (valorCartas - 7.50) + " puntos");

		}

	}

	private static void resetearJuego(Carta carta) {
		carta.setSumaTotal(0);

	}

}
