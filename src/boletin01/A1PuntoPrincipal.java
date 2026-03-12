package boletin01;

public class A1PuntoPrincipal {

	public static void main(String[] args) {

		// Creación de los objetos
		A1Punto punto1 = new A1Punto();
		A1Punto punto2 = new A1Punto();
		A1Punto punto3 = new A1Punto();

		// Asignación de valores
		punto1.coordenadaX = 5;
		punto1.coordenadaY = 0;

		punto2.coordenadaX = 10;
		punto2.coordenadaY = 10;

		punto3.coordenadaX = -3;
		punto3.coordenadaY = 7;

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