package boletin04;

public class Hora {

	// VARIABLES
	private int hora;
	private int minutos;
	private int segundos;

	// CONSTRUCTOR POR DEFECTO
	Hora() {
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

	// CONSTRUCTOR CON PARÁMETROS
	Hora(int hora, int minutos, int segundos) {
		setHora(hora);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	// GETTERS Y SETTERS
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = (hora >= 0 && hora < 24) ? hora : 0;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = (minutos >= 0 && minutos < 60 ? minutos : 0);
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = (segundos >= 0 && segundos < 60 ? segundos : 0);
	}

	// MÉTODOS
	public void incrementarSegundo() {
		segundos++;
		if (segundos == 60) {
			segundos = 0;
			minutos++;
			if (minutos == 60) {
				minutos = 0;
				hora++;
				if (hora == 24) {
					hora = 0;
				}
			}
		}
	}

	@Override
	public String toString() {
		return String.format("%s:%s:%s", hora, minutos, segundos);
	}

}
