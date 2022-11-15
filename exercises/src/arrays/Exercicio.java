package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		//  modelo array: double[] arrayExemplo = new double[] ;
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 6.9;
		notasAlunoA[1] = 8.5;
		notasAlunoA[2] = 7.2;
		
		//Para imprimir o resultado nós importamos a lib "Arrays"/
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Propriedade length
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++ ) {
			totalAlunoA += notasAlunoA[i];
		}	
		//Declaração literal num array
			
		double[] notasAlunoB = {5, 10, 7, 4};
		System.out.println(Arrays.toString(notasAlunoB));
		
		double totalAlunoB = 0;
		for (int j = 0; j < notasAlunoB.length; j++) {
			 totalAlunoB += notasAlunoB[j];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		System.out.println(totalAlunoB / notasAlunoB.length);
		
		/*System.out.println(totalAlunoB / notasAlunoB.length);
		System.out.println(total / notasAlunoA.length);*/
		
		
		
		
	}
	
}
