package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		boolean reprovação = media <=6.9;
		
		if (media >= 7) {
			System.out.println("Você foi aprovado!");
			}
		if (reprovação) {
			System.out.println("Você foi reprovado!");
		}
		entrada.close();
	}
}
