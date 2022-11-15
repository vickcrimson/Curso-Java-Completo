package fundamentos.operadores;

public class Lógicos {
	public static void main(String[] args) {
		boolean condition1 = true;
		boolean condition2 = 3 > 7;
		
		System.out.println(condition1 && condition2); // E
		System.out.println(condition1 || condition2); // OU
		System.out.println(condition1 ^ condition2); // XOR
		System.out.println(!condition1);
		System.out.println(!condition2);
	}
	
}
