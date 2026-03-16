package boletincrud;

import java.util.ArrayList;

public class PizzaCRUD {
	private ArrayList<Pizza> pedidos;

	// CONSTRUCTOR
	PizzaCRUD() {
		this.pedidos = new ArrayList<>();
	}

	// CREATE
	public void crearPedido(Pizza pedido) {
		pedidos.add(pedido);
	}

	// READ
	public ArrayList<Pizza> getPedidos() {
		return pedidos;
	}

	// UPDATE
	public boolean servirPizza(int codigo) {
		boolean servida = false;
		for (Pizza p : pedidos) {
			if (p.getCodigo() == codigo) {
				p.setEstado(Pizza.Estado.servida);
				servida = true;
			}
		}

		return servida;
	}

}
