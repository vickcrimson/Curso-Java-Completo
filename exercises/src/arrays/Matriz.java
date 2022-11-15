package arrays;

import java.util.Arrays;
import java.util.Scanner;

/* 
Quantos alunos tem na turma?
Armazenar
Quantas notas?
Armazenar
Calcular Média da Turma
*/


public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // Abrimos a entrada no console
		
		
		System.out.print("Quantos alunos tem na turma? "); // Coletamos o número de alunos e armazenamos na variável
		int qtAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno? "); // Coletamos o número de notas e armazenamos na variável
		int qtNotas = entrada.nextInt();
		
		double[][] notasTurma = new double[qtAlunos][qtNotas];  // Criamos o objeto matriz (dois ou mais arrays)
		
		double total = 0; // Declaramos o total que armazenará as notas 
		
		for (int i = 0; i < notasTurma.length; i++) { // abrimos um for para alunos
			for (int j = 0; j < notasTurma[i].length; j++) { // abrimos um for interno para as notas deles
				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1); // Para não aparecer o indíce 0 no console colocamos a fórmula "+1" 
				notasTurma[i][j] = entrada.nextDouble(); // coletamos as notas dos alunos
				total += notasTurma [i] [j] ; // Armazenamos no total
				}
			}
		
		double mediaTurma = total / (qtAlunos * qtNotas); // Criamos a variável que calculará a média
		System.out.println("A média da turma é " + mediaTurma); // Chamamos a média
		
		for (double[] notasAluno: notasTurma) { // For que mostra os arrays do código
			System.out.println(Arrays.toString(notasAluno));
		}
		entrada.close();
	}
}
