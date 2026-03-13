package boletin01;

public class D1PuntoPrincipal {

	public static void main(String[] args) {

		// CONSTRUCTORES
		D1Punto punto1 = new D1Punto(5, 0);
		D1Punto punto2 = new D1Punto(10, 10);
		D1Punto punto3 = new D1Punto(-3, 7);

		// IMPRIME LOS PUNTOS
		System.out.println("(" + punto1.getCoordenadaX() + "," + punto1.getCoordenadaY() + ")");
		System.out.println("(" + punto2.getCoordenadaX() + "," + punto2.getCoordenadaY() + ")");
		System.out.println("(" + punto3.getCoordenadaX() + "," + punto3.getCoordenadaY() + ")");

		// MÉTODO DESPLAZA
		punto1.desplaza(punto1.getCoordenadaX(), punto1.getCoordenadaY());
		punto2.desplaza(punto2.getCoordenadaX(), punto2.getCoordenadaY());
		punto3.desplaza(punto3.getCoordenadaX(), punto3.getCoordenadaY());

		// IMPRIME MÉTODO DESPLAZA
		System.out.println();
		System.out.println("(" + punto1.getCoordenadaX() + "," + punto1.getCoordenadaY() + ")");
		System.out.println("(" + punto2.getCoordenadaX() + "," + punto2.getCoordenadaY() + ")");
		System.out.println("(" + punto3.getCoordenadaX() + "," + punto3.getCoordenadaY() + ")");

		// MÉTODO DISTANCIA ENTRE PUNTOS
		System.out.println();
		System.out.println("Distancia entre punto 1 y punto 2: " + punto1.distancia(punto2));

		// MÉTODO TO STRING
		System.out.println();
		System.out.println(punto1.toString());
		System.out.println(punto2.toString());
		System.out.println(punto3.toString());

	}

}