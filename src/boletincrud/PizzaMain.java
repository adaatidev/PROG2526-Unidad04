package boletincrud;

import java.util.Scanner;

public class PizzaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PizzaCRUD crud = new PizzaCRUD();

		char opcion = '0';
		int cod;
		int tSel;
		int tipoSel;
		int codServir;

		do {
			System.out.println();
			System.out.println("=====================");
			System.out.println("a. Listado de pizzas");
			System.out.println("b. Nuevo pedido");
			System.out.println("c. Pizza servida");
			System.out.println("d. Salir");
			opcion = sc.next().toLowerCase().charAt(0);
			sc.nextLine(); // LIMPIAR

			switch (opcion) {
			case 'a':
				System.out.println("LISTADO DE PIZZAS");
				if (crud.getPedidos().isEmpty()) {
					System.out.println("No hay pedidos registrados");
				} else {
					for (Pizza p : crud.getPedidos()) {
						System.out.println(p);
					}
				}
				break;
			case 'b':
				System.out.println("Introduzca el código de la pizza: ");
				cod = sc.nextInt();

				System.out.println("Tamaño: 1. Mediana, 2. Familiar");
				tSel = sc.nextInt();
				Pizza.Tamano tam = (tSel == 2) ? Pizza.Tamano.familiar : Pizza.Tamano.mediana;

				System.out.println("Tipo: 1. Margarita, 2. Cuatro Quesos, 3. Funghi");
				tipoSel = sc.nextInt();
				Pizza.Tipo tipo;
				if (tipoSel == 2)
					tipo = Pizza.Tipo.cuatroQuesos;
				else if (tipoSel == 3)
					tipo = Pizza.Tipo.funghi;
				else
					tipo = Pizza.Tipo.margarita;

				crud.crearPedido(new Pizza(cod, tam, tipo));
				System.out.println("Pedido registrado con éxito.");
				break;
			case 'c':
				System.out.println("Introduzca el código de la pizza que se va a servir: ");
				codServir = sc.nextInt();
				if (crud.servirPizza(codServir)) {
					System.out.println("Estado actualizado: ¡Pizza servida!");
				} else {
					System.out.println("Error: No se encontró ninguna pizza con ese código.");
				}
				break;
			case 'd':
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 'd');

		System.out.println("Has salido del programa");

		sc.close();
	}

}
