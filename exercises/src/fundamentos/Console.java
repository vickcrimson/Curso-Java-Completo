package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// Print sem o "ln" mantem o texto na mesma linha
		System.out.print("Boa");
		System.out.print(" noite!"); // \n pode criar uma nova linha
		
		//Print com o "ln" cria um linha após finalizar o string
		System.out.println("Boa");
		System.out.println(" tarde!");
		
		//Printf não tem quebra de linha
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 6, 7 ,18 ,20 ,32, 55); // \n cria a quebra de linha
		System.out.printf("Salário: %.1f %n", 1212.5897);
		
		//Scanner: permite entrada no console
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome:");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite sua idade:");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		System.out.printf("%s %s tem %d anos de idade. %n", nome, sobrenome, idade);
		
		entrada.close();
	}
}
