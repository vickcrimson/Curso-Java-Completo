package oo.composicão;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "João Pedro";
		c1.adicionarItem(new Item("Caneta", 20, 7.45)); // Relação bidirecional
		c1.itens.add(new Item("Caderno", 5, 17.45));		
		c1.itens.add(new Item("Midnights Remix", 85, 1.45));		
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
	}
	
}
