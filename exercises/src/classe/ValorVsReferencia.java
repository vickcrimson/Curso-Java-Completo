package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referência
		
		d1.dia = 31; // alterando valores
		d2.mês = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.dataFormatadaAlt());
		
		allReset(d1);
		
		System.out.println(d1.dataFormatadaAlt());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5; // por se tratar de uma cópia o "++" não afeta o valor 
		changePrimal(c);
		System.out.println(c);
	
}
	static void allReset(Data d) {
		d.dia = 1;
		d.mês = 1;
		d.ano = 1970;
	}
	static void changePrimal(int a) {
		a++;
	}
}