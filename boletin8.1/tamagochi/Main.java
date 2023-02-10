package tamagochi;

public class Main {

	public static void main(String[] args) {
		Tamagochi miTamagochi = new Tamagochi("eustaquio");
		System.out.println(miTamagochi);
		miTamagochi.dormir(3);
		System.out.println(miTamagochi.getEnergia());
		System.out.println(miTamagochi);
		miTamagochi.jugar(5);
		System.out.println(miTamagochi.getEnergia());
		System.out.println(miTamagochi);
		System.out.println(miTamagochi.getEnergia());
		System.out.println(miTamagochi.getNivelFelicidad());
		miTamagochi.jugar(5);
		System.out.println(miTamagochi.getNivelFelicidad());
	}

}
