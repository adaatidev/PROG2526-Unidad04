package boletin04;

public class Fraccion {
	private int num;
	private int den;

	// CONSTRUCTOR
	Fraccion(int num, int den) {
		this.num = num;
		this.den = (den == 0) ? 1 : den;
		// simplifica();
	}

	// GETTERS Y SETTERS
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = (den == 0) ? 1 : den;
	}

	// MÉTODOS
	private int mcd() {
		int auxNum = Math.abs(num);
		int auxDen = Math.abs(den);
		int comun = 0;
		if (auxDen == 0) {
			comun = auxNum;
		}
		while (auxDen != 0) {
			comun = auxNum % auxDen;
			auxNum = auxDen;
			auxDen = comun;
		}
		return comun;
	}

	public void simplifica() {
		int n = mcd();
		num /= n;
		den /= n;
	}

	public Fraccion suma(Fraccion f) {
		int nuevoNum = (this.num * f.den) + (this.den * f.num);
		int nuevoDen = this.den * f.den;
		Fraccion resultado = new Fraccion(nuevoNum, nuevoDen);
		resultado.simplifica();
		return resultado;
	}

	public Fraccion resta(Fraccion f) {
		int nuevoNum = (this.num * f.den) - (this.den * f.num);
		int nuevoDen = this.den * f.den;
		Fraccion resultado = new Fraccion(nuevoNum, nuevoDen);
		resultado.simplifica();
		return resultado;
	}

	public Fraccion multiplica(Fraccion f) {
		Fraccion resultado = new Fraccion(this.num * f.num, this.den * f.den);
		resultado.simplifica();
		return resultado;
	}

	public Fraccion divide(Fraccion f) {
		Fraccion resultado = new Fraccion(this.num * f.den, this.den * f.num);
		resultado.simplifica();
		return resultado;
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}

}
