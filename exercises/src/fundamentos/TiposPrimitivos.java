package fundamentos;

public class TiposPrimitivos {
public static void main(String[] args) {
	//Dados de Funcionários
	
	//Tipos Numéricos inteiros
	byte anosDeEmpresa = 23;
	short numeroDeVoos = 542;
	int id = 4879;
	long pontosAcumulados = 3_234_457_120L;
	
	//Tipo número real
	float wage = 10_140.32F;
	double vendasAcumuladas = 2_911_797_103.01;
	
	//Boolean
	boolean vacations = false;
	
	//Char
	char status = 'V';
	
	// Dias de empresa
	System.out.println(anosDeEmpresa * 365);
	//Número de Viagens
	System.out.println(numeroDeVoos/2);
	//Pontos por Real
	System.out.println(pontosAcumulados/vendasAcumuladas);
	
	System.out.println(id + ": ganha =" + wage);
	System.out.println("Férias? " + vacations);
	System.out.println("status: " + status);
	
}
}
