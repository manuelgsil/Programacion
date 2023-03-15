package modelo;

public class Saltador extends Persona {

	private double puntosCompeticion;
	private Entrenador entrenador;
	private Salto[] saltos;


	public Saltador(String nombre, String apellidos, Nacionalidad nacionalidad, Entrenador entrenador) {
		super(nombre, apellidos, nacionalidad);
		this.entrenador = entrenador;
		this.puntosCompeticion=0;
	}

	public Saltador() {
		Entrenador entrenadorPrueba= new Entrenador();
		this.nombre="manolo";
		this.apellidos="El saltarin";
		this.entrenador=entrenadorPrueba;
	}

	public double getPuntosCompeticion() {
		return puntosCompeticion;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setPuntosCompeticion(double puntosCompeticion) {
		this.puntosCompeticion = puntosCompeticion;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
		public Salto[] getSaltos() {
		return saltos;
	}

	public void setSaltos(Salto[] saltos) {
		this.saltos = saltos;
	}

	
	public boolean Equals(Saltador saltador) {
		//Podriamos haber puesto que la entrada por parametros fuera tipo objeto y comprobar si es una instancia de Saltador pero creo que asi tambien estaria bien
		// Para cada saltador, queremos que se implemente el método equals, sabiendo que dos saltadores son iguales si tienen el mismo nombre, apellidos y nacionalidad.
		boolean indicador=false;
		if(this.resumirInformacion().equalsIgnoreCase(saltador.resumirInformacion()))
			indicador=true;
		return indicador;
	}
	
/** Manuel
 * Este metodo nos permite unir en una cadena toda la informacion que necesitamos para el metodo #Equals
 * @return una cadena con toda la informacion
 */
	private String resumirInformacion(){
		String informacionResumida;
		informacionResumida=this.nombre + this.apellidos + this.nacionalidad;
		return informacionResumida;
	}
	
	public void cambiarEntrenador(Saltador saltador) {
	// También queremos implementar el método que permita a un saltador, intercambiar su entrenador con el de otro saltador.
		Entrenador entrenadorDelOtro;
		entrenadorDelOtro=saltador.getEntrenador(); // cuidado con el orden, ya que si nos equivocamos el entrenador en las dos instancias seria el mismo
		saltador.setEntrenador(this.entrenador);
		this.entrenador=entrenadorDelOtro;
		
	}
	

	public  String mostrarArraySaltos() {
	String informacion = "";
	String valido;
		for (int i = 0; i < saltos.length; i++) {
			valido = (saltos[i].isValido()) ? "valido,": "invalido,";
			informacion+= "Salto "+(i+1)+": "+ "es "+ valido +" votacion: "+ saltos[i].getPuntuacion()+"\n";
		}
		
		return informacion;
	};
	
	
	
	@Override
	public String toString() {
		StringBuilder informacion = new StringBuilder();
		informacion.append("CAMPEON DE LA COMPETICION");
		informacion.append("\nNombre completo: "+ nombre+ " " + apellidos);
		informacion.append("\nNº colegiado:"+" " +entrenador.getNUMERO_COLEGIADO()+"\n");
		informacion.append(mostrarArraySaltos());
		informacion.append("Puntuacion total:"+ Salto.calcularMedia(saltos));

		
		return informacion.toString();
	}
	
	
}
