package boletin02;

public class AlumnoMain {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("Christian", 8.9);
		Alumno alumno2 = new Alumno("Destro", 9.2);

		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());
		System.out.println(alumno1.equals(alumno2));

	}

}
