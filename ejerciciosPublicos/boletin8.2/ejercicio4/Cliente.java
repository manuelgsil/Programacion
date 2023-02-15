package ejercicio4;



public class Cliente extends Persona {

	private int Id_cliente;

	public Cliente() {
		super();
		Id_cliente = 3;

	}


	public int getId_cliente() {
		return Id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		Id_cliente = id_cliente;
	}

}
