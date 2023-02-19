package ejercicio5Modelos;

import java.time.LocalDateTime;

/*Además, en la pizzería hacen Paninis.
 *  Los Paninis tienen las mismas características que las pizzas, pero el tamaño en lugar de ser mediana o familiar, se describe como Almería,
Granada o Sevilla. Además, se debe indicar si el Panini es doble o simple. 
En este caso, también se tiene que llevar la cuenta de cuantos paninis se han pedido y se han servido.
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
