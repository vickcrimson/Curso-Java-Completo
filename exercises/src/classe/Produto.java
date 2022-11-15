package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	// construtor
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoProduto, double descontoProduto) {  // o parâmetro se incia com letra maiúscula, podemos deixar null mas não void
		nome = nomeInicial;
		preco = precoProduto;
		desconto = descontoProduto;
				
		
	}
	
	// construtor padrão = para não precisar
	// declarar a string na classe e utilizar o "produto.nome"
	// sem interrupções.
	
	Produto(){  // Construtores podem ter o mesmo nome se o parâmetro for diferente
		
	}
	
	// fim do construtor
	
	double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto - descontoDoGerente);
	}
	
} 
