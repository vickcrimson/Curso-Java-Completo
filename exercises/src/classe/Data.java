package classe;

public class Data {
	
	int dia;
	int mês; 
	int ano;
	
	
	Data(){
		//dia = 01;
		//mês = 01;
		//ano = 1970;
		this(1, 1, 1970); // This utilizado como método para chamar um construtor
	}
	
	Data(int dia, int mesPadrao, int anoPadrao) { // this = referencia o objeto utilizado no momento, em outras palavras permite que o metódo acesse outros atributos
		// da instância. Não pode ser utilizado em métodos estáticos. 
		
		// Geralmente é utilizado para resolver conflitos entre parâmetro e atributo.
		this.dia = dia;
		mês = mesPadrao;
		ano = anoPadrao;
	}
	
	
	String obterDataFormatada() {
		return dia + "/" + mês + "/" + ano;
		
	}
	
	String dataFormatadaAlt() {
		String formato = "%d/%d/%d\n"; // váriavel local que pertence à esse escopo/bloco
		return String.format(formato, dia, mês, ano);
	}
}
