package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = Cº
		// Utilize duas contantes e duas variáveis para criar um programa que converta de Fahrenheit para Celsius:
		final double Constante1 = 32;
		final double Constante2 = 5.0/9.0;
		double Fahrenheit = 80;
		double Celsius = (Fahrenheit - Constante1) * Constante2;
				
 		System.out.println(Fahrenheit + "F is equal to " + Celsius + "C") ;
	}
}
