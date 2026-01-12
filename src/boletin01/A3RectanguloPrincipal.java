package boletin01;

import java.util.Arrays;

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

		A3Rectangulo punto1 = new A3Rectangulo();
		A3Rectangulo punto2 = new A3Rectangulo();

		int[] array = new int[8];

		array[0] = 0;
		array[1] = 0;
		array[2] = 5;
		array[3] = 5;
		array[4] = 7;
		array[5] = 9;
		array[6] = 2;
		array[7] = 3;

		System.out.println(Arrays.toString(array));
	}

}