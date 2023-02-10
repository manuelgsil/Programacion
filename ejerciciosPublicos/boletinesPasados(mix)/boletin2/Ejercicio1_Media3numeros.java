package boletin2;

public class Ejercicio1_Media3numeros {
	public static void main(String[] args) {

		System.out.println(media3numeros(5,6,7));;
	}

	private static double media3numeros(int num1, int num2, int num3) {
		double resul;
		
		num1=num1+num2+num3;
		resul=num1/3;
		return resul;
		
		
		
	}

}
