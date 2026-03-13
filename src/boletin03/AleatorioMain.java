package boletin03;

public class AleatorioMain {

	public static void main(String[] args) {

		Aleatorio gen = new Aleatorio();

		// Prueba 1: 3 números entre 0 y 1
		System.out.println("--- PRUEBA 1 ---");
		gen.numerosAleatorios(3);

		// Prueba 2: 4 números entre 0 y 50
		System.out.println("\n--- PRUEBA 2 ---");
		gen.numerosAleatorios(4, 50);

		// Prueba 3: 5 números entre 100 y 200
		System.out.println("\n--- PRUEBA 3 ---");
		gen.numerosAleatorios(5, 100, 200);
	}

}
