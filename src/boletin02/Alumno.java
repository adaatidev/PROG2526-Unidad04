package boletin02;

public class Alumno {

	// VARIABLES
	private String nombre;
	private double media;

	// CONSTRUCTOR
	Alumno(String nombre, double media) {
		this.nombre = nombre;
		this.media = media;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	// MÉTODO
	@Override
	public String toString() {
		return String.format("%s \t %s", nombre, media);
	}

	public boolean equals(String nombre1, String nombre2) {
		boolean iguales = false;

		if (nombre1.equals(nombre2)) {
			iguales = true;
		}

		return iguales;
	}

}
