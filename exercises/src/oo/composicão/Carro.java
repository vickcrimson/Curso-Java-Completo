package oo.composicão;

public class Carro {

	Motor motor = new Motor (); // Instanciando um motor no carro
	
	void acelerar() { // Criar metódo de acelerar o motor com limites
		if(motor.fatorInjecao < 2.6) {
		motor.fatorInjecao += 0.4;
		}
	} 
	
	void frear() { // Criar metodo de frear com limites
		if(motor.fatorInjecao > 0.5) {
		motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar( ) { // Metódo ligar carro
		motor.ligado = true;
	}
	
	void desligar( ) { // Metódo desligar carro
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}


