package boletin01;

public class C1PuntoPrincipal {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Modifica los atributos de Punto para que sean private. Fíjate que desde el
		 * main ya no te dejará utilizar ni modificar los atributos x e y de los
		 * objetos. Añade los getters getX() e getY() a la clase Punto. Añade también
		 * los setters setX(int x) y setY(int y). Tanto getters como setters deben ser
		 * public. Corrige el main para utilizar los getters y setters. Prueba a
		 * instanciar varios objetos, mostrar sus valores por pantalla, modificarlos,
		 * etc
		 * -----------------------------------------------------------------------------
		 */

		C1Punto punto1 = new C1Punto(5, 0);
		C1Punto punto2 = new C1Punto(10, 10);
		C1Punto punto3 = new C1Punto(-3, 7);

		System.out.println("(" + punto1.getCoordenadaX() + "," + punto1.getCoordenadaY() + ")");
		System.out.println("(" + punto2.getCoordenadaX() + "," + punto2.getCoordenadaY() + ")");
		System.out.println("(" + punto3.getCoordenadaX() + "," + punto3.getCoordenadaY() + ")");

		punto1.setCoordenadaX(punto1.getCoordenadaX() + 8);
		punto1.setCoordenadaY(punto1.getCoordenadaY() + 8);

		punto2.setCoordenadaX(punto2.getCoordenadaX() - 8);
		punto2.setCoordenadaY(punto2.getCoordenadaY() - 8);

		punto3.setCoordenadaX(punto3.getCoordenadaX() * 8);
		punto3.setCoordenadaY(punto3.getCoordenadaY() * 8);

		System.out.println();
		System.out.println("(" + punto1.getCoordenadaX() + "," + punto1.getCoordenadaY() + ")");
		System.out.println("(" + punto2.getCoordenadaX() + "," + punto2.getCoordenadaY() + ")");
		System.out.println("(" + punto3.getCoordenadaX() + "," + punto3.getCoordenadaY() + ")");

	}

}
