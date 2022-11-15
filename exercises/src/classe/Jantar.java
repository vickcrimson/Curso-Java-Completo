package classe;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.225);
		Comida c2 = new Comida("Yakisoba", 0.500);
		
		
		Pessoas p1 = new Pessoas("Maria Del Bairro", 65);
		
		
		System.out.println(p1.peso);
		p1.comer(c2);
		System.out.println(p1.peso);
	}
}
