package boletin3;

import java.util.Scanner;

public class Ejercicio5_calculadoraSueldo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
		//Declaramos las variables con las que vamos a trabjar
		
		double sueldofijo =1000; double irpf=0.18; 	//Las fijas
		
		//las que introduce el usuario
		double ventas, kmRecorridos, sueldoBruto, sueldoNeto;short diasDieta; 
	
	
		System.out.println("************* BIENVENIDO A LA CALCULADORA DE SUELDO ********************");
		System.out.println();
		
		System.out.println("Introduzca las ventas de este mes:");
		ventas= sc.nextDouble();
		ventas*=0.05; //Calculamos la comision con un operador de asignacion
		
		System.out.println("Introduzca el kilometraje:");
		kmRecorridos=sc.nextDouble();
		
		System.out.println("Dias de dieta que le correspondan:");
		diasDieta=sc.nextShort();
		diasDieta*=60; // misma dinámica que arriba
		
		sueldoBruto= sueldofijo + ventas + kmRecorridos + diasDieta; //Formula del salario Bruto
		
		System.out.println("El sueldo bruto sería de: "+sueldoBruto); // lo sacamos por pantalla

	sueldoBruto-=150; // Y antes de llegar al neto, con un operador de asignacion, aplicamos retenciones
		
	sueldoNeto=sueldoBruto-sueldofijo*irpf; // Formula del neto
	
		System.out.println("Su sueldo despues de las deducciones sería de: "+sueldoNeto);


	}

}
