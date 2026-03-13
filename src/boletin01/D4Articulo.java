package boletin01;

public class D4Articulo {

	D4Articulo(String nombre, double precio, int iva, int cuantosQuedan) {

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

	// MÉTODO

	public double getPVP(int iva, double precio) {

		double precioIva;

		precioIva = (precio * 21 / 100) + precio;

		return precioIva;

	}

	public double getPVPDescuento(int iva, double precio) {

		double precioDescuento;

		precioDescuento = (precio * 21 / 100) - precio;

		return precioDescuento;

	}

	public boolean vender(int cuantosQuedan) {

		boolean sePuedeVender = true;

		if (cuantosQuedan <= 0) {
			sePuedeVender = false;
		} else {
			cuantosQuedan--;
		}

		return sePuedeVender;

	}

	public int almacenar(int cuantosQuedan, int cantidad) {

		cantidad = 0;

		cuantosQuedan += cantidad;

		return cuantosQuedan;

	}

	public String toStrint() {

		String cadena = "";

		cadena = nombre + ", " + precio + ", " + iva + ", " + cuantosQuedan;

		return cadena;

	}

}