package boletin01;

public class C3Rectangulo {

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

	// CONSTRUCTOR

	C3Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// GETTERS

	private int x1;

	public int getX1() {
		return x1;
	}

	private int y1;

	public int getY1() {
		return y1;
	}

	private int x2;

	public int getX2() {
		return x2;
	}

	private int y2;

	public int getY2() {
		return y2;
	}

	// SETTERS

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

}