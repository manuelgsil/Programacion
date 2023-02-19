package ejercicio3;

public class Circulo implements IFiguras {

	private double radio;
	private String tipoFigura;

	public Circulo() {
		radio=3;
		tipoFigura="Circulo";
	}

	@Override
	public double getArea() {
		
		return PI * Math.pow(radio, 2);
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return tipoFigura;
	}
	
	
	
	
}
