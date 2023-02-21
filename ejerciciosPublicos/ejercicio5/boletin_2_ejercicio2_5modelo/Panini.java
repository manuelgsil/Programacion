package boletin_2_ejercicio2_5modelo;

import java.time.LocalDateTime;

/*Adem�s, en la pizzer�a hacen Paninis.
 *  Los Paninis tienen las mismas caracter�sticas que las pizzas, pero el tama�o en lugar de ser mediana o familiar, se describe como Almer�a,
Granada o Sevilla. Adem�s, se debe indicar si el Panini es doble o simple. 
En este caso, tambi�n se tiene que llevar la cuenta de cuantos paninis se han pedido y se han servido.
*/

public class Panini extends Producto {
	public static int numeroTotalPaninisPedidos;
	public static int numeroTotalPaninisServidos;

	private TamanioPanini tamanioPanini;
	private TipoPanini tipoPanini;

	public Panini() {

	}

	public Panini(TamanioPanini tamanio, TipoPanini tipo) {
		this.tipoPanini = tipo;
		this.tamanioPanini = tamanio;
		this.hora_Fecha_Pedida = LocalDateTime.now();
		calcularPrecio();
		Panini.numeroTotalPaninisPedidos++;
		pedida=true;
		 //redundante pero para acordarme del atributo por si le doy alguna utilidad
	}

	public TamanioPanini getTamanioPanini() {
		return tamanioPanini;
	}

	public void setTamanioPanini(TamanioPanini tamanioPanini) {
		this.tamanioPanini = tamanioPanini;
	}

	public TipoPanini getTipoPanini() {
		return tipoPanini;
	}

	public void setTipoPanini(TipoPanini tipoPanini) {
		this.tipoPanini = tipoPanini;
	}

	String contarPaninisPedidos(){
		return "El numero de paninis pedidos es: "+ numeroTotalPaninisPedidos;
	}

	@Override
	public void calcularPrecio() {
	
	if(tipoPanini.equals(TipoPanini.DOBLE))
			precio+=2;
	
		switch (tamanioPanini) {
		case ALMERIA:
			precio+=3;
			
			break;
		case GRANADA:
			precio+=4;
			break;
			
		case SEVILLA:
			precio+=5;
			break;
		default:
			break;
			

		}

		
		// creo que deberia ser con return pero para hacer pruebas no va mal
		
	}
}
