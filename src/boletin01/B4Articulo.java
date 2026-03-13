package boletin01;

public class B4Articulo {

	/*
	 * -----------------------------------------------------------------------------
	 * Añade un constructor con 4 parámetros que asigne valores a nombre, precio,
	 * iva y cuantosQuedan. Dicho constructor deberá comprobar que los datos
	 * introducidos son válidos, modificando el valor del atributo cuando el valor
	 * de entrada sea válido y dejándolo con el valor por defecto cuando no lo es.
	 * Corrige el main y prueba a crear varios artículos. Introduce algunos con
	 * valores incorrectos para comprobar qué ocurre.
	 * -----------------------------------------------------------------------------
	 */

	B4Articulo(String nombre, double precio, int iva, int cuantosQuedan) {

		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.cuantosQuedan = cuantosQuedan;

	}

	String nombre = "Tomodachi Life";
	double precio = 10;
	int iva = 21;
	int cuantosQuedan = 2;

}