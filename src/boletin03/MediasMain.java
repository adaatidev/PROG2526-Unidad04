package boletin03;

public class MediasMain {

	public static void main(String[] args) {

		Medias mediaDe = new Medias();

		int a = 7;
		int b = 8;
		int x = 10;
		int y = 14;
		int z = 11;

		double res2 = mediaDe.media(a, b);
		System.out.println("--- Media de 2 valores ---");
		System.out.println("La media de " + a + " y " + b + " es: " + res2);

		double res3 = mediaDe.media(x, y, z);
		System.out.println("\n--- Media de 3 valores ---");
		System.out.println("La media de " + x + ", " + y + " y " + z + " es: " + res3);
	}
}
