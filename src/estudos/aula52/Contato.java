package estudos.aula52;

public class Contato {
private String nome;
private int ddd;
private int telefone;
private int identificador;

Contato(){
	
}



public Contato(String nome, int ddd, int telefone) {
	this.nome = nome;
	this.ddd = ddd;
	this.telefone = telefone;
}



public String getNome() {
	return nome;
}

public void setNome(String nome) {
	try {
	this.nome = nome;
	}catch(Exception exc){
		System.out.println(exc.getMessage());
	}
}

public int getDdd() {
	return ddd;
}

public void setDdd(int ddd) {
	this.ddd = ddd;
	
	
}

public int getTelefone() {
	return telefone;
}

public void setTelefone(int telefone) {
	try {
		this.telefone = telefone;
	}catch(Exception exc) {
		System.out.println(exc.getMessage());
	}
	
	
	
}





public int getIdentificador() {
	return identificador;
}

public void setIdentificador(int identificador) {
	this.identificador = identificador;
}

@Override
public String toString() {
	return "\nNome: " + this.nome + "\nDDD: " + ddd + "\nTelefone: " +"("+ ddd + ")" + telefone + "\nIdentificador: " + identificador;
}

}