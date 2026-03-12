package boletin01;

public class B3RectanguloPrincipal {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * En nuestro software necesitamos asegurarnos de que la coordenada (x1,y1)
		 * represente la esquina inferior izquierda y la (x2,y2) la superior derecha del
		 * rectángulo, como en el dibujo. Añade a Rectangulo un constructor con los 4
		 * parámetros. Incluye un if que compruebe los valores. Si son válidos guardará
		 * los parámetros en el objeto. En caso contrario, los atributos se quedarán con
		 * los valores por defecto. Corrige el main para utilizar dicho constructor
		 * -----------------------------------------------------------------------------
		 */

		// Creación de los objetos
		B3Rectangulo rectangulo1 = new B3Rectangulo(0, 0, 5, 5);
		B3Rectangulo rectangulo2 = new B3Rectangulo(7, 9, 2, 3);

		// Creación de un array para almacenar las coordenadas del primer rectángulo
		int[] arrayr1 = new int[2];

		// Creación de un array para almacenar las coordenadas del segundo rectángulo
		int[] arrayr2 = new int[2];

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