package boletin04;

public class ContadorMain {

	public static void main(String[] args) {

		Contador c1 = new Contador();
		Contador c2 = new Contador(10);
		Contador c3 = new Contador(-100);

		System.out.println("Contador 1 (inicial): " + c1.getCont());
		c1.incrementar();
		c1.incrementar();
		System.out.println("Contador 1 (tras incrementar 2 veces): " + c1.getCont());

		c1.decrementar();
		System.out.println("Contador 1 (tras 1 decremento): " + c1.getCont());
		c1.decrementar();
		c1.decrementar();
		System.out.println("Contador 1 (tras 2 decrementos más, límite 0): " + c1.getCont());

		System.out.println("---");

		System.out.println("Contador 2 (inicial 10): " + c2.getCont());

		c2.setCont(-50);
		System.out.println("Contador 2 (tras setCont -50): " + c2.getCont());

		System.out.println("Contador 3 (creado con -100): " + c3.getCont());

	}

}
