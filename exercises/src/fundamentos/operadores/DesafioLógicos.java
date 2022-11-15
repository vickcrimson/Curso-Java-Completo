package fundamentos.operadores;

public class DesafioLógicos {
	public static void main(String[] args) {
		// Trab terça, trab quinta (v ou F)
		// 1 f = 32", 2 V= 50"; VV ou VF = sorvete;
		// FF = em casa
		
		boolean trab1 = true; 
		boolean trab2 = true;
		boolean tv50 = trab1 && trab2;
		boolean tv32 = trab1 ^ trab2;
		boolean iceCream = trab1 || trab2 ;
		
		
		System.out.println("Comprou TV de 50? " + tv50);
		System.out.println("Comprou TV de 32? " + tv32);
		System.out.println("Tomou sorvete? " + iceCream);
	}
}
