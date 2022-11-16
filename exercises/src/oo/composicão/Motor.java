package oo.composicão;

public class Motor {
	
	boolean ligado = false; // Declara funcionamento
	double fatorInjecao = 1; // Declara o número do fator
	
	int giros() {  // Calcula o nº de giros
		if(!ligado) { 
			return 0;
		} else {
		return (int) Math.round(fatorInjecao * 3000);
		}
	} // Se não estiver ligado, retorna zero, else, retorna cálculo de giros
	
}
