package examen;

public class Principal {

	public static void main(String[] args) {

		Coche coche1 = new Coche();
		Coche coche2 = new Coche("111", "A", 5, 100, TipoDeCombustible.GASOLINA, 5);
		
		System.out.println(coche1);
		System.out.println(coche2);
		
		coche1.setModelo(Mercedacos);

	}

}
