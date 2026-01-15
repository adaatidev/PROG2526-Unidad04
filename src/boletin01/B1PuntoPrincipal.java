package boletin01;

public class B1PuntoPrincipal {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Añade a la clase Punto un constructor con parámetros que copie las
		 * coordenadas pasadas como argumento a los atributos del objeto. Corrige el
		 * main y utiliza el constructor con parámetros para instanciar los objetos,
		 * pasándole como argumento los valores deseados
		 * -----------------------------------------------------------------------------
		 */

		// Creación de los objetos y asignación de valores gracias al constructor
		B1Punto punto1 = new B1Punto(5, 0);
		B1Punto punto2 = new B1Punto(10, 10);
		B1Punto punto3 = new B1Punto(-3, 7);

		// Se imprimen las coordenadas
		System.out.println("(" + punto1.coordenadaX + "," + punto1.coordenadaY + ")");
		System.out.println("(" + punto2.coordenadaX + "," + punto2.coordenadaY + ")");
		System.out.println("(" + punto3.coordenadaX + "," + punto3.coordenadaY + ")");

		// Modificación de las coordenadas
		punto1.coordenadaX += 8;
		punto1.coordenadaY += 8;

		punto2.coordenadaX -= 8;
		punto2.coordenadaY -= 8;

		punto3.coordenadaX *= 8;
		punto3.coordenadaY *= 8;

		// Se vuelven a imprimir las coordenadas
		System.out.println();
		System.out.println("(" + punto1.coordenadaX + "," + punto1.coordenadaY + ")");
		System.out.println("(" + punto2.coordenadaX + "," + punto2.coordenadaY + ")");
		System.out.println("(" + punto3.coordenadaX + "," + punto3.coordenadaY + ")");

	}

}