package boletincrud;

import java.util.Scanner;

public class DiscoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DiscoCRUD crud = new DiscoCRUD();

		int opcion = 0;

		do {
			System.out.println();
			System.out.println("COLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Borrar");
			System.out.println("4. Salir");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				if (crud.getLista().isEmpty()) {
					System.out.println("El listado está vacío");
				} else {
					for (Disco d : crud.getLista()) {
						System.out.println(d);
					}
				}
				break;
			case 2:
				System.out.print("Código: ");
				String cod = sc.nextLine();
				System.out.print("Autor: ");
				String autor = sc.nextLine();
				System.out.print("Título: ");
				String titulo = sc.nextLine();
				System.out.print("Duración (min): ");
				int min = sc.nextInt();

				System.out.println("Género: 1.Rock, 2.Pop, 3.Jazz, 4.Blues");
				int gSel = sc.nextInt();
				Disco.Generos gen;
				switch (gSel) {
				case 2:
					gen = Disco.Generos.Pop;
					break;
				case 3:
					gen = Disco.Generos.Jazz;
					break;
				case 4:
					gen = Disco.Generos.Blues;
					break;
				default:
					gen = Disco.Generos.Rock;
					break;
				}

				crud.agregarDisco(new Disco(cod, autor, titulo, min, gen));
				System.out.println("Disco añadido con éxito.");
				break;
			case 3:
				System.out.print("Introduce el código del disco a borrar: ");
				String codBorrar = sc.nextLine();
				if (crud.borrarDisco(codBorrar)) {
					System.out.println("Disco eliminado.");
				} else {
					System.out.println("No se encontró ningún disco con ese código.");
				}
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}

		} while (opcion != 4);

		System.out.println("Has salido del programa");

		sc.close();
	}

}
