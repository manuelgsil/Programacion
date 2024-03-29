package ejercicio6modelo;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class Util {
	private static Scanner inputInt = new Scanner(System.in);

	public static Scanner inputString = new Scanner(System.in);
	private Random numeroAleatorio = new Random();
	
	/**
	 * Genera numeros aleatorios tipo INT entre los limites indicados (INCLUIDOS ESTOS)
	 * @param num1 Principio de rango de numeros
	 * @param num2 Final de rango
	 * @return numero aleatorio entre ese rango
	 */
	public int generarNumerosAleatorios(int num1, int num2){
		
		return numeroAleatorio.nextInt(num1,num2)+1;
		
	}
	private static int comprobadorValoresNegativos(int valor) {
		boolean error = true;
		while (error) {
			if (valor < 0) {
				System.out.println("Introduzca un valor positivo");
				valor = inputInt.nextInt();
			}
			else 
			error = false;
		}
		return valor;
		}

	private static int comprobadorOpciones(int opcionUsuario, int primeraOpcion, int ultimaOpcion) {
		
		while (opcionUsuario < primeraOpcion || opcionUsuario > ultimaOpcion) {
			System.out.println("Introduzca una opcion valida");
			opcionUsuario = inputString.nextInt();
		}
		return opcionUsuario;
		}
	public static String calcularDiferencia(LocalDateTime fecha1, LocalDateTime fecha2) {
        // Calcular la diferencia de tiempo entre las dos fechas
        Duration duracion = Duration.between(fecha1, fecha2);

        // Construir la cadena de resultado
        StringBuilder resultado = new StringBuilder();
        resultado.append("La diferencia de tiempo entre ")
                .append(fecha1)
                .append(" y ")
                .append(fecha2)
                .append(" es:\n")
                .append(duracion.getSeconds())
                .append(" segundos\n")
                .append(duracion.toMinutes())
                .append(" minutos\n")
                .append(duracion.toHours())
                .append(" horas\n")
                .append(duracion.toDays())
                .append(" d�as");

        // Devolver la cadena de resultado
        return resultado.toString();
    }
	public static int calcularDiasDeDiferencia(LocalDateTime fecha1, LocalDateTime fecha2) {
	    LocalDate localDate1 = fecha1.toLocalDate();
	    LocalDate localDate2 = fecha2.toLocalDate();
	    return Period.between(localDate1, localDate2).getDays();
	}

}
