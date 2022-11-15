package classe;

public class Usuario {
	//Declaramos as propriedades
	String nome;
	String email;
		
	// Faremos a conversão do endereço de memória para o .equals
	// ser capaz de identificar a igualdade 

public boolean equals(Object obj) {
	
	if(obj instanceof Usuario){
	
	Usuario outro = (Usuario) obj;
	
	boolean nomeIgual = outro.nome.equals(this.nome);
	boolean emailIgual = outro.email.equals(this.email);
	
	return nomeIgual && emailIgual;
	}else {
		return false;
	}
		
}	
}


//hashcode será implementado futuramente