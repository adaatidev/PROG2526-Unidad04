package boletin04;

public class FraccionMain {

	public static void main(String[] args) {
		Fraccion f1 = new Fraccion(1, 4);
		Fraccion f2 = new Fraccion(1, 2);

		System.out.println("Fracción 1: " + f1);
		System.out.println("Fracción 2: " + f2);

		// Suma
		Fraccion suma = f1.suma(f2);
		System.out.println("Suma (1/4 + 1/2): " + suma); // 3/4

		// Resta
		Fraccion resta = f1.resta(f2);
		System.out.println("Resta (1/4 - 1/2): " + resta); // -1/4

		// Multiplicación
		Fraccion multi = f1.multiplica(f2);
		System.out.println("Multiplicación (1/4 * 1/2): " + multi); // 1/8

		// División
		Fraccion divi = f1.divide(f2);
		System.out.println("División (1/4 / 1/2): " + divi); // 1/2 (tras simplificar 2/4)

		// Simplificación manual
		Fraccion f3 = new Fraccion(10, 20);
		System.out.println("\nFracción sin simplificar: 10/20");
		f3.simplifica();
		System.out.println("Fracción tras simplifica(): " + f3);

	}

}
