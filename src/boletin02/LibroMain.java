package boletin02;

import boletin02.Libro.Generos;

public class LibroMain {

	public static void main(String[] args) {

		Libro libro1 = new Libro("El Quixote", "Miguel de Cervantes", 20, 10, Generos.Dramático);
		Libro libro2 = new Libro("Diccionario", "Yo Obviamente", 0, 888, Generos.Didáctico);

		System.out.println(libro1.prestamo(libro1.getEjemplares()));
		libro1.devolucion(libro1.getEjemplares(), libro1.getPrestados());
		System.out.println(libro1.toString());
		System.out.println(libro1.equals(libro2));

	}

}
