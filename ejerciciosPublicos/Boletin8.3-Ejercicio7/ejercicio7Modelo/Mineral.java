package ejercicio7Modelo;

public class Mineral extends Bebida {

	String origen;
	
	public Mineral(double[] informacionBebida, String marca,String origen) {
		super(informacionBebida, marca);
		this.origen=origen;
	}

	public Mineral() {
		super();
		this.cantidadLitros=0;
		this.identificador=0;
		this.marca=null;
		this.origen="vacio";
		
		
	}

	@Override
	public String toString() {
		return " Mineral, origen" +origen+  " CantidadLitros="
				+ cantidadLitros + ", identificador=" + identificador + ", precioFinal=" + precioFinal + ", marca="
				+ marca + "]";
		
	}
	public static Mineral generarMineral() {
       
		double cantidadLitros = Util.generadorRandom.nextDouble() * 10; // generamos un valor aleatorio entre 0 y 10
        double precioBase = Util.generadorRandom.nextDouble() * 5; // generamos un valor aleatorio entre 0 y 5
        String marca = "Marca " + Util.generadorRandom.nextInt(100); // generamos una marca aleatoria
        String origen = "Origen " + Util.generadorRandom.nextInt(100); // generamos un origen aleatorio
        double[] informacionBebida = {cantidadLitros, precioBase};
        return new Mineral(informacionBebida, marca, origen);
    }
	
}
