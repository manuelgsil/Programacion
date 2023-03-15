package modelo;

import ejercicio7Modelo.Util;

public class Salto {

	private int puntuacion;
	private boolean valido;

	public Salto() {
		this.puntuacion = Util.generarNumerosAleatorios(1, 10);
		this.valido = aleatorioPorcentual();
	}

	private boolean aleatorioPorcentual() {

		return Util.generadorRandom.nextInt(100) < 85; // Si el valor generado es menor de 85 devuelve true, si no,
														// false;
	}

	public Salto(int puntuacion, boolean validacion) {
		super();
		this.puntuacion = puntuacion;
		this.valido = validacion;
	}

	public static double calcularMedia(Salto[] arraySaltos) {
		// TODO algo hay mal por aqui o en las funciones de peor/mayorPuntuacion
		double media = 0;
		int peorPuntuacion = peorPuntuacionValida(arraySaltos);
		int mayorPuntuacion = mayorPuntuacionValida(arraySaltos);
		int saltosValidos = 0;

		for (int i = 0; i < arraySaltos.length; i++) {
			if (arraySaltos[i].isValido() && arraySaltos[i].getPuntuacion() > peorPuntuacion
					|| arraySaltos[i].isValido() && arraySaltos[i].getPuntuacion() < mayorPuntuacion) {
				media += arraySaltos[i].getPuntuacion();
				saltosValidos++;
			}

		}
		media = (saltosValidos != 0) ? (media / saltosValidos) : 0;
		return media;

	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public boolean isValido() {
		return valido;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public void setValidacion(boolean validacion) {
		this.valido = validacion;
	}

	public static int peorPuntuacionValida(Salto[] arraySaltos) {
		int peorPuntuacion = 10; // empezamos esta variable con el mayor valor posible
		boolean valorMinimo = false; // Con esta variable podemos parar las iteraciones al encontrar la menor nota

		for (int i = 0; i < arraySaltos.length && !valorMinimo; i++) {
			if (arraySaltos[i].isValido() && arraySaltos[i].getPuntuacion() == 1) {
				valorMinimo = true;
				peorPuntuacion = arraySaltos[i].getPuntuacion();
			}
			else if (arraySaltos[i].getPuntuacion() < peorPuntuacion)
				peorPuntuacion = arraySaltos[i].getPuntuacion();
		}


		return peorPuntuacion;
	}

	public static int mayorPuntuacionValida(Salto[] arraySaltos) {
		int mayorPuntuacion = 0;
		boolean valorMaximo = false;

		for (int i = 0; i < arraySaltos.length && !valorMaximo; i++) {
			if (arraySaltos[i].isValido() && arraySaltos[i].getPuntuacion() == 10) {
				mayorPuntuacion = 10;
				valorMaximo = true;
			} else if (arraySaltos[i].isValido() && arraySaltos[i].getPuntuacion() > mayorPuntuacion) {
				mayorPuntuacion = arraySaltos[i].getPuntuacion();
			}
		}

		return mayorPuntuacion;

	}

}