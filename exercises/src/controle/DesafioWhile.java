package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidade = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("(Pressione -1 para sair) \n Digite a nota:");
			nota = entrada.nextDouble();
			
		if(nota >= 0 && nota <= 10) {
			total += nota;
			quantidade++;
		} else if (nota != -1) {
			System.out.println("Nota Inválida!");
		}
		}
		
		double media = total / quantidade;
		System.out.println("Média = " + media);
		entrada.close();
	}
}
