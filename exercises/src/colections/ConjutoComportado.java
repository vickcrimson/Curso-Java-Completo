package colections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjutoComportado {

	public static void main(String[] args) {
		
		// Definir o tipo de dados que entra (homogenizar)
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Isla");
		lista.add("Maria");
		lista.add("Bonita");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
	}
	
}
