package ejercicio4;

public class Main {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula();
		Cliente cliente = new Cliente();
		Alquiler alquiler = new Alquiler(cliente, pelicula);

	System.out.println(alquiler.getCliente().getNombre());
	
	}

}
