package ejercicio3;

public class Rectangulo implements IFiguras {

	private double lado;
	private double altura;
	private String tipoFigura;

	public Rectangulo() {
		lado=5;
		altura=5;
		tipoFigura= "Rectangulo";
	}

	@Override
	public double getArea() {
		
		return lado * altura;
	}


	@Override
	public String getTipo() {
	
		return tipoFigura;
	}
}
