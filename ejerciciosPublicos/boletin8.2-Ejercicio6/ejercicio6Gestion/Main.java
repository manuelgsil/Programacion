package ejercicio6Gestion;

import java.time.LocalDateTime;
import java.time.Month;

import ejercicio6modelo.*;
import ejercicio6modelo.BarcoDeportivo;
import ejercicio6modelo.Velero;
import ejercicio6modelo.Yate;

public class Main {

	public static void main(String[] args) {


		Velero veleroprueba = new Velero();
		Yate yatePrueba = new Yate();
		BarcoDeportivo deportivoPrueba = new BarcoDeportivo();
		Cliente clientePrueba= new Cliente (yatePrueba);
		Alquiler alquilerPrueba = new Alquiler(clientePrueba, LocalDateTime.now(), LocalDateTime.of(2023, Month.FEBRUARY, 27, 14, 15));
		System.out.println(alquilerPrueba);

	}

}
