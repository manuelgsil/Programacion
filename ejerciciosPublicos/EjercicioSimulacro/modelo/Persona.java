package modelo;

/*
 * De un saltador nos interesa conocer: nombre, apellidos, nacionalidad (los datos posibles son ESP, GBR, USA, PRT), 
total de puntos en la competici�n (double), y los datos de su entrenador.

De cada entrenador queremos saber, su n�mero de colegiado (un entero), y su nacionalidad (los datos posibles son ESP, GBR, USA, PRT).
De
Para cada saltador, queremos que se implemente el m�todo equals, sabiendo que dos saltadores son iguales si tienen el mismo nombre, apellidos y nacionalidad.
Tambi�n queremos implementar el m�todo que permita a un saltador, intercambiar su entrenador con el de otro saltador.
 Es decir, un saltador acabar�a con el entrenador del otro, y viceversa, una vez ejecutado el m�todo.
 */
public abstract class Persona {

	protected String nombre;
	protected String apellidos;
	protected Nacionalidad nacionalidad;
	
	protected Persona(String nombre, String apellidos, Nacionalidad nacionalidad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
	}
	public Persona() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
