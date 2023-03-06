package ejercicio6Gestion;

import java.time.LocalDateTime;

import ejercicio6modelo.Barco;
import ejercicio6modelo.Cliente;
import ejercicio6modelo.Util;

public class Alquiler {
	/*
	 * 
	 * alquiler se calcula multiplicando el número de días de ocupación (incluyendo
	 * los días inicial y final) por un módulo función de cada barco (obtenido
	 * simplemente multiplicando por 10 los metros de eslora) y por un valor fijo
	 * (800€).
	 */

	private Cliente cliente;
	private Barco barco;
	private LocalDateTime fechaInicioAlquier;
	private LocalDateTime fechaFinAlquier;
	private int cantidadAlquiler;

	public Alquiler(Cliente cliente, LocalDateTime fechaInicioAlquier, LocalDateTime fechaFinAlquier) {
		super();
		this.cliente = cliente;
		this.barco = cliente.getBarco();
		this.fechaInicioAlquier = fechaInicioAlquier;
		this.fechaFinAlquier = fechaFinAlquier;
		cantidadAlquiler = calcularAlquiler();
	}

	private int calcularAlquiler() {
		return diasAlquiler() * barco.calcularModulo() * 800;

	}

	private int diasAlquiler() {
		// con este metodo nos devuelve la diferencia de los dias
		return Util.calcularDiasDeDiferencia(fechaInicioAlquier, fechaFinAlquier);
	}

	@Override
	public String toString() {
		StringBuilder resumenAlquiler= new StringBuilder();
		resumenAlquiler.append("El alquiller de su barco con matricula: ");
		resumenAlquiler.append(barco.getMatricula());
		resumenAlquiler.append("\nque corresponde a un barco de tipo: ");
		resumenAlquiler.append(barco.getTipo());
		resumenAlquiler.append("\ndurante ");
		resumenAlquiler.append(diasAlquiler());
		resumenAlquiler.append(" dias saldría por:\n");
		resumenAlquiler.append(cantidadAlquiler);
		resumenAlquiler.append(" euros");
		
		
		return resumenAlquiler.toString(); // devolvemos el StringBuilder a String
	}

}
