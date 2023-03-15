package gestion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Util {
	private static Scanner inputInt = new Scanner(System.in);

	public static Scanner inputString = new Scanner(System.in);
	private Random numeroAleatorio = new Random();
	 private static final String FORMATO_FECHA = "dd/MM/yyyy";

	/**
	 * Genera numeros aleatorios tipo INT entre los limites indicados (INCLUIDOS
	 * ESTOS)
	 * 
	 * @param num1 Principio de rango de numeros
	 * @param num2 Final de rango
	 * @return numero aleatorio entre ese rango
	 */
	public int generarNumerosAleatorios(int num1, int num2) {

		return numeroAleatorio.nextInt(num1, num2) + 1;

	}

	/**
	 * @author Manuel Este metodo devuelve un String con la informacion del tiempo
	 *         transcurrido entre dos fechas (segundos,minutos,horas y dias).
	 * 
	 * @param fecha1
	 * @param fecha2
	 * @return Devuelve un string con la informacion recabada
	 */
	public static String calcularDiferencia(LocalDateTime fecha1, LocalDateTime fecha2) {
		// Calcular la diferencia de tiempo entre las dos fechas
		Duration duracion = Duration.between(fecha1, fecha2);

		// Construir la cadena de resultado
		StringBuilder resultado = new StringBuilder();
		resultado.append("La diferencia de tiempo entre ").append(fecha1).append(" y ").append(fecha2).append(" es:\n")
				.append(duracion.getSeconds()).append(" segundos\n").append(duracion.toMinutes()).append(" minutos\n")
				.append(duracion.toHours()).append(" horas\n").append(duracion.toDays()).append(" días");

		// Devolver la cadena de resultado
		return resultado.toString();
	}

	/**
	 * @author Manuel Este metodo vuelve a darnos la informacion del tiempo
	 *         transcurrido entre dos fechas. La informacion que devuelve es un tipo
	 *         de dato INT y cuenta los dias de diferencia.
	 * 
	 * @param fecha1
	 * @param fecha2
	 * @return Un dato tipo int que sera la diferencia en dias entre dos fechas.
	 */
	public static int calcularDiasDeDiferencia(LocalDateTime fecha1, LocalDateTime fecha2) {
		LocalDate localDate1 = fecha1.toLocalDate();
		LocalDate localDate2 = fecha2.toLocalDate();
		return Period.between(localDate1, localDate2).getDays();
	}

	/**
	 * @author Manuel Metodo que nos sirve para pedirle al usuario que inserte una
	 *         fecha (LocalDate). Incluye la clase #DateTimeFormatter para que el
	 *         string que sirve como input sea formateado a LocalDate.
	 * 
	 *         Este metodo tambien incluye un blqoue try / catch para las
	 *         excepciones
	 * 
	 * @return devuelve la fecha en LocalDate
	 */
	public static LocalDate solicitarFecha() {
		LocalDate date = null;
		boolean fechaValida = false;
		Scanner sc;
		String fecha;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		while (!fechaValida) {
			System.out.println("Ingrese la fecha en formato yyyy-MM-dd: ");
			sc = new Scanner(System.in);
			fecha = sc.nextLine();
			try {
				date = LocalDate.parse(fecha, formatter);
				fechaValida = true;
			} catch (Exception e) {
				System.out.println("La fecha ingresada no es valida. Intente nuevamente.");
			}
		}
		return date;

	}

	/**
	 * @author Manuel
	 * @return devuelve un string solo de textos (no admite numeros en el string ni
	 *         tampoco admitira si este solo tuviera eespacios en blanco)
	 */
	public static String pedirString() {
		String texto = "";
		boolean bandera = true;
		while (bandera) {
			try {
				texto = inputString.nextLine();
				if (texto.matches("^\\s*$") || !texto.matches("^[a-zA-Z\\s]+$")) {
					System.out.println("Compruebe que haya introducido informacion o que no contenga numeros");
				} else {
					bandera = false;
				}
			} catch (Exception e) {
				System.out.println("Se ha producido la siguiente excepcion en el codigo: " + e.getMessage());
			}

		}
		return texto;
	}
	
	public static int pedirNumero() {

		int numero = 0;
		boolean entradaValida = false;

		while (!entradaValida) {

			try {
				numero = inputInt.nextInt();
				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Inserte un numero.");
				inputInt.nextLine(); // limpiar el buffer de entrada
			}
		}

		return numero;
	}
	
	 public static Number findMax(ArrayList<Number> list) throws IllegalArgumentException {
	        if (list == null || list.isEmpty()) {
	            throw new IllegalArgumentException("ArrayList cannot be null or empty");
	        }

	        Number max = list.get(0);

	        for (int i = 1; i < list.size(); i++) {
	            Number current = list.get(i);
	            if (current.doubleValue() > max.doubleValue()) {
	                max = current;
	            }
	        }

	        return max;
	    }
	 
	 public static int obtenerMinimo(int[] numeros) {
		    int minimo = numeros[0];
		    for (int i = 1; i < numeros.length; i++) {
		        if (numeros[i] < minimo) {
		            minimo = numeros[i];
		        }
		    }
		    return minimo;
		}
	 

	    // Calcula la diferencia en días entre dos fechas
	    public static int calcularDiferenciaEnDias(Date fechaInicio, Date fechaFin) {
	        long diferenciaEnMs = fechaFin.getTime() - fechaInicio.getTime();
	        long dias = diferenciaEnMs / (1000 * 60 * 60 * 24);
	        return (int) dias;
	    }
	    
	    // Convierte una fecha a una cadena en formato dd/MM/yyyy
	    public static String convertirFechaACadena(Date fecha) {
	        DateFormat formatoFecha = new SimpleDateFormat(FORMATO_FECHA);
	        return formatoFecha.format(fecha);
	    }
	    
	    public static int convertirCadenaANumero(String cadena) {
	        int numero = 0;
	        for (int i = 0; i < cadena.length(); i++) {
	            char c = cadena.charAt(i);
	            if (Character.isDigit(c)) {
	                int digito = c - '0';
	                numero = numero * 10 + digito;
	            } else {
	                throw new IllegalArgumentException("La cadena contiene caracteres no numéricos");
	            }
	        }
	        return numero;
	    }
	 
}

