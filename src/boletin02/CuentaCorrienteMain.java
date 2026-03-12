package boletin02;

import boletin02.CuentaCorriente.Nacionalidad;

public class CuentaCorrienteMain {

	public static void main(String[] args) {

		CuentaCorriente persona1 = new CuentaCorriente("11111111A", "Christian", 70, Nacionalidad.ESPAÑOLA);
		CuentaCorriente persona2 = new CuentaCorriente("22222222B", "Destro", 2, Nacionalidad.EXTRANJERA);

		persona1.sacarDinero(50, persona1.getSaldo());
		persona1.ingresarDinero(70, persona1.getSaldo());
		System.out.println(persona1.toString());
		System.out.println(
				persona1.equals(persona1.getDni(), persona2.getDni(), persona1.getNombre(), persona2.getNombre()));

	}

}
