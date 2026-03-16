package boletincrud;

import java.util.Scanner;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CuentaCorrienteCRUD banco = new CuentaCorrienteCRUD();
		int opcion = 0;

		do {
			System.out.println("\nGESTIÓN BANCARIA\n================");
			System.out.println("1. Listado de cuentas.");
			System.out.println("2. Nueva Cuenta.");
			System.out.println("3. Realizar Operación (Ingreso/Retirada).");
			System.out.println("4. Borrar Cuenta.");
			System.out.println("5. Salir.");
			System.out.print("Opción: ");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1: // LISTADO
				if (banco.getTodas().isEmpty()) {
					System.out.println("No hay cuentas registradas.");
				} else {
					banco.getTodas().forEach(System.out::println);
				}
				break;

			case 2: // CREATE
				System.out.print("DNI: ");
				String dni = sc.nextLine();
				System.out.print("Nombre: ");
				String nombre = sc.nextLine();
				System.out.print("Saldo Inicial: ");
				double saldo = sc.nextDouble();
				System.out.println("Nacionalidad (1. Española, 2. Extranjera): ");
				int nac = sc.nextInt();
				CuentaCorriente.Nacionalidad n = (nac == 2) ? CuentaCorriente.Nacionalidad.EXTRANJERA
						: CuentaCorriente.Nacionalidad.ESPAÑOLA;

				banco.añadirCuenta(new CuentaCorriente(dni, nombre, saldo, n));
				System.out.println("Cuenta creada.");
				break;

			case 3: // UPDATE (Operaciones)
				System.out.print("Introduce DNI del titular: ");
				String dniBusqueda = sc.nextLine();
				CuentaCorriente cuenta = banco.buscarPorDni(dniBusqueda);

				if (cuenta != null) {
					System.out.println("1. Ingresar / 2. Sacar");
					int op = sc.nextInt();
					System.out.print("Cantidad: ");
					double cant = sc.nextDouble();
					if (op == 1)
						cuenta.ingresarDinero(cant, cuenta.getSaldo());
					else
						cuenta.sacarDinero(cant, cuenta.getSaldo());
					System.out.println("Operación realizada. Nuevo saldo: " + cuenta.getSaldo() + "€");
				} else {
					System.out.println("Titular no encontrado.");
				}
				break;

			case 4: // DELETE
				System.out.print("Introduce DNI para cerrar cuenta: ");
				String dniBorrar = sc.nextLine();
				if (banco.eliminarCuenta(dniBorrar)) {
					System.out.println("Cuenta eliminada correctamente.");
				} else {
					System.out.println("No se pudo encontrar la cuenta.");
				}
				break;
			}
		} while (opcion != 5);
		System.out.println("Gracias por usar nuestra banca online.");
		sc.close();
	}

}
