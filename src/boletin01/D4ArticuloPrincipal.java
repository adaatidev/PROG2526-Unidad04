package boletin01;

public class D4ArticuloPrincipal {

	public static void main(String[] args) {

		// Creación del objeto
		D4Articulo articulo = new D4Articulo("Animal Crossing", 20, 21, 8);

		System.out.println("Precio con IVA: " + articulo.getPVP(20, 21));
		System.out.println("Precio con descuento: " + articulo.getPVPDescuento(20, 10));
		System.out.println("Vendido? " + articulo.vender(2));
		System.out.println("Almacenar: " + articulo.almacenar(20, 5));
		System.out.println(articulo.toString());

	}

}