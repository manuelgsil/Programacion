package boletin3;

import java.util.Scanner;

public class Ejercicio2_hombresymujeres {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Un profesor desea saber el porcentaje de hombres y el porcentaje de
		mujeres hay en un grupo de estudiantes, sabiendo que hay 3 mujeres y 22
		hombres. Imprime ambos porcentajes por pantalla */
	   
		// 25 = 100 %
		// 22 = x
		
		// Programaremos una regla de 3 
	   
		// Declararemos las variables que necesitamos para calcular la regla de 3:
		int numTotal, numAlumnas, numAlumnos;
		double resuAlumnos, resuAlumnas; 
		
	    System.out.println("Introduzca el numero de hombres");
	    numAlumnos= sc.nextInt();
	    
	    System.out.println("Introduzca el numero de mujeres");
	    numAlumnas =sc.nextInt();
	 
	    // Sumamos para conseguir el total y ejecutamos una regla de 3 que nos proporcine la info
	    
	    numTotal= numAlumnas + numAlumnos;
	    numAlumnas*=100;
	    numAlumnos*=100;
	    resuAlumnos= numAlumnos/numTotal;
	    resuAlumnas= numAlumnas/numTotal;
	   
	    System.out.println("Los porcentajes serían los siguientes:");
	    System.out.println("Alumnos: "+resuAlumnos + " Alumnas: "+ resuAlumnas);

	}

}
