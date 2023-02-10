package personaCuenta;

import java.util.Scanner;

public class Cuenta {

	public static Scanner sc = new Scanner(System.in);

	private String iban;
	private int numeroCuenta;
	private double saldo;
	private boolean descubierta;
	private double interesMensual;

	public Cuenta() {
		this.iban = "holaSoyelIBan";
		this.numeroCuenta = 123;
		this.saldo = 200;
		this.interesMensual = 10;
		this.descubierta = establecerDescubierto(saldo);
	}

	public Cuenta(String iban, int numeroCuenta, double saldo, double interesMensual) {
		this.iban = iban;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.descubierta = establecerDescubierto(saldo);
		this.interesMensual = interesMensual;
	}

	public String getIban() {
		return iban;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isDescubierta() {
		return descubierta;
	}

	public double getInteresMensual() {
		return interesMensual;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setDescubierta(boolean descubierta) {
		this.descubierta = descubierta;
	}

	public void setInteresMensual(double interesMensual) {
		this.interesMensual = interesMensual;
	}

	public boolean getDescubierta() {
		return this.descubierta;
	}

	public Boolean establecerDescubierto(double saldo) {
		if (saldo <= 0)
			this.descubierta = true;
		else
			this.descubierta = false;

		return this.descubierta;

	}

	public void ingresar(double dinero) {

		while (dinero <= 0) {
			System.out.println("Revise el dato introducido: ");
			dinero = sc.nextDouble();
		}

		this.saldo += dinero;
		establecerDescubierto(saldo);
		mostrarSaldo();
	}

	public Boolean retirar(double dinero_a_retirar) {
		Boolean indicador = true;

		if (!descubierta)
			saldo -= dinero_a_retirar;
		else
			indicador = false;

		establecerDescubierto(saldo);
		mostrarSaldo();
		return indicador;

	}

	public Boolean hacerTranseferencia(Cuenta numeroCuentaOrigen, Cuenta numeroCuentaDestino,
			double cantidad_a_ingresar) {
		boolean indicador = false;

		// Mientras la cuenta que quiere realizar la transferencia no tenga un
		// descubierto esta puede ser realizada
		if (!numeroCuentaOrigen.descubierta) {
			numeroCuentaOrigen.saldo -= cantidad_a_ingresar;
			numeroCuentaDestino.saldo += cantidad_a_ingresar;
			numeroCuentaOrigen.mostrarSaldo();
			indicador = true;
		}
		else {
			System.out.println("La transferencia no ha podido realizarse. No dispone de fondos");
			numeroCuentaOrigen.mostrarSaldo();
		}

		return indicador;

	}

	public double beneficiosFuturos(int numMeses) {
		double interesesNetos;
		if (!establecerDescubierto(saldo)) // Si es false, es decir, no esta al descubierto
			interesesNetos = saldo + (saldo * interesMensual * numMeses / 100);

		else
			interesesNetos = 0;

		mostrarSaldo();
		return interesesNetos;

	}

	public void mostrarSaldo() {
		System.out.println("Su saldo actual es de :" + saldo);
	}

	/*
	 * 
	 * 
	 * Los m�todos de ingresar, retirar, hacerTransferenciaA y beneficiosFuturos
	 * deben de imprimir un mensaje diciendo el saldo final de la cuenta despu�s de
	 * realizar la operaci�n.
	 * 
	 * Nuestra clase Cuenta permite dejar la cuenta muy muy descubierta :P
	 */

}
