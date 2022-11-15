package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// do {} while();
		Scanner entrada = new Scanner(System.in);
		
		String text = "";
		
		do { 
			System.out.println("Deseja sair?");
			text = entrada.nextLine();
		} while(!text.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();	
	}
}
