package ejercicio4;



public class Producto {

	private String tipoProducto;
	private String nombreProducto;
	private String  identificadorProducto;
	private double precio;

	public Producto() {
	super();
	tipoProducto="pelicula";
	nombreProducto="tadeo jones";
	identificadorProducto="codigo";
	precio=2;
			
	}
	
	

	public Producto(String tipoProducto, String nombreProducto, String identificadorProducto) {
		this.tipoProducto = tipoProducto;
		this.nombreProducto = nombreProducto;
		this.identificadorProducto = identificadorProducto;
	}


	public String getTipoProducto() {
		return tipoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public String getIdentificadorProducto() {
		return identificadorProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public void setIdentificadorProducto(String identificadorProducto) {
		this.identificadorProducto = identificadorProducto;
	}
}
