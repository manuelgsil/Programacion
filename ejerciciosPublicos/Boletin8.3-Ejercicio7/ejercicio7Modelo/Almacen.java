package ejercicio7Modelo;

import java.util.Iterator;

/*
 * ● Calcular el precio de todas las bebidas: calcula el precio final de todos los
productos del almacén.

● Calcular el precio total de una marca de bebida: dada una marca, calcular el
precio total de esas bebidas.

● Calcular el precio total de una estantería: dada una estantería calcular el precio
total de sus bebidas.

● Agregar producto: agrega un producto en la primera posición libre del almacén, si
el identificador está repetido en alguno de las bebidas, no se agregará esa bebida.

● Eliminar un producto: dado un ID, eliminar el producto del almacén.

● Mostrar inventario: mostramos para cada bebida del almacén toda su información.

● Ampliar almacén:Esta funcionalidad no se va a implementar, en este caso, se
lanzará la excepción UnderConstruction, la cual se capturará en el main.*/

public class Almacen {

	private Bebida[][] bebida = new Bebida[5][6];

	public Almacen(Bebida[][] bebida) {
		super();
		
		
	}

	public double calcularPrecioBebidas(Almacen[][] almacen) {
		Bebida bebidaActual;
		double precioTotal = 0.0;
		double precioFinal;
		for (int i = 0; i < almacen.length; i++) {
			for (int j = 1; j < almacen[i].length; j++) {
				bebidaActual = almacen[i][j].Bebida;
				precioFinal = bebidaActual.getPrecioFinal();
				precioTotal += precioFinal;
			}
		}
		return precioTotal;
	}

	public double calcularSegunMarca(Almacen[][] almacen, String marca) {
		Bebida bebidaActual;
		double precioFinal = 0.0;
		double precioTotal = 0.0;

		for (int i = 0; i < almacen.length; i++) {
			for (int j = 1; j < almacen[i].length; j++) {
				bebidaActual = almacen[i][j].Bebida;
				if (bebidaActual.getMarca().equals(marca))
					precioFinal = bebidaActual.getPrecioFinal();
				precioTotal += precioFinal;
			}
		}

		return precioFinal;
	}

	public double calcularSegunEstanteria(Almacen[][] almacen, int estanteria) {

		Bebida bebidaActual;
		double precioFinal = 0.0;
		double precioTotal = 0.0;
		for (int i = estanteria - 1; i < almacen.length;) {
			for (int j = 1; j < almacen[i].length; j++) {
				bebidaActual = almacen[i][j].Bebida;
				precioFinal = bebidaActual.getPrecioFinal();
				precioTotal += precioFinal;
			}

		}
		return precioTotal;
	}

	public void eliminarProducto(Almacen[][] almacen, int id) {
		Bebida bebidaActual;

		for (int i = 0; i < almacen.length;) {
			for (int j = 1; j < almacen[i].length; j++) {
				bebidaActual = almacen[i][j].Bebida;
				if (bebidaActual.getIdentificador() == id)
					bebidaActual = null; // entiendo que esto es eliminar?

			}
		}
	}

	public String AmpliarAlmacen() {
		// lanzar excepcion
		return "aqui va una excepcion";
	}
}
