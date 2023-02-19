package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		 Circulo circulo = new Circulo();
		 Rectangulo rectangulo = new Rectangulo ();
		 
		IFiguras[] arrayFiguras = {circulo,rectangulo};
		double areaMayor = 0; //declaro una varaible que almacene la info
		String figura = null;
		 for (IFiguras iFiguras : arrayFiguras) {
			if(iFiguras.getArea()>areaMayor) 
											{ // Si el area resultante es mayor que el contenidod e la variable
				areaMayor=iFiguras.getArea(); 
				figura=iFiguras.getTipo();								// se almacena
			}
			}
		 System.out.println(figura+" : "+ areaMayor); // Cuando termino el bucle muestro esa area
	}

}
