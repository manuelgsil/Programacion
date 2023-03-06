package ejercicio6modelo;

import java.time.Year;


	/* 
	 * El m�dulo de los barcos de un tipo especial se obtiene como el m�dulo normal
	 * m�s: el n�mero de m�stiles para veleros, la potencia en CV para embarcaciones
	 * deportivas a motor, la potencia en CV, m�s el n�mero de camarotes para yates
	 * de lujo.
	 */
public abstract class Barco {
	
	protected String tipo;
	protected String matricula;
	protected int eslora;
	protected  Year anioFabricacion;

	
	public Barco() {
		setMatricula("soyunamatricula");
		eslora=5;
		anioFabricacion=Year.of(1993);
	}
	
	public  abstract int calcularModulo();

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
