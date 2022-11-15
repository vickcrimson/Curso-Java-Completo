package fundamentos;

public class ConversãoPrimitivos {
	public static void main(String[] args) {
		double a = 1; // A conversão é implícita pois o int cabe dentro do double sem perda
		float b = (float) 7.58964234178; // essa conversão é explícita (CAST) pois haverá perda de informação 
		
		System.out.println(a);
		System.out.println(b);
	}
}
