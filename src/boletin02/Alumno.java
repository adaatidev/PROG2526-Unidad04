package boletin02;

public class Alumno {

	// VARIABLES
	String nombre;

	public String getNombre() {
		return nombre;
	}

	// GETTERS/SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	double media;

	Alumno(String nombre, double media) {
		this.nombre = nombre;
		this.media = media;
	}

	// MÉTODOS
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
