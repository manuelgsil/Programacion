package boletinModulos;

public class Concatenar_metodo {

	public static void main(String[] args) {

		/*
		 * Ejercicio 4: Realizar un m�todo que tenga como par�metro de entrada dos
		 * cadenas, y muestre por pantalla, la concatenaci�n de ambas cadenas.
		 */
		System.out.println(concatenador("estoy", "separado"));
	}

	static String concatenador(String cadena1, String cadena2) {
		String juntadaPadre = cadena1 + " " + cadena2;
		return juntadaPadre;
	}

}
