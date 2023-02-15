package ejercicio4;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacimiento;
	protected char sexo;
	protected int edad;

	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, char sexo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = LocalDate.of(sexo, sexo, sexo);
	
	}

	public Persona() { // constructor normal
		nombre = "Manuel";
		fechaNacimiento = LocalDate.of(1993, 3, 14);
		edad = calcularEdad(fechaNacimiento);

	}

	public int calcularEdad(LocalDate fechaNacimiento) {
		Period edad;
		LocalDate fechaActual = LocalDate.now();

		edad = Period.between(fechaNacimiento, fechaActual);

		return edad.getYears();

	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(LocalDate edad) {
		this.fechaNacimiento = edad;
	}

	public String saludar() {
		String saludo = "Hola soy " + this.nombre + " " + this.apellidos + " y te saludo";
		return saludo;
	}
}
