package one.digitalinnovation;

public class Main {

	public static void main(final String[] args) {
		
		Fila<String> minhaFila = new Fila<>();
		
		minhaFila.enqueue("Primeiro");
		minhaFila.enqueue("Segundo");
		minhaFila.enqueue("Terceito");
		minhaFila.enqueue("Quarto");

		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);

		minhaFila.enqueue("Ultimo");
		
		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);

		


		
		
	}
}
