package boletin03;

public class SumasDeEnterosMain {

	public static void main(String[] args) {

		SumasDeEnteros suma = new SumasDeEnteros();

		int n = 10;
		int inicio = 5;
		int fin = 10;

		int resultado1 = suma.sumaEnteros(n);
		System.out.println("--- Sumatorio desde 1 ---");
		System.out.println("La suma de 1 hasta " + n + " es: " + resultado1);

		int resultado2 = suma.sumaEnteros(inicio, fin);
		System.out.println("\n--- Suma entre dos números ---");
		System.out.println("La suma de los números entre " + inicio + " y " + fin + " es: " + resultado2);

	}

}
