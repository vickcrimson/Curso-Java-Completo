package colections;

import java.util.LinkedList;

public class Queue {
	
	public static void main(String[] args) {
		
		java.util.Queue<String> fila = new LinkedList<>();
		
		fila.add("Ashley"); // Adicionar à fila
		fila.offer("Lizzie"); // Adicionar à fila +
		// em casos de uma fila com restrição  
		
		System.out.println(fila.peek()); // Lê o primeiro elemento da fila
		System.out.println(fila.element()); // Caso de null ele gera uma exceção
		
		/* Outros comandos:
		 * file.size()
		 * file.clear () - limpa a fila
		 * file.isEmpty() 
		 * file.remove() */
		
		System.out.println(fila.poll()); // Chama e remova o primeiro elemento da fila
		
	}
}
