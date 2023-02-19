package ejercicio5Modelos;

import java.time.LocalDateTime;

/*Adem�s, en la pizzer�a hacen Paninis.
 *  Los Paninis tienen las mismas caracter�sticas que las pizzas, pero el tama�o en lugar de ser mediana o familiar, se describe como Almer�a,
Granada o Sevilla. Adem�s, se debe indicar si el Panini es doble o simple. 
En este caso, tambi�n se tiene que llevar la cuenta de cuantos paninis se han pedido y se han servido.
*/
enum TamanioPanini {
	ALMERIA, GRANADA, SEVILLA;
}

enum TipoPanini {
	SIMPLE, DOBLE;
}

public class Panini extends Producto {
	static int numeroTotalPaninisPedidos;
	static int numeroTotalPaninisServidos;
	
	private TamanioPanini tamanioPanini;
	private TipoPanini tipoPanini;
	
	public Panini() {
	
	}
	public Panini ( TamanioPanini tamanio,TipoPanini tipo ) {
		this.tipoPanini=tipo;
		this.tamanioPanini=tamanio;
		this.pedida=true;
		this.hora_Fecha_Pedida=LocalDateTime.now();
		this.precio=5;
	}

}
