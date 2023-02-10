package boletin4_Condicionales;

import java.util.Scanner;

public class Ejercicio8_salarioHijos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float salarioBruto, salarioNeto;
		int numeroHijos;

		System.out.println("indique su salario bruto");
		salarioBruto = sc.nextFloat();
		System.out.println("Indique el número de hijos");
		numeroHijos = sc.nextInt();

		if (numeroHijos <= 2 && numeroHijos > 0) {
			salarioNeto = (float) (salarioBruto * 0.2);
			System.out.println("Su salario bruto es: " + salarioBruto);
			System.out.println("Su deduccion ha sido de " + salarioNeto);
			salarioNeto = salarioBruto - salarioNeto;
			System.out.println("Su sueldo tras deducciones es de: " + salarioNeto);
		} else if (numeroHijos >= 3 && numeroHijos <= 5) {
			salarioNeto = (float) (salarioBruto * 0.15);
			System.out.println("Su salario bruto es: " + salarioBruto);
			System.out.println("Su deduccion ha sido de " + salarioNeto);
			salarioNeto = salarioBruto - salarioNeto;
			System.out.println("Su sueldo tras deducciones es de: " + salarioNeto);
		} else if (numeroHijos > 5 && numeroHijos <= 7) {
			salarioNeto = (float) (salarioBruto * 0.10);
			System.out.println("Su salario bruto es: " + salarioBruto);
			System.out.println("Su deduccion ha sido de " + salarioNeto);
			salarioNeto = salarioBruto - salarioNeto;
			System.out.println("Su sueldo tras deducciones es de: " + salarioNeto);
		} else if (numeroHijos > 7 && numeroHijos <= 9) {
			salarioNeto = (float) (salarioBruto * 0.05);
			System.out.println("Su salario bruto es: " + salarioBruto);
			System.out.println("Su deduccion ha sido de " + salarioNeto);
			salarioNeto = salarioBruto - salarioNeto;
			System.out.println("Su sueldo tras deducciones es de: " + salarioNeto);
		} else {
			System.out.println("Este es su sueldo: " + salarioBruto);

		}

	}
}
