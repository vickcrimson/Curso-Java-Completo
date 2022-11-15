package classe;

public class Pessoas {

		String nome;
		double peso;
		
		Pessoas(String nomePessoa, int pesoPessoa){
			nome = nomePessoa;
			peso = pesoPessoa;
		}
	
		void comer(Comida comida) {
			if (comida != null) {
				peso += comida.pesoDaComida;
			}
		}
}
