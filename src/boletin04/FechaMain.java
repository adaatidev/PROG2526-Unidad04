package boletin04;

public class FechaMain {

	public static void main(String[] args) {

		Fecha f1 = new Fecha(30, 2, 2023);
		Fecha f2 = new Fecha(28, 2, 2024);
		Fecha f3 = new Fecha(31, 12, 2025);
		Fecha f4 = new Fecha();

		System.out.println("Fecha 1: " + f1 + " - ¿Es correcta?: " + f1.fechaCorrecta());

		System.out.println("\nFecha inicial (Bisiesto): " + f2);
		System.out.println("¿Es bisiesto?: " + f2.esBisiesto());
		f2.diaSiguiente();
		System.out.println("Día siguiente: " + f2);

		System.out.println("\nFecha inicial (Fin de año): " + f3);
		f3.diaSiguiente();
		System.out.println("¡Feliz año nuevo!: " + f3);

		f4.setAno(2000);
		f4.setMes(2);
		f4.setDia(29);
		System.out.println("\nFecha manual: " + f4 + " - ¿Correcta?: " + f4.fechaCorrecta());

	}

}
