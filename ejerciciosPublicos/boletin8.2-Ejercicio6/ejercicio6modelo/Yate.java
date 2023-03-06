package ejercicio6modelo;

public class Yate extends BarcoDeportivo{

	private int numeroCamarotes;
	
	
	
	public Yate() {
	super();
		numeroCamarotes=2;
		tipo="yate";
	}
	
@Override
public int calcularModulo() {
	
	return super.calcularModulo()+numeroCamarotes;
}

@Override
public String toString() {
	return "Yate [numeroCamarotes=" + numeroCamarotes + ", potenciaCv=" + potenciaCv + ", tipo=" + tipo + ", matricula="
			+ matricula + "]";
}

}
