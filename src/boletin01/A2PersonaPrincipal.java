package boletin01;

import java.util.Scanner;

public class A2PersonaPrincipal {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa con una clase llamada Persona que representará los datos
		 * principales de una persona: dni, nombre, apellidos y edad. En el main de la
		 * clase principal instancia dos objetos de la clase Persona. Luego, pide por
		 * teclado los datos de ambas personas (guárdalos en los objetos). Por último,
		 * imprime dos mensajes por pantalla (uno por objeto) con un mensaje del estilo
		 * “Azucena Luján García con DNI … es / no es mayor de edad”
		 * -----------------------------------------------------------------------------
		 */

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Creación de los objetos
		A2Persona persona1 = new A2Persona();
		A2Persona persona2 = new A2Persona();

		// Se le pregunta al usuario que introduzca los siguientes datos
		System.out.println("Introduzca su DNI: ");
		persona1.dni = sc.nextInt();
		System.out.println("Introduzca su nombre: ");
		persona1.nombre = sc.next();
		System.out.println("Introduzca sus apellidos: ");
		persona1.apellidos = sc.next();
		System.out.println("Introduzca su edad: ");
		persona1.edad = sc.nextInt();

		System.out.println();

		System.out.println("Introduzca su DNI: ");
		persona2.dni = sc.nextInt();
		System.out.println("Introduzca su nombre: ");
		persona2.nombre = sc.next();
		System.out.println("Introduzca sus apellidos: ");
		persona2.apellidos = sc.next();
		System.out.println("Introduzca su edad: ");
		persona2.edad = sc.nextInt();

		// Se imprimen los datos
		System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni
				+ (persona1.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

		System.out.println("");

		System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni
				+ (persona2.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

		// Cierre del scanner
		sc.close();
	}

}