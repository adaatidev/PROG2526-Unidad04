package boletincrud;

import java.util.ArrayList;

public class DiscoCRUD {
	private ArrayList<Disco> listaDiscos;

	// CONSTRUCTOR
	DiscoCRUD() {
		listaDiscos = new ArrayList<>();
	}

	// CREATE
	public void agregarDisco(Disco d) {
		listaDiscos.add(d);
	}

	// READ
	public ArrayList<Disco> getLista() {
		return listaDiscos;
	}

	// DELETE
	public boolean borrarDisco(String codigo) {
		return listaDiscos.removeIf(d -> d.getCodigo().equalsIgnoreCase(codigo));
	}
}