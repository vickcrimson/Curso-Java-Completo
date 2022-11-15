package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		//Wrappers são envelopamentos, através deles podemos, por exemplo
		//tornar tipos primitivos em objetos
		
		Byte b = 100;
		
		Short s = 1000;
		
		Integer i = Integer.parseInt("10000") ;
		
		Long l = 100000000L;
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
	}
}
