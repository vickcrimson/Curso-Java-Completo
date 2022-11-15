package fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		// String não é uma palavra reservada, logo, usando com a primeira letra minúscula pode-se utilizar como uma variável.
		String s = "Who's gonna save you this time?";
		// A notação ponto '.' serve para adicionar atributos à variável criada. 
		s = s.toUpperCase(); 
		System.out.println(s);
			
		String nome = "Olá, Y!"
				.replace("Y", "Ramona")
				.toUpperCase()
				.concat("!");
		
		System.out.println(nome);
	}
}
// Primitivos não tem notação ponto!