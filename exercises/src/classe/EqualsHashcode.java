package classe;

public class EqualsHashcode {
 public static void main(String[] args) {
	Usuario user1 = new Usuario();
	user1.nome = "Cleyto Rasta";
	user1.email = "Cabecadegelo@hotmail.com";
			
	Usuario user2 = new Usuario();
	user1.nome = "Cleyto Rasta";
	user1.email = "Cabecadegelo@hotmail.com";
	
	System.out.println(user1 == user2);
	System.out.println(user1.equals(user2));
	System.out.println(user2.equals(user1));
 }
}
