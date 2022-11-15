package classe;

public class Null {
	public static void main(String[] args) {
		// Null é um valor padrão para variáveis não-locais
		
		// retorno null
		String s1 = null;
		System.out.println(s1);
		
		// PointerException = não consegue alterar o null
		/*Data d1 = null; 
		d1.mês = 3;
		System.out.println(d1);*/
		
		//Concatenando espaço vazio
		String s2 = "";
		System.out.println(s2.concat("+-*/"));
		
		//Concatenando com null
		String s3 = Math.random() > 0.5 ? "opa" : null;
		if (s3 != null) {
		System.out.println(s3.concat("!!!!"));
		}
	}
	
	
}
