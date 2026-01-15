package boletin01;

public class B2Persona {

	/*
	 * -----------------------------------------------------------------------------
	 * Añade a la clase Persona un constructor con todos los parámetros. Modifica el
	 * main para utilizar el constructor con parámetros en vez de modificar
	 * directamente los atributos
	 * -----------------------------------------------------------------------------
	 */

	// Variables para los atributos
	int dni;
	String nombre;
	String apellidos;
	int edad;

	// Creación del constructor
	B2Persona(int dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

}