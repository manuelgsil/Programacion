package ejercicio5Modelos;

import java.time.LocalDateTime;

 public enum TamanioPizza {
			MEDIANA("MEDIANA"), FAMILIAR("FAMILIAR)");
	 
	 	private TamanioPizza(String tamanio) {
	 		this.tamanio=tamanio;
	 	}
	 	private String tamanio;
}

  public enum TipoPizza { 
		MARGARITA, CUATRO_QUESOS, FUNGHI;
	
}

	/*
	 * Sobre cada pizza se necesita saber el tamaño- mediana o familiar - el tipo -
	 * margarita, cuatro quesos o funghi - y su estado - pedida o servida. La fecha
	 * y hora en la que fue servida, y en la que fue pedida. La clase debe almacenar
	 * información sobre el número total de pizzas que se han pedido y que se han
	 * servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
	 */

public class Pizza extends Producto {
	
	static int numeroTotalPizzasPedidas;
	static int numeroTotalPizzasServidas;
	
	private TipoPizza tipo;
	private TamanioPizza TamanioPizza;
	
	
	public Pizza() {
		super();
		
	}
	public Pizza(TamanioPizza tamanio, TipoPizza tipo) {
		this.precio=5;
		this.pedida=true;
		this.TamanioPizza=tamanio;
		this.tipo=tipo;
		
	}
	


	

}
