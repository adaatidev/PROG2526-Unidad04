package boletin01;

public class C4Articulo {

	/*
	 * -----------------------------------------------------------------------------
	 * Aplica el encapsulamiento básico a la clase Articulo: Declara todos sus
	 * atributos como private y crea todos los getters y setters necesarios (un get
	 * y un set por atributo). Programa los setters para que comprueben los valores
	 * y los guarden en el objeto solo si son correctos. Corrige el main para
	 * utilizar los getters y setters. Prueba a instanciar varios objetos, mostrar
	 * sus valores, modificarlos, etc. Prueba varios valores erróneos para comprobar
	 * si funciona.
	 * -----------------------------------------------------------------------------
	 */

	C4Articulo(String nombre, double precio, int iva, int cuantosQuedan) {

		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.cuantosQuedan = cuantosQuedan;

	}

	// GETTERS

	private String nombre = "Tomodachi Life";

	public String getNombre() {
		return nombre;
	}

	private double precio = 10;

	public double getPrecio() {
		return precio;
	}

	private int iva = 21;

	public int getIva() {
		return iva;
	}

	private int cuantosQuedan = 2;

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	// SETTERS

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

}