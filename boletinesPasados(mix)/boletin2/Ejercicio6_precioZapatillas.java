package boletin2;

public class Ejercicio6_precioZapatillas {
	public static void main(String[] args) {
		
		
		calculadoraDescuento(85,15);
	
		
	}

	private static void calculadoraDescuento(double precio, int descuento) {
		double descuentoDecimal= descuento/100, resul=0;
		
	resul= (1-descuentoDecimal)*precio; // Con el 1- descuento decimal conseguimos el porcentaje que buscamos, es decir,
										// lo resultante de descontar el descuento al 100%, multiplicandolo así con el precio del producto
										// obtendremos la información que queremos.
		
		
		
	}
}
