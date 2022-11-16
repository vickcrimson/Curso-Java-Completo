package oo.composicão;

public class CarroTeste {
public static void main(String[] args) {
	
	Carro car = new Carro();
	System.out.println(car.estaLigado()); 
	//Checar se o carro está ligado
	
	car.ligar();
	System.out.println(car.estaLigado());
	//Ligando o carro
	
	System.out.println(car.motor.giros());
	//Acessar número de giros
	
	car.acelerar();
	car.acelerar();
	car.acelerar();
	car.acelerar();
	car.acelerar();
	//Acelerando o carro
	
	System.out.println(car.motor.giros());
	//Acessar número de giros
	
	//Para evitar que o valor de giros seja alterado diretamento no código +
	//faltou encapsulamento
}
	
}
