package boletinModulos;

public class Concatenar_metodo {

	public static void main(String[] args) {

		/*
		 * Ejercicio 4: Realizar un método que tenga como parámetro de entrada dos
		 * cadenas, y muestre por pantalla, la concatenación de ambas cadenas.
		 */
		System.out.println(concatenador("estoy", "separado"));
	}

	static String concatenador(String cadena1, String cadena2) {
		String juntadaPadre = cadena1 + " " + cadena2;
		return juntadaPadre;
	}

}
