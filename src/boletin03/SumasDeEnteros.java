package boletin03;

public class SumasDeEnteros {

	public int sumaEnteros(int numero) {
		int acumulador = 0;
		for (int i = 1; i <= numero; i++) {
			acumulador += i;
		}
		return acumulador;
	}

	public int sumaEnteros(int num1, int num2) {
		int acumulador = 0;

		int inicio = Math.min(num1, num2);
		int fin = Math.max(num1, num2);

		for (int i = inicio; i <= fin; i++) {
			acumulador += i;
		}
		return acumulador;
	}

}
