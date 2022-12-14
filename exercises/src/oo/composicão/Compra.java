package oo.composicão;

import java.util.ArrayList;

public class Compra {

	String cliente;
	
	ArrayList<Item> itens = new ArrayList<Item>();

	void adicionarItem(Item item) { // criando uma relação bidirecional
		itens.add(item);
		item.compra = this; // Definindo que o item que estou adicionando é o próprio
	}
	
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
