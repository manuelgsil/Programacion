package boletin_2_ejercicio2_5gestion;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

import boletin_2_ejercicio2_5modelo.Panini;
import boletin_2_ejercicio2_5modelo.Pizza;
import boletin_2_ejercicio2_5modelo.Producto;
import boletin_2_ejercicio2_5modelo.TamanioPanini;
import boletin_2_ejercicio2_5modelo.TamanioPizza;
import boletin_2_ejercicio2_5modelo.TipoPanini;
import boletin_2_ejercicio2_5modelo.TipoPizza;

public class menuPredeterminado {

	private static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputString = new Scanner(System.in);

	public static void main(String[] args) {
		
		menuMarco();

		

		/* Producto arrayProductos[] = { paniniPrueba, pizzaPrueba };
		servirProducto(arrayProductos); */

		/*
		 * for (Producto producto : arrayProductos) {
		 * System.out.println(producto.isServida());		
		 */
		// Bucle para recorrer el array de productos.
	}

	static String servirProducto(Producto producto) {
		
		producto.setHora_Fecha_Servida(LocalDateTime.now());
		Duration diferencia;
		diferencia= Duration.between(producto.getHora_Fecha_Pedida(),producto.getHora_Fecha_Servida());
		return "Se ha servido en: "+ diferencia.toMinutes()+" minutos";
		
	}

	/*private static void servirProducto(Producto[] arrayProductos) { 
	

	}*/

	/**
	 * @author Manuel Pantallazo incial del menu. Aqui almacenaremos la informacion
	 *         que queramos mostrar por pantalla y la seleccionaremos con un numero.
	 * 
	 * 
	 */
	 static void almacenPantallazos(int numeroPantallazo) {
		String bloqueTexto;
		switch (numeroPantallazo) {
		case 1:
			bloqueTexto = """
					QUE DESEA HACER?
					 1. - Pedir una Pizza
					 2. - Pedir un Panini
					 3. - Salir del programa
					 4. REcoger pedido
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
	public static int pantallaSwitchUsuario(int opcionUsuario) {
		Producto objeto = null;
		try {
			switch (opcionUsuario) { // En cada case esta indicado el contenido del metodo pantallazoMenu
			case 1:
					objeto = crearPizza();
				break;
			case 4:
				System.out.println(servirProducto(objeto));
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

	



	public static void menuMarco() {
		int opcionUsuario;

		do {
			almacenPantallazos(1);
			opcionUsuario = inputInt.nextInt();
			opcionUsuario = pantallaSwitchUsuario(opcionUsuario);
		} while (opcionUsuario != 3);

	}

	public static Producto  crearPizza() {
		Pizza pizzaPrueba = new Pizza(TamanioPizza.FAMILIAR, TipoPizza.CUATRO_QUESOS);
		return pizzaPrueba;

	}
}