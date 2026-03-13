package boletin03;

import java.util.Random;

public class Aleatorio {

	private Random random = new Random();

	public void numerosAleatorios(int cantidad) {
		System.out.println("Generando " + cantidad + " números entre 0 y 1:");
		for (int i = 0; i < cantidad; i++) {
			System.out.println("- " + random.nextDouble());
		}
	}

	public void numerosAleatorios(int cantidad, int max) {
		System.out.println("Generando " + cantidad + " números entre 0 y " + max + ":");
		for (int i = 0; i < cantidad; i++) {
			System.out.println("- " + random.nextInt(max + 1));
		}
	}

	public void numerosAleatorios(int cantidad, int min, int max) {
		System.out.println("Generando " + cantidad + " números entre " + min + " y " + max + ":");
		for (int i = 0; i < cantidad; i++) {
			int num = random.nextInt(max - min + 1) + min;
			System.out.println("- " + num);
		}
	}

}
