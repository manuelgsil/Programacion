package boletin7_arrays;

import java.util.Scanner;

public class TresEnRaya {
	public static Scanner scInt = new Scanner(System.in);
	public static Scanner scString = new Scanner(System.in);

	public static void main(String[] args) {
		String[] panel;
		panel = panel();
		char usuario1 = 0, usuario2 = 0;

		usuario1 = escogerUsuario(usuario1);

		marcaUsuario(usuario1, panel);

	}

	private static void marcaUsuario(char usuario, String[] panel) {
		int marca;
		System.out.println("Que posicion marcas?:");
		System.out.println(" Las posiciones estan numeradas de la siguiente forma");

		marca = scInt.nextInt();

		System.out.println();
		for (int i = 0; i < panel.length; i++) {
			//if (marca == i)
				//panel[i] = ;
		}

		for (String string : panel) {
			System.out.print(string);
		}
	}

	private static char escogerUsuario(char usuario) {
		String eleccionUsuario = "";
		boolean bandera;
		System.out.println("Que caracter escoges?");
		System.out.println("-X.\n-O.");

		do {
			eleccionUsuario = scString.nextLine();
			usuario = eleccionUsuario.charAt(0);
			bandera = eleccionUsuario.equalsIgnoreCase("x") || eleccionUsuario.contentEquals("o");

			if (!bandera)
				System.out.println("introduzca un caracter válido:\n-X.\n-O.");

		} while (!bandera);

		return usuario;

	}

	private static String[] panel() {
		String[] panel = { " |", " |", " ", "\n |", " |", " ", "\n |", " |", " " };

		return panel;
	}

}