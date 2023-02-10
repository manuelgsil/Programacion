package boletinModulos;

import java.util.Scanner;

public class EjercicioAleatorio {
	public static void main(String[] args) {
		/*
		 * Ejercicio 5: Crear un método que reciba dos números como parametros de
		 * entrada, y devuelva un número aleatorio que se encuentre entre ambos números.
		 * Utilizar para ello el método Math.random() .
		 */
		numeroPinzado();
		numeroAleatorioDani(0, 0);

	}
	
		private static int numeroAleatorioDani(int numeroMinimo, int numeroMaximo) {
		double numerosAleatorios= Math.floor(Math.random()*(numeroMaximo-numeroMinimo+1)+numeroMinimo);

			return (int) numerosAleatorios;
		
	}

	
		
	

	/**
	 * author: Manuel
	 * 
	 * Devolvemos un numero aleatorio comprendido entre los numeros indicados por el
	 * usuario
	 * 
	 * @serialData como variables tenemos los numeros del usuario, el num aleatorio
	 *             y un par mas que nos ayudaran a identificar cual es el MAYOR y el
	 *             MENOR de esos numeros.
	 * 
	 *             Muestra por pantalla el resultado
	 */
	static void numeroPinzado() {
		Scanner sc = new Scanner(System.in);
		int num1, num2, aleatorio, mayor, menor; 
		boolean bandera = false; //Creamos un booleano para el bucle posterior

		System.out.println("Al introducir dos numeros se le devolvera uno aleatorio que se encuentre entre ellos");
		System.out.print("Introduzca el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		num2 = sc.nextInt();

		if (num1 > num2) { // Con este condicional averiguamos cual es el mayor o el menor de los numeros
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1; // informacion que usaremos para delimitar el bucle
		}

		aleatorio = numAleatorio();

		while (bandera == false) {
			if (aleatorio < mayor && aleatorio > menor) // una vez delmiitado, si no se cumple la condicion
				bandera = true;
			else
				aleatorio = numAleatorio(); // llamara las veces que haga falta a un num aleatorio nuevo
		}
		System.out.println(aleatorio); // hasta que así sea y podamos imprimirlo por pantalla.
	}

	/**
	 *
	 * Este metodo nos permite generar un aleatorio nuevo cada vez que lo invoquemo.
	 * Esta forzado a que sea tipo int ya que viene en decimales. Por eso multiplicamos
	 * por 100 y colocamos el (int) delante de Math.random.
	 * 
	 * @return un numero Aleatorio 
	 */
	static int numAleatorio() {
		int aleatorio = (int) (Math.random() * 100); //Tenemos que forzar a que sea un dato tipo INT
		return aleatorio;
	}

	
}






