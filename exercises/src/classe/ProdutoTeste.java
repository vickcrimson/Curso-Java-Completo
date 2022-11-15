package classe;


public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		 Produto p0 = new Produto("Fone TWS", 289.90, 0.25);
		 
		 Produto p1 = new Produto("Notebook");
		 // teste construtor p1.nome= "Notebook";
		 p1.preco= 8525.50;
		 p1.desconto = 0.15;
		 
		 var p2 = new Produto("Caneta Azul");
		// teste consturtor p2.nome = "Caneta Azul";
		 p2.preco = 2.50;
		 p2.desconto = 0;
		 
		 
		 System.out.println(p1.nome + " = " + p1.preco);
		 System.out.println(p2.nome + " = " + p2.preco);
		 System.out.println(p0.nome + " = " + p0.preco);
		 
		 
		 double desconto1 = p1.precoComDesconto();
		 System.out.println(desconto1);
		 double desconto2 = p2.preco * (1 - p2.desconto);
		 System.out.println(desconto2);
		 double desconto0 = p0.precoComDesconto();
		 System.out.println(p0.nome + " = " + desconto0);
}
}
