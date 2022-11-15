package controle;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite algo:");
		String close = entrada.next();
		
		while(!close.equalsIgnoreCase("sair")) {
			System.out.println("Inválido!");
			close = entrada.nextLine();
		} 
		
	entrada.close();
	}
}
