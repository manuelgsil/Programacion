package boletin3;

import java.util.Scanner;

public class ejercicio1_Medias {
	public static void main(String[] args) {

		// Importamos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos las variables fijas

		final double porcentajeParciales, porcentajeExamen, porcentajeTrabajo;

		porcentajeParciales = 0.55;
		porcentajeExamen = 0.30;
		porcentajeTrabajo = 0.15;

		// Creamos una variable para recoger el nombre del Alumno

		String nombreAlumno;

		// Le pedimos al usuario el nombre;

		System.out.println("Introduzca el nombre del Alumno: ");

		// Recogemos esa información por terminal

		nombreAlumno = sc.nextLine();

		// Creamos las variables que de los parciales

		double notaParcial1, notaParcial2, notaParcial3;

		// Pedimos estas mismas y las recogemos en variables

		System.out.println("Introduzca las notas de cada parcial");

		notaParcial1 = sc.nextDouble();
		notaParcial2 = sc.nextDouble();
		notaParcial3 = sc.nextDouble();

		// Continuamos requiriendo las notas que faltan y las declaramos como variables:
		double notaExamenfinal, notaTrabajofinal;

		System.out.println("Introduzca la nota del examen final:");
		notaExamenfinal = sc.nextDouble();
		System.out.println("Por último, introduzca la nota del trabajo final");
		notaTrabajofinal = sc.nextDouble();

		// Como paso cercano al último declaramos las variables que vamos a calcular

		double mediaParciales, mediaExamen, mediaTrabajo, mediaTotal;

		mediaParciales = ((notaParcial1 + notaParcial2 + notaParcial3) / 3) * porcentajeParciales;

		mediaExamen = notaExamenfinal * porcentajeExamen;

		mediaTrabajo = notaTrabajofinal * porcentajeTrabajo;

		mediaTotal = mediaParciales + mediaExamen + mediaTrabajo;

		// Y decidimos como queremos mostrar la información:

		System.out.println("La media de los parciales ha sido: " + mediaParciales);
		System.out.println("La media del examen es : " + mediaExamen);
		System.out.println("Y la del trabajo : " + mediaTrabajo);
		System.out.println("Por lo que " + nombreAlumno + " tiene una nota final de: " + mediaTotal);
	}
}
