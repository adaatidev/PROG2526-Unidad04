package boletincrud;

import java.util.ArrayList;

public class CuentaCorrienteCRUD {
	private ArrayList<CuentaCorriente> cuentas;

	CuentaCorrienteCRUD() {
		this.cuentas = new ArrayList<>();
	}

	public void añadirCuenta(CuentaCorriente c) {
		cuentas.add(c);
	}

	public ArrayList<CuentaCorriente> getTodas() {
		return cuentas;
	}

	public CuentaCorriente buscarPorDni(String dni) {
		for (CuentaCorriente c : cuentas) {
			if (c.getDni().equalsIgnoreCase(dni)) {
				return c;
			}
		}
		return null;
	}

	public boolean eliminarCuenta(String dni) {
		CuentaCorriente c = buscarPorDni(dni);
		if (c != null) {
			return cuentas.remove(c);
		}
		return false;
	}
}
