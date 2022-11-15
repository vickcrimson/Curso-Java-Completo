package classe;

public class ExercicioDesconto {
	
	
	String name;
	double price;
	static double Desconto = 0.25;
	
	ExercicioDesconto(String nameNew , double priceNew){
		name = nameNew;
		price = priceNew;
		
	}
	
	double precoComDesconto() {
		return price * (1 - Desconto);
	}
	
}
