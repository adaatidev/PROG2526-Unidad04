package boletin01;

public class C1Punto {

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

	C1Punto(int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	private int coordenadaX;

	public int getCoordenadaX() {
		return coordenadaX;
	}

	private int coordenadaY;

	public int getCoordenadaY() {
		return coordenadaY;

	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

}