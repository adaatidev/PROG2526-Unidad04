package boletin01;

public class B3Rectangulo {

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

	// Variables para los atributos
	int x1;
	int y1;

	int x2;
	int y2;

	B3Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

}