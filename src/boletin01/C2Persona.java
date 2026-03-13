package boletin01;

public class C2Persona {

	/*
	 * -----------------------------------------------------------------------------
	 * Aplica el encapsulamiento básico a la clase Persona: Declara todos sus
	 * atributos como private y crea todos los getters y setters necesarios (un get
	 * y un set por atributo). Los setters deben comprobar que el dato de entrada es
	 * correcto antes de asignárselo al atributo. Corrige el main para utilizar los
	 * getters y setters. Prueba a instanciar varios objetos, mostrar sus valores
	 * por pantalla, modificarlos, etc.
	 * -----------------------------------------------------------------------------
	 */

	// CONSTRUCTOR

	C2Persona(int dni, String nombre, String apellidos, int edad) {
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

}