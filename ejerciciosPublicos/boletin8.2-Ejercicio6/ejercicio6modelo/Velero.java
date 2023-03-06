package ejercicio6modelo;

public class Velero extends Barco {

	private int numMastiles;
	

	public Velero() {
		super();
		this.numMastiles=1;
		tipo="Velero";
	}


	public int getNumMastiles() {
		return numMastiles;
	}


	public void setNumMastiles(int numMastiles) {
		this.numMastiles = numMastiles;
	}




	@Override
	public int calcularModulo() {
		
		return (eslora*10)+numMastiles;
		// el número de mástiles para veleros, 
		
	}


	@Override
	public String toString() {
		return "Velero [numMastiles=" + numMastiles + ", tipo=" + tipo + ", matricula=" + matricula
				+ ", anioFabricacion=" + anioFabricacion + "]";
	}

	
}
