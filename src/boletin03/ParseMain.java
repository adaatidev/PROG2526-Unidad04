package boletin03;

public class ParseMain {

	public static void main(String[] args) {

		Parse conv = new Parse();

		int valor1 = 1;
		int valor2 = 0;
		String texto1 = "true";
		String texto2 = "false";

		System.out.println("--- Conversión de Enteros ---");
		System.out.println("El entero " + valor1 + " es: " + conv.parseToBoolean(valor1));
		System.out.println("El entero " + valor2 + " es: " + conv.parseToBoolean(valor2));

		System.out.println("\n--- Conversión de Cadenas ---");
		System.out.println("La cadena \"" + texto1 + "\" es: " + conv.parseToBoolean(texto1));
		System.out.println("La cadena \"" + texto2 + "\" es: " + conv.parseToBoolean(texto2));

	}

}
