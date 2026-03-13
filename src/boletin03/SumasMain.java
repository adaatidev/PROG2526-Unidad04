package boletin03;

public class SumasMain {

	public static void main(String[] args) {

		Sumas calc = new Sumas();

		int resultadoInt = calc.suma(10, 5);
		double resultadoDouble = calc.suma(10.5, 5.3);

		System.out.println("--- Prueba de Suma Entera ---");
		System.out.println("Resultado (int): 10 + 5 = " + resultadoInt);

		System.out.println("\n--- Prueba de Suma Double ---");
		System.out.println("Resultado (double): 10.5 + 5.3 = " + resultadoDouble);

	}

}
