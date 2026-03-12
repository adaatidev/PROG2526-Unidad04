package boletin02;

public class Pizza {

	// VARIABLES
	enum Tamano {
		mediana, familiar
	}

	enum Tipo {
		margarita, cuatroQuesos, funghi
	}

	enum Estado {
		pedida, servida
	}

	int codigo;
	Tamano tamano;
	Tipo tipo;
	Estado estado;

	// CONSTRUCTOR
	public Pizza(int codigo, Tamano tamano, Tipo tipo) {
		this.codigo = codigo;
		this.tamano = tamano;
		this.tipo = tipo;
		this.estado = Estado.pedida;
	}

	// GETTERS Y SETTERS
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tamano getTamano() {
		return tamano;
	}

	public void setTamano(Tamano tamano) {
		this.tamano = tamano;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	// MÉTODO
	@Override
	public String toString() {
		return String.format("%s - %s - %s - %s", codigo, tamano, tipo, estado);
	}

	public boolean equals(int cod1, int cod2) {
		boolean iguales = false;
		if (cod1 == cod2) {
			iguales = true;
		}
		return iguales;
	}

}
