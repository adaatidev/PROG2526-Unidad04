package boletin01;

public class B4ArticuloPrincipal {

	public static void main(String[] args) {

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

		// Creación del objeto
		B4Articulo articulo = new B4Articulo("Animal Crossing", 20, 21, 8);

		// Se imprimen los datos del artículo
		System.out.println(articulo.nombre + " - Precio: " + articulo.precio + "€ - IVA: " + articulo.iva + "% - PVP: "
				+ (articulo.precio + (articulo.precio * articulo.iva) / 100) + "€");

	}

}