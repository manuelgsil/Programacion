package boletin5_Bucles;

public class Ejercicio4_6_20haciatras {

	public static void main(String[] args) {
		ejercicio4();
		ejercicio5();
		ejercicio6();

	}

	private static void ejercicio6() {
		//Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
				//utilizando un bucle do while.
				int i =320;
				
				do{System.out.println(i);
				i-=20;
				}while(i>=160) ;

	}

	private static void ejercicio5() {
		// Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
		// utilizando un bucle while.
		int i = 320;
		while (i >= 160) {
			System.out.println(i);
			i -= 20;
		}

	}

	private static void ejercicio4() {
		// Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
		// utilizando un bucle for

		for (int i = 320; i >= 160; i -= 20) {

			System.out.println(i);
		}

	}

}
