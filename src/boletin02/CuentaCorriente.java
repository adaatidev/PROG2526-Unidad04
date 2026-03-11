package boletin02;

public class CuentaCorriente {

	String dni;
	String nombre;
	double saldo;

	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	Nacionalidad nacionalidad;

	// CONSTRUCTORES
	CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}

	CuentaCorriente(String dni, String nombre, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	CuentaCorriente(String dni, String nombre, double saldo, Nacionalidad nacionalidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}

	// GET
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	// SET
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	// MÉTODOS
	public boolean sacarDinero(double cantidad, double saldo) {
		boolean valido = false;

		if (cantidad <= saldo && cantidad >= 0) {
			this.saldo -= cantidad;
			valido = true;
		} else {
			System.out.println("No se puede llevar a cabo la operación.");
		}

		return valido;
	}

	public boolean ingresarDinero(double cantidad, double saldo) {
		boolean valido = false;

		if (cantidad >= 0) {
			this.saldo += cantidad;
			valido = true;
		} else {
			System.out.println("No se puede llevar a cabo la operación.");
		}

		return valido;
	}

	@Override
	public String toString() {
		return String.format("CuentaCorriente [Titular: %s, DNI: %s, Saldo: %.2f€, Nacionalidad: %s]", nombre, dni,
				saldo, nacionalidad);
	}

	public boolean equals(String dni1, String dni2, String nombre1, String nombre2) {
		boolean iguales = false;

		if (dni1.equals(dni2) && nombre1.equals(nombre2)) {
			iguales = true;
		}

		return iguales;
	}

}
