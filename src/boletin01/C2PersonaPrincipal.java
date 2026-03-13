package boletin01;

import java.util.Scanner;

public class C2PersonaPrincipal {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Aplica el encapsulamiento básico a la clase Persona: Declara todos sus
		 * atributos como private y crea todos los getters y setters necesarios (un get
		 * y un set por atributo). Los setters deben comprobar que el dato de entrada es
		 * correcto antes de asignárselo al atributo. Corrige el main para utilizar los
		 * getters y setters. Prueba a instanciar varios objetos, mostrar sus valores
		 * por pantalla, modificarlos, etc.
		 * -----------------------------------------------------------------------------
		 */

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Se crea el objeto y se almacenan los datos gracias al constructor
		C2Persona persona1 = new C2Persona(0, "", "", 0);
		C2Persona persona2 = new C2Persona(0, "", "", 0);

		// Se le pregunta al usuario que introduzca los siguientes datos y se crean las
		// variables
		System.out.println("Introduzca su DNI: ");
		persona1.setDni(sc.nextInt());
		System.out.println("Introduzca su nombre: ");
		persona1.setNombre(sc.next());
		System.out.println("Introduzca sus apellidos: ");
		persona1.setApellidos(sc.next());
		System.out.println("Introduzca su edad: ");
		persona1.setEdad(sc.nextInt());

		System.out.println();

		System.out.println("Introduzca su DNI: ");
		persona2.setDni(sc.nextInt());
		System.out.println("Introduzca su nombre: ");
		persona2.setNombre(sc.next());
		System.out.println("Introduzca sus apellidos: ");
		persona2.setApellidos(sc.next());
		System.out.println("Introduzca su edad: ");
		persona2.setEdad(sc.nextInt());

		// Se imprimen los datos
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni()
				+ (persona1.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad"));

		System.out.println("");

		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni()
				+ (persona2.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad"));

		// Cierre del scanner
		sc.close();

	}

}