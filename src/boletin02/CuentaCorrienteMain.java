package boletin02;

import boletin02.CuentaCorriente.Nacionalidad;

public class CuentaCorrienteMain {

	public static void main(String[] args) {

		CuentaCorriente persona1 = new CuentaCorriente("11111111A", "Christian", 70, Nacionalidad.ESPAÑOLA);
		CuentaCorriente persona2 = new CuentaCorriente("22222222B", "Destro", 2, Nacionalidad.EXTRANJERA);

		persona1.sacarDinero(50, persona1.saldo);
		persona1.ingresarDinero(70, persona1.saldo);
		System.out.println(persona1.toString());
		persona1.equals(persona1.dni, persona2.dni, persona1.nombre, persona2.nombre);

	}

}
