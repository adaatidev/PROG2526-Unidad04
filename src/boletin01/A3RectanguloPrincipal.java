package boletin01;

public class A3RectanguloPrincipal {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa con una clase llamada Rectangulo que representará un
		 * rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que
		 * la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2. En el main de
		 * la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3).
		 * Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas
		 * (ancho x alto). Modifica todas las coordenadas como consideres y vuelve a
		 * imprimir coordenadas, perímetros y áreas
		 * -----------------------------------------------------------------------------
		 */

		// Creación de los objetos
		A3Rectangulo rectangulo1 = new A3Rectangulo();
		A3Rectangulo rectangulo2 = new A3Rectangulo();

		// Creación de un array para almacenar las coordenadas del primer rectángulo
		int[] arrayr1 = new int[2];

		// Creación de un array para almacenar las coordenadas del segundo rectángulo
		int[] arrayr2 = new int[2];

		// Asignación de valores
		rectangulo1.x1 = 0;
		rectangulo1.y1 = 0;
		rectangulo1.x2 = 5;
		rectangulo1.y2 = 5;

		rectangulo2.x1 = 7;
		rectangulo2.y1 = 9;
		rectangulo2.x2 = 2;
		rectangulo2.y2 = 3;

		// Cálculos para obtener perímetros y áreas
		arrayr1[0] = rectangulo1.x1 > rectangulo1.x2 ? rectangulo1.x1 - rectangulo1.x2
				: rectangulo1.x2 - rectangulo1.x1;
		arrayr1[1] = rectangulo1.y1 > rectangulo1.x2 ? rectangulo1.y1 - rectangulo1.y2
				: rectangulo1.y2 - rectangulo1.y1;

		arrayr2[0] = rectangulo2.x1 > rectangulo2.x2 ? rectangulo2.x1 - rectangulo2.x2
				: rectangulo2.x2 - rectangulo2.x1;
		arrayr2[1] = rectangulo2.y1 > rectangulo2.y2 ? rectangulo2.y1 - rectangulo2.y2
				: rectangulo2.y2 - rectangulo2.y1;

		// Se imprimen los datos de ambos rectángulos
		System.out.println("PRIMER RECTÁNGULO");
		System.out.println("Coordenadas: (" + rectangulo1.x1 + "," + rectangulo1.y1 + ") (" + rectangulo1.x2 + ","
				+ rectangulo1.y2 + ")");
		System.out.println("Perímetro: " + (arrayr1[0] * 2 + arrayr1[1] * 2));
		System.out.println("Área: " + (arrayr1[0] * arrayr1[1]));

		System.out.println();

		System.out.println("SEGUNDO RECTÁNGULO");
		System.out.println("Coordenadas: (" + rectangulo2.x1 + "," + rectangulo2.y1 + ") (" + rectangulo2.x2 + ","
				+ rectangulo2.y2 + ")");
		System.out.println("Perímetro: " + (arrayr2[0] * 2 + arrayr2[1] * 2));
		System.out.println("Área: " + (arrayr2[0] * arrayr2[1]));
	}

}