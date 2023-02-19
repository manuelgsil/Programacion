package ejercicio5gestion;

import java.util.Scanner;

import ejercicio5Modelos.Pizza;
import ejercicio5Modelos.TamanioPizza;
import ejercicio5Modelos.TipoPizza;



public class menuPredeterminado {

	private static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputString = new Scanner(System.in);

	public static void main(String[] args) {
		menuMarco();
	}

	/**
	 * @author Manuel Pantallazo incial del menu. Aqui almacenaremos la informacion
	 *         que queramos mostrar por pantalla y la seleccionaremos con un numero.
	 * 
	 * 
	 */
	private static void almacenPantallazos(int numeroPantallazo) {
		String bloqueTexto;
		switch (numeroPantallazo) {
		case 1:
			bloqueTexto = """
					¿Qué desea hacer?
					 1. - Pedir una Pizza
					 2. - Pedir un Panini
					 3. - Salir del programa
					 """;
			System.out.println(bloqueTexto);

			break;
		default:
			
		}
	}

	/**
	 * @author Manuel Metodo que almacena un SWITCH. Hay que modificarlo segun las
	 *         preferencias del usuario. Por defecto trae 3 opciones.
	 * 
	 * @param opcionUsuario
	 * @return
	 * 
	 */
	private static int pantallaSwitchUsuario(int opcionUsuario) {
	
		try {
			switch (opcionUsuario) { // En cada case esta indicado el contenido del metodo pantallazoMenu
			case 1,2:
				pedir(opcionUsuario);
				break;

			case 3:

				break;
			default:
				System.out.println("Introduzca una opcion valida");
			}
		} catch (Exception e) {
			System.out.println(" La estas liando");
		}
		return opcionUsuario;

	}

	private static void pedir(int opcion) {
		
		
		 
		
	}

	private static void menuMarco() {
		// TODO Modificarlo segun lo que necesitemos
		int opcionUsuario;

		do {
			almacenPantallazos(1);
			opcionUsuario = inputInt.nextInt();
			opcionUsuario = pantallaSwitchUsuario(opcionUsuario);
		} while (opcionUsuario != 3);

	}

	private static void crearPizza() {
		Pizza pizzaCliente = new Pizza(TamanioPizza.FAMILIAR,TipoPizza.MARGARITA);
				

}
