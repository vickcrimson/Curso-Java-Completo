package fundamentos.operadores;

public class Atribuição {
	public static void main(String[] args) {
		
		int a = 22;
		int b = 15;
		int c = a - b;
		int d = 48;
		int e = 10;
				
		
		a += b; 
		b -= a;
		c *= c; 
		d /= a; 
		e %= 2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
}
