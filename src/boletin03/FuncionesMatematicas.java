package boletin03;

public class FuncionesMatematicas {

	public static int sumatorio(int numero) {

		int auxiliar = 0;
		if (numero == 1) {
			auxiliar = 1;
		} else {
			auxiliar = numero + sumatorio(numero - 1);
		}
		return auxiliar;
	}

	public static double potencia(double a, int n) {
		double auxiliar = 0;
		if (n == 0) {
			auxiliar = 1;
		} else {
			auxiliar = a * potencia(a, n - 1);
		}
		return auxiliar;
	}

	public static int serieFibonacci(int numero) {
		int auxiliar = 0;
		if (numero == 0 || numero == 1) {
			auxiliar = 1;
		} else {
			auxiliar = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
		}
		return auxiliar;
	}

}
