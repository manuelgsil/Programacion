package boletinModulos;

import java.util.Scanner;

public class Piramide2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int altura, espacio;

		String string;
		char c;

		System.out.println("Introduzca un caracter para dibujar su pirámide");
		string = sc.nextLine();
		c = string.charAt(0);

		System.out.println("Introduzca el tamaño de la base");
		altura = sc.nextInt();

		for (int i = 1; i <= altura; i++) {
			
			for (int j = 1; j <= altura- i; j++) {
				System.out.print(" "); 
			}
			
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print(c);
			}
			System.out.println("");
		}
	}
}