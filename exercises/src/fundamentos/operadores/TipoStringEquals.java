package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		// Vamos aprender como comparar strings 
		
		//System.out.println(2 == 2); // Comparativo que funciona
		
		String s = new String("2");
		System.out.println(s == "2"); // Comparativo que não funciona
		
		// Utilizando a propriedade .equals conseguimos um 'true'
		
		String s1 = new String("2");
		System.out.println(s1.equals("2")); // Retorna true
		
		// Exemplo digitável no console
		System.out.println("Digite um valor para comparar:");
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // como não tem a propriedade equals não retorna um true; O .trim corta os espaços em branco
		System.out.println("2".equals(s2.trim())); 
		
		
		
		
		entrada.close();
		
	}
}
