package classe;

public class DataTeste {
public static void main(String[] args) {

		Data d1 = new Data();
	d1.dia = 18;
	d1.mês = 9;
	d1.ano = 2022;

		var d2 = new Data();
	d2.dia = 17;
	d2.mês = 05;
	d2.ano = 1999;
	
		Data d3 = new Data();
		
		var d4 = new Data(11,9,2001);
	
	System.out.println(d1.dia + "/" + d1.mês + "/" + d1.ano);
	System.out.println(d2.dia + "/" + d2.mês + "/" + d2.ano);
	System.out.println(d2.obterDataFormatada());
	System.out.println(d1.dataFormatadaAlt());
	System.out.println(d3.dataFormatadaAlt());
	System.out.println(d4.dataFormatadaAlt());
}
	


}
