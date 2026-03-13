package boletin01;

public class C4ArticuloPrincipal {

	public static void main(String[] args) {

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

		// Creación del objeto
		C4Articulo articulo = new C4Articulo("Animal Crossing", 20, 21, 8);

		// Se imprimen los datos del artículo
		System.out.println(articulo.getNombre() + " - Precio: " + articulo.getPrecio() + "€ - IVA: " + articulo.getIva()
				+ "% - PVP: " + (articulo.getPrecio() + (articulo.getPrecio() * articulo.getIva()) / 100) + "€");

	}

}