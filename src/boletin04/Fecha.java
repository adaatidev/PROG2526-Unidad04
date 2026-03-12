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

	public boolean fechaCorrecta() {
		boolean correcta = true;
		if (ano < 1 || mes < 1 || mes > 12) {
			correcta = false;
		}
		correcta = dia >= 1 && dia <= diasDelMes();
		return correcta;
	}

	private int diasDelMes() {
		int dias = 0;
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> dias = 31;
		case 4, 6, 9, 11 -> dias = 30;
		case 2 -> dias = esBisiesto() ? 29 : 28;
		}
		return dias;
	}

	public void diaSiguiente() {
		dia++;
		if (dia > diasDelMes()) {
			dia = 1;
			mes++;
			if (mes > 12) {
				mes = 1;
				ano++;
			}
		}
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%d", dia, mes, ano);
	}

}
