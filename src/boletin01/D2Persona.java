package boletin01;

public class D2Persona {

	// CONSTRUCTOR

	D2Persona(int dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	// GETTERS

	private int dni;

	public int getDni() {
		return dni;
	}

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	private String apellidos;

	public String getApellidos() {
		return apellidos;
	}

	private int edad;

	public int getEdad() {
		return edad;
	}

	// SETTERS

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// MÉTODOS

	public boolean esMayorEdad() {

		boolean mayor = false;

		if (edad >= 18) {
			mayor = true;
		}

		return mayor;

	}

	public boolean esJubilado() {

		boolean jubilado = false;

		if (edad >= 65) {
			jubilado = true;
		}

		return jubilado;

	}

	public int diferenciaEdad(D2Persona p) {

		int diferencia;

		diferencia = p.edad - edad;

		return diferencia;
	}

	public String toString() {

		String cadena = "";

		cadena = dni + ", " + nombre + ", " + apellidos + ", " + edad;

		return cadena;

	}

}