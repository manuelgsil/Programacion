package personaCuenta;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private char sexo;
	private Cuenta cuentaCorriente;

	public Persona(String nombre, String apellidos, int edad, char sexo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona() { // constructor normal
		nombre = "elprobador";
		apellidos = "prismatico";
		cuentaCorriente = null;

	}

	public Cuenta getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(Cuenta cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String saludar() {
		String saludo = "Hola soy " + this.nombre + " " + this.apellidos + " y te saludo";
		return saludo;
	}

	public String toString() {
		return saludar();
	}

	public Cuenta crearCuentaCorriente(String iban, int numeroCuenta, double saldo, double interesMensual) {
		Cuenta cuentaUsuario = new Cuenta(iban, numeroCuenta, saldo, interesMensual);
		this.cuentaCorriente = cuentaUsuario;
		return cuentaUsuario;
	}

	public boolean sacarDinero(double dinero) {
		boolean indicador;
		if (cuentaCorriente == null) {
			System.out.println("No tiene cuenta corriente abierta en este banco xulo");
			indicador = false;
		} else {
			cuentaCorriente.retirar(dinero);
			indicador = true;
		}
		return indicador;
	}

	public boolean ingresar(double dinero) {
		boolean indicador;
		if (cuentaCorriente == null) {
			System.out.println("No tiene cuenta corriente abierta en este banco xulo");
			indicador = false;
		} else {
			cuentaCorriente.ingresar(dinero);
			indicador = true;
		}
		return indicador;
	}

	public boolean transferencia(Persona destino, double dinero) {
		boolean indicador;
		if (cuentaCorriente == null || destino.getCuentaCorriente() == null) {
			System.out.println("No tiene cuenta corriente abierta en este banco xulo");
			indicador = false;
		} else {
			cuentaCorriente.hacerTranseferencia(this.cuentaCorriente, destino.getCuentaCorriente(), dinero);
			System.out.println(destino.getCuentaCorriente().getSaldo());
			indicador = true;
		}
		return indicador;
	}

	public void cerrarCuenta() {
		this.cuentaCorriente = null;
	}
}
