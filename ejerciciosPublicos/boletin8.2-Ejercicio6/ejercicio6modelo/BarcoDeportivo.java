package ejercicio6modelo;

public class BarcoDeportivo extends Barco {
	protected int potenciaCv;
	
	
	public BarcoDeportivo() {
		super();
		potenciaCv=1000;
		tipo="deportivo";
	}


	@Override
	public int calcularModulo() {
		
		return  (eslora*10)+potenciaCv; 
		
		
	}


	@Override
	public String toString() {
		return "BarcoDeportivo [potenciaCv=" + potenciaCv + ", tipo=" + tipo + "]";
	}

}
