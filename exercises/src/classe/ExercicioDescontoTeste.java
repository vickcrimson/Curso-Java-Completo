package classe;

public class ExercicioDescontoTeste {

		public static void main(String[] args) {
			
			
			
			ExercicioDesconto p1 = new ExercicioDesconto("Fone Bluetooth", 150);
			
			System.out.println(p1.precoComDesconto());
			
			ExercicioDesconto p2 = new ExercicioDesconto("Frango Cozido", 14.99);
			
			p2.Desconto = 0.50;
			
			System.out.println(p2.precoComDesconto());
			
		}
}
