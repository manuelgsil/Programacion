package boletin_2_ejercicio2_5modelo;

import java.time.LocalDateTime;



public class Pizza extends Producto {

	 public static int numeroTotalPizzasPedidas; // no estoy muy seguro con poner esto public
	 public static int numeroTotalPizzasServidas;

	private TipoPizza tipo;
	private TamanioPizza TamanioPizza;

	public Pizza() {
		super();

	}

	public Pizza(TamanioPizza tamanio, TipoPizza tipo) {
		this.TamanioPizza = tamanio;
		this.tipo = tipo;
		calcularPrecio(); 
		hora_Fecha_Pedida= LocalDateTime.now();
		Pizza.numeroTotalPizzasPedidas++;

	}

	public void calcularPrecio() { 
		//TODO preguntar a Raul el tema de que sea public o private
		if(TamanioPizza.equals(TamanioPizza.FAMILIAR)) 
			this.precio=6;
		else
			precio=4;
	}
	public TipoPizza getTipo() {
		return tipo;
	}

	public void setTipo(TipoPizza tipo) {
		this.tipo = tipo;
	}

	public TamanioPizza getTamanioPizza() {
		return TamanioPizza;
	}

	public void setTamanioPizza(TamanioPizza tamanioPizza) {
		TamanioPizza = tamanioPizza;
	}
	String  pizzasPedidas() {
		return "numero total de pizzas hasta el momento: "+ numeroTotalPizzasPedidas;
	}

	@Override
	public String toString() {
		return "Pizza [tipo=" + tipo + ", TamanioPizza=" + TamanioPizza + ", precio=" + precio + ", pedida=" + pedida
				+ ", servida=" + servida + "]";
	}
	
	
}
