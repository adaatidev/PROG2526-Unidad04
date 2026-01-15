package boletin01;

public class A4ArticuloPrincipal {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa con una clase llamada Articulo con los siguientes atributos:
		 * nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa
		 * cuántos quedan en el almacén). En el main de la clase principal instancia un
		 * objeto de la clase artículo. Asígnale valores a todos sus atributos (los que
		 * quieras) y muestra por pantalla un mensaje del estilo “Pijama - Precio:10€ -
		 * IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el
		 * precio con IVA). Luego, cambia el precio y vuelve a imprimir el mensaje.
		 * -----------------------------------------------------------------------------
		 */

		// Creación del objeto
		A4Articulo articulo = new A4Articulo();

		// Asignación de valores
		articulo.nombre = "Animal Crossing";
		articulo.precio = 20;
		articulo.cuantosQuedan = 8;

		// Se imprimen los datos del artículo
		System.out.println(articulo.nombre + " - Precio: " + articulo.precio + "€ - IVA: " + articulo.IVA + "% - PVP: "
				+ (articulo.precio + (articulo.precio * articulo.IVA) / 100) + "€");

		// Modifiación del precio
		articulo.precio = 25;

		// Se vuelven a imprimir los datos del artículo
		System.out.println(articulo.nombre + " - Precio: " + articulo.precio + "€ - IVA: " + articulo.IVA + "% - PVP: "
				+ (articulo.precio + (articulo.precio * articulo.IVA) / 100) + "€");

	}

}