package arrays;



public class Foreach {
	public static void main(String[] args) {
		double[] notas = {2.5, 5.7, 10, 7.9};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		System.out.println(" ");
		
		for(double nota: notas) { // estrutura do foreach
			System.out.print(nota + " ");
		}
		
	}
}
