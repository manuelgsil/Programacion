package boletin4_Condicionales;

import java.util.Scanner;

public class Ejercicio2_horaDIa {

	public static void main(String[] args) {
		/*Realiza un programa que pida una hora por teclado y que muestre luego
		buenos días, buenas tardes o buenas noches según la hora. Se utilizarán
		los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Sólo se
		tienen en cuenta las horas, los minutos no se deben introducir por
		teclado.*/

		horadeldia1();
		horadeldia2();
		
	}

	private static void horadeldia2() {
Scanner sc=new Scanner (System.in);	
		
		int hora;
		
		System.out.println("Introduzca una hora");
		hora= sc.nextInt();
		
		switch(hora) {

		case 6,7,8,9,10,11,12:
			{
			System.out.println("Buenos días");
			}
			break;
		
		case 13,14,15,16,17,18,19,20:
			{
			System.out.println("Buenas tardes");
			break;
			}
		case 21,22,23,24,1,2,3,4,5:
			{
			System.out.println("Buenas noches");
				break;
			
			}
		}
		
	}

	private static void horadeldia1() {

		Scanner sc=new Scanner (System.in);	
		int hora;
		System.out.println("Introduzca una hora");
		hora= sc.nextInt();
		
		if(hora >= 6 && hora <= 12){
			System.out.println("Buenos dias");}
		else if(hora >=13 && hora <=20){
			System.out.println("Buenas tardes");}
		else if(hora <= 5 && hora >=0 || hora >= 21 && hora < 24  ){
			System.out.println("Buenas noches");}
		
		else {System.out.println("Introduzca un tramo horario valido");
		
	}



	}

}
