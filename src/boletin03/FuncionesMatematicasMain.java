package boletin03;

public class FuncionesMatematicasMain {

	public static void main(String[] args) {

		int numSum = 5;
		System.out.println("--- Sumatorio Recursivo ---");
		System.out.println("Sumatorio de " + numSum + " es: " + FuncionesMatematicas.sumatorio(numSum));

		double base = 2.0;
		int exponente = 3;
		System.out.println("\n--- Potencia Recursiva ---");
		System.out.println(base + " elevado a " + exponente + " es: " + FuncionesMatematicas.potencia(base, exponente));

		int nFibo = 6;
		System.out.println("\n--- Serie de Fibonacci ---");
		System.out.println("El término " + nFibo + " de la serie es: " + FuncionesMatematicas.serieFibonacci(nFibo));

		System.out.print("Sucesión: ");
		for (int i = 0; i <= nFibo; i++) {
			System.out.print(FuncionesMatematicas.serieFibonacci(i) + " ");
		}

	}

}