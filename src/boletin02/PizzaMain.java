package boletin02;

import boletin02.Pizza.Tamano;
import boletin02.Pizza.Tipo;

public class PizzaMain {

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza(201, Tamano.mediana, Tipo.margarita);
		Pizza pizza2 = new Pizza(888, Tamano.familiar, Tipo.cuatroQuesos);

		System.out.println(pizza1.toString());
		System.out.println(pizza2.toString());
		System.out.println(pizza1.equals(pizza2));

	}

}
