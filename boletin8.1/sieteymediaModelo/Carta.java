package sieteymediaModelo;

public class Carta {

	Valor valor;
	Palo palo;
	private static double sumaTotal;

	public Carta() {

		// Llamamos al metodo del Enum que genera un valor aleatorio
		this.valor =  Valor.valorAleatorio() ;
		this.palo = Palo.paloAleatorio();
		sumaTotal = valorCarta(); // En este metodo hay un switch que nos generar� el valor de la carta en si

	}

	/* constructor con parametros para poder reinciar el juego. Su unico parametro de entrada es un DOUBLE que nos permitira
	 * poner a cero la variable sumaTotal */
	public Carta(double sumaTotal) {
		Carta.sumaTotal = sumaTotal;
	}

	public Valor getValor() {
		return valor;
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public double getSumaTotal() {
		return sumaTotal;
	}

	public void setSumaTotal(double sumaTotal) {
		this.sumaTotal = sumaTotal;
	}

	/**
	 * Con este metodo controlamos el atributo de sumaTotal con un Switch. el @param
	 * de entrada sera el atributo ENUM Valor.
	 * 
	 * @return
	 */
	public double valorCarta() {

		switch (valor) {
		case UNO:
			sumaTotal += 1;
			break;
		case DOS:
			sumaTotal += 2;
			break;
		case TRES:
			sumaTotal += 3;
			break;
		case CUATRO:
			sumaTotal += 4;
			break;
		case CINCO:
			sumaTotal += 5;
			break;
		case SEIS:
			sumaTotal += 6;
			break;
		case SIETE:
			sumaTotal += 7;
			break;
		case SOTA, CABALLO, REY:
			sumaTotal += 0.5;
			break;
		default:
			break;

		}
		return sumaTotal;
	}

	public String toString() {

		return "Has sacado la carta " + valor + " de " + palo + "\nPuntuacion: " + sumaTotal;
	}
}
