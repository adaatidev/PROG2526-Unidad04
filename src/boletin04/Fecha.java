package boletin04;

public class Fecha {
	private int dia;
	private int mes;
	private int ano;

	// CONSTRUCTOR POR DEFECTO
	Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1999;
	}

	// CONSTRUCTOR CON PARÁMETROS
	Fecha(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// GETTERS Y SETTERS
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	// MÉTODOS
	public boolean esBisiesto() {
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}

//	public boolean fechaCorrecta() {
//		
//	}
	
}
