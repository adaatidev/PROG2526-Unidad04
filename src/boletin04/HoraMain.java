package boletin04;

public class HoraMain {

	public static void main(String[] args) {

		Hora miHora = new Hora(23, 59, 58);
		System.out.println("Hora inicial: " + miHora);

		miHora.incrementarSegundo();
		System.out.println("Después de 1 segundo: " + miHora);

		miHora.incrementarSegundo();
		System.out.println("Después de otro segundo (Medianoche): " + miHora);

		Hora horaErronea = new Hora(25, 70, 99);
		System.out.println("Hora con valores inválidos (25:70:99): " + horaErronea);

		horaErronea.setHora(12);
		horaErronea.setMinutos(30);
		System.out.println("Hora modificada manualmente: " + horaErronea);

		System.out.println(miHora.toString());

	}

}
