package boletin02;

public class Libro {

	// VARIABLES
	enum Generos {
		Narrativo, Lírico, Dramático, Didáctico, Poético
	};

	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	private Generos genero;

	// CONSTRUCTORES
	Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	Libro(String titulo, String autor, int ejemplares, int prestados, Generos genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
		this.genero = genero;
	}

	// GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	// MÉTODOS
	public boolean prestamo(int ejemplares) {
		boolean valido = false;

		if (this.ejemplares > 0) {
			this.ejemplares--;
			this.prestados++;
			valido = true;
		}

		return valido;
	}

	public boolean devolucion(int ejemplares, int prestados) {
		boolean seDevuelve = false;

		if (this.prestados > 0) {
			this.ejemplares++;
			this.prestados--;
			seDevuelve = true;
		}

		return seDevuelve;
	}

	@Override
	public String toString() {
		return String.format("Libro [Título: %s, Autor: %s, Ejemplares: %s, Prestados: %s, Género: %s]", titulo, autor,
				ejemplares, prestados, genero);
	}

	public boolean equals(String titulo1, String titulo2, String autor1, String autor2) {
		boolean iguales = false;

		if (titulo1.equals(titulo2) && autor1.equals(autor2)) {
			iguales = true;
		}

		return iguales;
	}
}
