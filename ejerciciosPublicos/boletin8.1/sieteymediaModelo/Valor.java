package sieteymediaModelo;

import java.util.Random;

public enum Valor {
	UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY;

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
	public static Valor valorAleatorio() {
		Valor[] arrayValores = values();
		return arrayValores[aleatorio.nextInt(arrayValores.length)];
	}

}
