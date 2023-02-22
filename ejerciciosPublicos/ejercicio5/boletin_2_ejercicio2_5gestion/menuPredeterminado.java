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

	}

	public static void menuMarco() {
		/*
		 * En el programa principal se deben pedir 3 pizzas de distintos tipos
		 * (construir 3 pizzas), luego crear dos paninis distintos entre sí, después se
		 * pasa a servir 2 de esas pizzas y 1 panini. Almacenar los paninis y las pizzas
		 * en una array
		 */

		Pizza pizzaUsuario1 = new Pizza(TamanioPizza.FAMILIAR, TipoPizza.CUATRO_QUESOS);
		Pizza pizzaUsuario2 = new Pizza(TamanioPizza.FAMILIAR, TipoPizza.FUNGHI);
		Pizza pizzaUsuario3 = new Pizza(TamanioPizza.MEDIANA, TipoPizza.MARGARITA);

		Panini paniniUsuario1 = new Panini(TamanioPanini.ALMERIA, TipoPanini.DOBLE);
		Panini paniniUsuario2 = new Panini(TamanioPanini.GRANADA, TipoPanini.SIMPLE);

		servir(pizzaUsuario1);
		servir(pizzaUsuario2);
	
		Producto[] arrayProductos = {pizzaUsuario1, pizzaUsuario2, pizzaUsuario3, paniniUsuario1, paniniUsuario2 };

		for (Producto producto : arrayProductos) {
			System.out.println(producto.mostrarInfo());
					System.out.println();
		}
		
	mostrarInfoPizzeria();

	}

	private static void servir(Producto productoUsuario) {
		productoUsuario.servir();
		productoUsuario.calcularTiempoServicio();

	}
	private static void mostrarInfoPizzeria() {
		System.out.println("Pizzas:");
		System.out.println(Pizza.numeroTotalPizzasPedidas+" Pedidas");
		System.out.println(Pizza.numeroTotalPizzasServidas+" servidas\n");
		System.out.println("Paninis:");
		System.out.println(Panini.numeroTotalPaninisPedidos+" Pedidas");
		System.out.println(Panini.numeroTotalPaninisServidos+" Servidas");


	}

}
