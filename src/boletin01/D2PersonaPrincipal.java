package boletin01;

public class D2PersonaPrincipal {

	public static void main(String[] args) {

		D2Persona persona1 = new D2Persona(1, "Raquel", "Nkwar", 17);
		D2Persona persona2 = new D2Persona(2, "Rei", "Ipa", 65);

		// MÉTODO MAYOR DE EDAD
		System.out.println("¿Es mayor de edad? " + persona1.esMayorEdad());
		System.out.println("¿Es mayor de edad? " + persona2.esMayorEdad());

		// MÉTODO JUBILADO
		System.out.println();
		System.out.println("¿Es mayor de edad? " + persona1.esJubilado());
		System.out.println("¿Es mayor de edad? " + persona2.esJubilado());

		// MÉTODO DIFERENCIA DE EDAD
		System.out.println();
		System.out.println("Diferencia de edad: " + persona1.diferenciaEdad(persona2));

		// MÉTODO TO STRING
		System.out.println();
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());

	}

}