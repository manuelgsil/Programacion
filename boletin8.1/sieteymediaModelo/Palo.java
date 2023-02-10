package sieteymediaModelo;

import java.util.Random;

public enum Palo {
	COPAS, ESPADAS, BASTOS, OROS;
	
	private static final Random aleatorio = new Random();
	
	/**
	 * A traves de este metodo creamos un valor aleatorio que del ENUM. Para ello,
	 * se realizar una conversion del ENUM a un array y mediante un metodo se genera
	 * un array cuyo tamanio equivale al total de opciones.
	 * 
	 * Por otro lado, usamos la clase Random para seleccionar una posicion aleatoria
	 * (equivalente a un dato del enum).
	 * 
	 * @serialData *aleatorio* es una variable que usa la clase Random para escoger
	 *             el dato aleatorio.
	 * @return Devuelve una posicion / valor aleatorio;
	 */
	public static Palo paloAleatorio() {
		Palo[] arrayPalos = values();
		return arrayPalos[aleatorio.nextInt(arrayPalos.length)];
	}
}
