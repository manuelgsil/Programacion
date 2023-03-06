package ejercicio6modelo;

public class Cliente {
//nombre y DNI del cliente, la fecha inicial y final de alquiler, la posición del amarre y el barco que lo ocupará.
	
	private String nombre;
	private String dni;
	private Barco barco;
	
	
	public Cliente(Barco barco) {
		nombre="Elpijo";
		dni="dni";
		this.barco=barco;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDni() {
		return dni;
	}


	public Barco getBarco() {
		return barco;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public void setBarco(Barco barco) {
		this.barco = barco;
	}

}
