package boletin03;

public class Parse {

	public boolean parseToBoolean(int valor) {
		return valor == 1;
	}

	public boolean parseToBoolean(String cadena) {
		return cadena.equalsIgnoreCase("true");
	}

}
