package modelo;

public class Entrenador extends Persona {

	private final int NUMERO_COLEGIADO;

	public Entrenador(String nombre, String apellidos, Nacionalidad nacionalidad, int numeroColegiado) {
		super(nombre, apellidos, nacionalidad);
		this.NUMERO_COLEGIADO = numeroColegiado;
	}

	public Entrenador() {
		super();
		this.NUMERO_COLEGIADO=123;
	}

	public int getNUMERO_COLEGIADO() {
		return NUMERO_COLEGIADO;
	}

	
}
