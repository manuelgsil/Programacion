package gestion;

import modelo.Entrenador;
import modelo.Nacionalidad;
import modelo.Saltador;
import modelo.Salto;

public class menuPredeterminado {


	public static void main(String[] args) {


		menuMarco();
	}

	private static void menuMarco() {
		// TODO Modificarlo segun lo que necesitemos
		int opcionUsuario;
		Saltador saltadorUsuario = null;
		do {
			almacenPantallazos(1);
			opcionUsuario = Util.pedirNumero();

			switch (opcionUsuario) {
			case 1:
				saltadorUsuario = nuevoSaltador();
				break;
			case 2:
				if (saltadorUsuario == null)
					System.out.println("Primero necesita dar de alta un competidor");
				simularCompeticion(saltadorUsuario);
				break;
			case 3:
				System.out.println(saltadorUsuario);
				break;

			}
		} while (opcionUsuario != 4);

	}

	private static void estadisticas() {
		// TODO Auto-generated method stub

	}

	private static void simularCompeticion(Saltador saltador) {
		/*
		 * Se simulará para cada saltador dado de alta en el sistema, las característica
		 * de sus saltos votación y validez), de forma aleatoria, teniendo en cuenta
		 * que:
		 * 
		 * La probabilidad de que un salto sea inválido o válido, no va a ser la misma.
		 * Los saltos serán inválidos con un 15% de probabilidad, mientras que serán
		 * válidos con un 85% de probabilidad.
		 */
		Salto[] arraySaltos = new Salto [5];
		for (int i = 0; i < arraySaltos.length; i++) {
			Salto salto= new Salto();
			arraySaltos[i]=salto;
		}
		
		saltador.setSaltos(arraySaltos);
		
		

	}

	private static Saltador nuevoSaltador() {
		String nombre;
		String apellido;
		Nacionalidad nacionalidad = null;
		int numeroColegiado;

		// 1. creamos al entrenador del saltador ya que el saltador necesita de este
		// para su constructor
		System.out.println("Introduzca el nombre del entrenador");
		nombre = Util.pedirString();
		System.out.println("Introduzca el apellido del entrenador");
		apellido = Util.pedirString();
		System.out.println("Introduzca el Numero de colegiado");
		numeroColegiado = Util.pedirNumero();

		nacionalidad = escogerNacionalidad(nacionalidad);

		Entrenador entrenadorAtleta = new Entrenador(nombre, apellido, nacionalidad, numeroColegiado);

		// 2. Realizamos las dos preguntas iguales aprovechando las variables y en su
		// constructor metemos al entrenador creado previamente;

		System.out.println("Introduzca el nombre del competidor");
		nombre = Util.pedirString();
		System.out.println("Introduzca el apellido del competidor");
		apellido = Util.pedirString();
		nacionalidad = escogerNacionalidad(nacionalidad);
		Saltador saltador = new Saltador(nombre, apellido, nacionalidad, entrenadorAtleta);

		return saltador;

	}

	private static Nacionalidad escogerNacionalidad(Nacionalidad nacionalidad) {
		almacenPantallazos(2);
		int opcionUsuario;

		do {
			opcionUsuario = Util.pedirNumero();

			switch (opcionUsuario) {
			case 1:
				nacionalidad = Nacionalidad.ESP;
				break;
			case 2:
				nacionalidad = Nacionalidad.GBR;
				break;
			case 3:
				nacionalidad = Nacionalidad.USA;
				break;
			case 4:
				nacionalidad = Nacionalidad.PRT;
				break;
			default:
				System.out.println("Opción inválida, por favor seleccione una opción válida.");
			}

		} while (nacionalidad == null);

		return nacionalidad;
	}

	/**
	 * @author Manuel Pantallazo incial del menu. Aqui almacenaremos la informacion
	 *         que queramos mostrar por pantalla
	 * 
	 * 
	 */
	private static void almacenPantallazos(int numeroPantallazo) {
		String bloqueTexto;
		switch (numeroPantallazo) {
		case 1:
			bloqueTexto = """
					*************************************************
						¿Qué desea realizar?
						1 - Dar de alta un Saltador
						2 - Simular competición
						3 - Ver estadísticas
					************************************************

						""";
			System.out.println(bloqueTexto);

			break;
		case 2:
			bloqueTexto = """
					Introduzca su nacionalidad:
					1.ESP
					2.GBR
					3.USA
					4.PRT
							""";
			System.out.println(bloqueTexto);
			break;
		}
	}
}
