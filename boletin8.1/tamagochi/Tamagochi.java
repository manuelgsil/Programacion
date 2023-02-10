package tamagochi;


import java.util.Random;

public class Tamagochi {

	private String nombre;
	private int energia;
	private boolean estaHambriento;
	private int nivelFelicidad;
	// PUBLIC FINAL STATIC INT valor_minimo (mayus) como alarma de estado.
	public Tamagochi(String nombre) {
		this.nombre = nombre;
		energia = numeroAleatorio();
		nivelFelicidad = numeroAleatorio();
		estaHambriento = booleanAleatorio();

	}

	/**
	 * boolean aleatorio
	 * 
	 * @return
	 */
	public boolean booleanAleatorio() {
		Random booleanoAleatorio = new Random();
		return booleanoAleatorio.nextBoolean();

	}

	/**
	 * Crea y devuelve un numero aleatorio entre 1 y 10
	 *
	 * @return num_aleatorio
	 */
	public int numeroAleatorio() {
		Random aleatorio = new Random();
		return aleatorio.nextInt(0, 10) + 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public boolean isEstaHambriento() {
		return estaHambriento;
	}

	public void setEstaHambriento(boolean estaHambriento) {
		this.estaHambriento = estaHambriento;
	}

	public int getNivelFelicidad() {
		return nivelFelicidad;
	}

	public void setnivelFelicidad(int nivelFelicidad) {
		this.nivelFelicidad = nivelFelicidad;
	}

	public void comer() {
		if (this.estaHambriento)
			estaHambriento = false;
		else {
			nivelFelicidad -= 1; // se le resta felciidad cosa que no entiedno vamos
		}

	}

	public void dormir(int horasDurmiendo) {
		for (int i = 0; i < horasDurmiendo; i++) {
			controladorEmociones(energia++); // los bucles for sobran, podia hacerlo mas eficiente con una suma
			if (energia == 10)// y usar este mismo if
				controladorEmociones(nivelFelicidad--);
		}
	}

	public void jugar(int horasJugando) {
		if (!estaHambriento) {
			for (int i = 0; i < horasJugando; i++) {
				controladorEmociones(nivelFelicidad++);
				controladorEmociones(energia--);
			}
			estaHambriento = true;
		} else {
			for (int i = 0; i < horasJugando; i++) {
				controladorEmociones(nivelFelicidad--);
				controladorEmociones(energia--);

			}

		}
	}

	public String getNecesidades() {
		String necesidades = "";

		if (nivelFelicidad < energia)
			necesidades = "Me gustaria jugar";
		else {
			necesidades = "Me gustaria dormir";
		}

		if (estaHambriento)
			necesidades += "\nY tengo hambre";
		else
			necesidades += "\nNo tengo hambre";

		return necesidades;

	}

	public String toString() {
		return getNecesidades();
	}

	public void controladorEmociones(int emocion) {
		if (energia >= 10)
			energia = 10;
		else if (energia <= 0)
			energia = 0;

		if (nivelFelicidad >= 10)
			nivelFelicidad = 10;
		else if (nivelFelicidad <= 0)
			nivelFelicidad = 0;

	}
}
