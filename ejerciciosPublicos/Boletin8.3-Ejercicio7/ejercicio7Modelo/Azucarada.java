package ejercicio7Modelo;

public class Azucarada extends Bebida {

	private int porcentajeAzucar;
	private boolean oferta;
	
	
	
	
	
	public Azucarada(double[] informacionBebida, String marca, boolean oferta, int porcentajeAzucar) {
		super(informacionBebida, marca);
		this.oferta = oferta;
		this.precioFinal = (oferta) ? precioFinal * 0.90 : precioFinal; // si hay oferta se hace una operacion por la cual se le descuenta un 10 por ciento

	}
	
	
	
	public int getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public boolean isOferta() {
		return oferta;
	}



	public void setPorcentajeAzucar(int porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public void setOferta(boolean oferta) {
		this.oferta = oferta;
	}



	@Override
	public String toString() {
		return "Azucarada [porcentajeAzucar=" + porcentajeAzucar + ", oferta=" + oferta + ", cantidadLitros="
				+ cantidadLitros + ", identificador=" + identificador + ", precioFinal=" + precioFinal + ", marca="
				+ marca + "]";
	}
	
	public static Azucarada generarAzucarada() {
        double cantidadLitros = Util.generadorRandom.nextDouble() * 10; // generamos un valor aleatorio entre 0 y 10
        double precioBase = Util.generadorRandom.nextDouble() * 5; // generamos un valor aleatorio entre 0 y 5
        String marca = "Marca " + Util.generadorRandom.nextInt(100); // generamos una marca aleatoria
        boolean oferta = Util.generadorRandom.nextBoolean(); // generamos un valor booleano aleatorio
        int porcentajeAzucar = Util.generadorRandom.nextInt(100); // generamos un porcentaje de azúcar aleatorio entre 0 y 100
        double[] informacionBebida = {cantidadLitros, precioBase};
        return new Azucarada(informacionBebida, marca, oferta, porcentajeAzucar);
    }



}
