package colections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Diana"));
		usuarios.add(new Usuario("Morgana"));
		usuarios.add(new Usuario("Miranha"));
		
		boolean resultado = usuarios.contains(new Usuario("Morgana"));
		System.out.println(resultado);
	}
}
