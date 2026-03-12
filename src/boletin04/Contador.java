package boletin04;

public class Contador {
	private int cont;

	// CONSTRUCTOR POR DEFECTO
	Contador() {
		this.cont = 0;
	}

	// CONSTRUCTOR CON PARÁMETROS
	Contador(int cont) {
		if (cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}

	// GETTERS Y SETTERS
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if (cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}

	// MÉTODOS
	public void incrementar() {
		this.cont++;
	}

	public void decrementar() {
		cont--;
		if (this.cont < 0) {
			this.cont = 0;
		}
	}

}
