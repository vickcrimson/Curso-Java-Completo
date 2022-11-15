package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
 public static void main(String[] args) {
	// Ler n1
	// Ler n2
	// Qual operador
	 Scanner entrada = new Scanner(System.in);
	 
	 	System.out.println("Digite o primero valor:");
		float num1 = entrada.nextFloat();
		System.out.println("Digite o segundo valor:");
		float num2 = entrada.nextFloat();
		System.out.println("Digite o operador(+, -, * ou /):");
		String operador = entrada.next();
		
		//lógica
		double resultado = "+".equals(operador) ? num1 + num2 : 0; 
		resultado = "-".equals(operador) ? num1 - num2 : resultado; 
		resultado = "*".equals(operador) ? num1 * num2 : resultado; 
		resultado = "/".equals(operador) ? num1 / num2 : resultado; 
		

		System.out.printf("%.1f %s %.1f = %f", num1, operador , num2, resultado);
		
		entrada.close();
}
}
