package fundamentos;
import java.util.Scanner;
public class DesafioConversão {
	public static void main(String[] args) {;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o salário do mês Julho: ");
		
		String sala07 = entrada.nextLine().replace(",",".");
		
		System.out.print("Digite o salário do mês Agosto: ");
		
		String sala08 = entrada.nextLine().replace(",",".");
		
		System.out.print("Digite o salário do mês Setembro: ");
		
		String sala09 = entrada.nextLine().replace(",",".");
		
		double wage1 = Double.parseDouble(sala07);
		double wage2 = Double.parseDouble(sala08) ;
		double wage3 = Double.parseDouble(sala09);
		
		double soma = wage1 + wage2 + wage3;
		System.out.println("A soma entre os salários é igual à: " + soma );
		
		
		
		
		
		entrada.close();
	}
}
