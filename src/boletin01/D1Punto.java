package boletin01;

public class D1Punto {

	// CONSTRUCTOR

	D1Punto(int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	// GETTERS

	private int coordenadaX;

	public int getCoordenadaX() {
		return coordenadaX;
	}

	private int coordenadaY;

	public int getCoordenadaY() {
		return coordenadaY;

	}

	private int px = 2;

	public int getPx() {
		return px;
	}

	private int py = 2;

	public int getPy() {
		return py;
	}

	// SETTERS
	public void setXY(int x, int y) {
		this.coordenadaX = x;
		this.coordenadaY = y;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public void setPy(int py) {
		this.px = py;
	}

	// MÉTODO DESPLAZA
	public void desplaza(int dx, int dy) {
		this.coordenadaX = dx + 2;
		this.coordenadaY = dy + 5;
	}

	// MÉTODO DISTANCIA
	public double distancia(D1Punto p) {

		double distanciaEntrePuntos;

		distanciaEntrePuntos = Math.sqrt((p.coordenadaX - coordenadaX) ^ 2 + (p.coordenadaY - coordenadaY) ^ 2);

		return distanciaEntrePuntos;
	}

	// MÉTODO TO STRING
	public String toString() {

		String cadena = "";

		cadena = "(" + coordenadaX + ", " + coordenadaY + ")";

		return cadena;

	}

}