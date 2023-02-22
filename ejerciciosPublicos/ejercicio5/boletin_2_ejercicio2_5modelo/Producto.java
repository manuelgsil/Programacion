package boletin_2_ejercicio2_5modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Producto {

	protected double precio; 
	protected LocalDateTime hora_Fecha_Pedida = LocalDateTime.now();
	protected LocalDateTime hora_Fecha_Servida;
	protected String mostrarFechaHoraPedida;
	protected String mostrarFechaHoraServida;
	protected boolean pedida;
	protected boolean servida;


	public void setServida(boolean servida) {
		this.servida = servida;
	}

	public Producto() {
		establecerFechaPedida();

	}

	public LocalDateTime getHora_Fecha_Servida() {
		return hora_Fecha_Servida;
	}

	public void setHora_Fecha_Servida(LocalDateTime hora_Fecha_Servida) {
		this.hora_Fecha_Servida = hora_Fecha_Servida;
	}

	public String getMostrarFechaHoraServida() {
		return mostrarFechaHoraServida;
	}

	public void setMostrarFechaHoraServida(String mostrarFechaHoraServida) {
		this.mostrarFechaHoraServida = mostrarFechaHoraServida;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMostrarFechaHoraPedida() {
		return mostrarFechaHoraPedida;
	}

	public void setMostrarFechaHoraPedida(String mostrarFechaHoraPedida) {
		this.mostrarFechaHoraPedida = mostrarFechaHoraPedida;
	}

	public void establecerFechaPedida() {
		DateTimeFormatter isoFecha = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter isoHora = DateTimeFormatter.ISO_LOCAL_TIME;
		mostrarFechaHoraPedida = "Fecha: " + hora_Fecha_Pedida.format(isoFecha) + "\n" + "Hora: "
				+ hora_Fecha_Pedida.format(isoHora);

	}

	public LocalDateTime getHora_Fecha_Pedida() {
		return hora_Fecha_Pedida;
	}

	public void setHora_Fecha_Pedida(LocalDateTime hora_Fecha_Pedida) {
		this.hora_Fecha_Pedida = hora_Fecha_Pedida;
	}

	public void calcularTiempoServicio() { // le añadimos 10 minutos a cada servicio
		
			Duration diferencia;
			diferencia = Duration.between(hora_Fecha_Pedida, hora_Fecha_Servida);
			mostrarFechaHoraServida = "Ha tardado :" + diferencia;
		
		

	}

	public abstract void calcularPrecio();

	public abstract void servir();

	public void setPedida(boolean pedida) {
		this.pedida = pedida;
	}
	
	public abstract String mostrarInfo();
		
	
}
