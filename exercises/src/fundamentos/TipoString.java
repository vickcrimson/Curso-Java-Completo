package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Why is everything so confusing?".charAt(12));
		
		String s = "Good Morning!";
		System.out.println(s.concat(" Bitch!"));
		System.out.println(s.startsWith("G"));
		System.out.println(s.startsWith("g"));
		System.out.println(s.describeConstable());
		System.out.println(s.length());
				
		
		var nome = "Sebastian";
		var sobrenome = "Allen";
		var idade = 26; 
		var salario = 3450.00;
		
		// We use the printf function wich is used for formated texts
		System.out.printf("Nome: %s %s %d %.2f", nome, sobrenome, idade, salario ); // %s = string, %d = double, %f = float (.2 = casa decimal)
	}

}
