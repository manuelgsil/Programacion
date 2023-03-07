package ejercicio7Modelo;

/*
 * De los productos nos interesa saber su identificador (cada uno tiene uno distinto), cantidad de litros, precio base, precio
final (precio base+IVA) y marca.*/
public abstract class Bebida {
	protected static int[] identificadores = new int[50];
	protected static int cantidadIdentificadores=0;
	protected final double IVA = 1.10;
	protected double cantidadLitros;
	protected int identificador;
	protected double precioBase;
	protected double precioFinal = precioBase * IVA;
	protected String marca;
	private double[] informacionBebida = new double[2];

	public Bebida(double[] informacionBebida,  String marca) {
		super();
		this.identificador = generarIdentificadores();
		this.cantidadLitros = informacionBebida[0];
		this.precioBase = informacionBebida[1];
		this.marca = marca;

		
	}

	public Bebida() {
		this.identificador = 0;
		this.cantidadLitros = 0;
		this.precioBase = 0;
		this.marca = "vacio";
		
	}

	public double getIdentificador() {
		return identificador;
	}

	public double getCantidadLitros() {
		return cantidadLitros;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public String getMarca() {
		return marca;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setCantidadLitros(double cantidadLitros) {
		this.cantidadLitros = cantidadLitros;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double[] getInformacionBebida() {
		return informacionBebida;
	}

	public void setInformacionBebida(double[] informacionBebida) {
		this.informacionBebida = informacionBebida;
	}

	public int generarIdentificadores() {
		int idAleatorio;
		
		do {
		idAleatorio=Util.generarNumerosAleatorios(1,50);
			}
		while(!comprobarListaId(idAleatorio));
			
		identificadores[cantidadIdentificadores]=idAleatorio;
		
		cantidadIdentificadores++;
		return idAleatorio;
	}

	public boolean comprobarListaId(int id) {
		boolean bandera = true;

		for (int i = 0; i < identificadores.length; i++) {
			if (identificadores[i] == id)
			bandera = false;
		}
		return bandera;
	}
	@Override
		public abstract String toString();
			

	}
