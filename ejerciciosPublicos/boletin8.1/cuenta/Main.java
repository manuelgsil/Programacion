package cuenta;

public class Main {

	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta();
		Cuenta miCuenta2=new Cuenta("iban2",1234,0,1);
		
		System.out.println(miCuenta.hacerTranseferencia(miCuenta2, miCuenta, 100));
	}

}
