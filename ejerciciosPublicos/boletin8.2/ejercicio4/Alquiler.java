package ejercicio4;

public class Alquiler {
	private Cliente cliente;
	private Pelicula pelicula;

	public Alquiler(Cliente cliente, Pelicula pelicula) {
		this.cliente=cliente;
		this.pelicula=pelicula;
			
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	
}
