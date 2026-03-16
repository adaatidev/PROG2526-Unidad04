package boletincrud;

public class Disco {
	enum Generos {
		Rock, Pop, Jazz, Blues
	}

	private String codigo;
	private String autor;
	private String titulo;
	private double duracion;
	private Generos genero;

	// CONSTRUCTOR
	Disco(String codigo, String autor, String titulo, double duracion, Generos genero) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
	}

	// GETTERS Y SETTERS
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	// MÉTODOS TOSTRING Y EQUALS
	@Override
	public String toString() {
		return String.format("[%s] %s - %s (%s min) | Género: %s", codigo, autor, titulo, duracion, genero);
	}

	public boolean equals(String codigo1, String codigo2) {
		boolean iguales = false;
		if (codigo1.equals(codigo2)) {
			iguales = true;
		}
		return iguales;
	}

}
