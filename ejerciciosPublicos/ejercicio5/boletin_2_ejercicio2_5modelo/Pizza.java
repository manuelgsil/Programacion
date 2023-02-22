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
		hora_Fecha_Servida = hora_Fecha_Pedida.plusMinutes(10);
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


	@Override
	public String mostrarInfo() {
		
		String informacion= "1.Tamanio pizza: \n"+getTamanioPizza()+"\n"+"2.Tipo Pizza:\n"+getTipo()+"\n"+
		"3.pedida:\n"+mostrarFechaHoraPedida+ "\n4.servida\n"+mostrarFechaHoraServida;
		return informacion;
	}

	@Override
	public void servir() {
		servida=true;
		numeroTotalPizzasServidas++;
		
	}

	
	
	
	
}
