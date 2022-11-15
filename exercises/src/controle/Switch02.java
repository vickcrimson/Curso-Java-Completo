package controle;

import java.util.Scanner;

public class Switch02 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	String conceito = "";
	System.out.println("Informa a nota: ");
	int nota = entrada.nextInt();
	
	switch(nota) {
	case 10:
		conceito = "A";
		break;
	case 9:
		conceito = "A";
		break;
	case 8:
		conceito = "B";
		break;
	case 7:
		conceito = "B";
		break;
	case 6: case 5:
		conceito = "C";
		break;
	case 4: case 3:
		conceito = "D";
		break;
	case 2: 
	case 1:
		conceito = "E";
		break;
	default: 
		conceito = "não encontrado";

	}
	System.out.println(conceito);
	entrada.close();
}
}
