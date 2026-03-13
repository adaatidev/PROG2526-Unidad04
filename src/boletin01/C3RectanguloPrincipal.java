package boletin01;

public class C3RectanguloPrincipal {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Aplica el encapsulamiento básico a la clase Rectángulo: Declara todos sus
		 * atributos como private y crea todos los getters y setters necesarios (un get
		 * y un set por atributo). Los setters deben comprobar que el valor pasado como
		 * argumento es válido antes de guardarlo. Corrige el main para utilizar los
		 * getters y setters. Prueba a instanciar varios objetos, mostrar sus valores,
		 * modificarlos, etc. Prueba varios valores erróneos para comprobar si funciona.
		 * -----------------------------------------------------------------------------
		 */

		// Creación de los objetos
		C3Rectangulo rectangulo1 = new C3Rectangulo(0, 0, 5, 5);
		C3Rectangulo rectangulo2 = new C3Rectangulo(7, 9, 2, 3);

		// Creación de un array para almacenar las coordenadas del primer rectángulo
		int[] arrayr1 = new int[2];

		// Creación de un array para almacenar las coordenadas del segundo rectángulo
		int[] arrayr2 = new int[2];

		// Cálculos para obtener perímetros y áreas
		arrayr1[0] = rectangulo1.getX1() > rectangulo1.getX2() ? rectangulo1.getX1() - rectangulo1.getX2()
				: rectangulo1.getX2() - rectangulo1.getX1();
		arrayr1[1] = rectangulo2.getY1() > rectangulo2.getY2() ? rectangulo2.getY1() - rectangulo2.getY2()
				: rectangulo2.getY2() - rectangulo2.getY1();

		arrayr2[0] = rectangulo1.getX1() > rectangulo1.getX2() ? rectangulo1.getX1() - rectangulo1.getX2()
				: rectangulo1.getX2() - rectangulo1.getX1();
		arrayr2[1] = rectangulo2.getY1() > rectangulo2.getY2() ? rectangulo2.getY1() - rectangulo2.getY2()
				: rectangulo2.getY2() - rectangulo2.getY1();

		// Se imprimen los datos de ambos rectángulos
		System.out.println("PRIMER RECTÁNGULO");
		System.out.println("Coordenadas: (" + rectangulo1.getX1() + "," + rectangulo1.getY1() + ") ("
				+ rectangulo1.getX2() + "," + rectangulo1.getY1() + ")");
		System.out.println("Perímetro: " + (arrayr1[0] * 2 + arrayr1[1] * 2));
		System.out.println("Área: " + (arrayr1[0] * arrayr1[1]));

		System.out.println();

		System.out.println("SEGUNDO RECTÁNGULO");
		System.out.println("Coordenadas: (" + rectangulo2.getX1() + "," + rectangulo2.getY1() + ") ("
				+ rectangulo2.getX2() + "," + rectangulo2.getY1() + ")");
		System.out.println("Perímetro: " + (arrayr2[0] * 2 + arrayr2[1] * 2));
		System.out.println("Área: " + (arrayr2[0] * arrayr2[1]));
	}

}