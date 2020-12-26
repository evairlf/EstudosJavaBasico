package estudos.aula37;

public abstract class Animal {
private String nome;
private String nomeCientifico;
private double comprimento;
private int patas = 4;
private String cor;
private String ambiente;
private double velocidade;
private String tipo;

public Animal() {}


public Animal(String nome, double comprimento, String cor, String ambiente, double velocidade) {
	this.nome = nome;
	this.comprimento = comprimento;
	this.cor = cor;
	this.ambiente = ambiente;
	this.velocidade = velocidade;
}


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getComprimento() {
	return comprimento;
}

public void setComprimento(double comprimento) {
	this.comprimento = comprimento;
}

public int getPatas() {
	return patas;
}

public void setPatas(int patas) {
	this.patas = patas;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getAmbiente() {
	return ambiente;
}

public void setAmbiente(String ambiente) {
	this.ambiente = ambiente;
}

public double getVelocidade() {
	return velocidade;
}

public void setVelocidade(double velocidade) {
	this.velocidade = velocidade;
}



public String getNomeCientifico() {
	return nomeCientifico;
}


public void setNomeCientifico(String nomeCientifico) {
	this.nomeCientifico = nomeCientifico;
}




public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


@Override
public String toString() {
	return "\n-------------------------\nNome: " + getNome() + "\nNome Cientifico: " +getNomeCientifico() +"\nComprimento: " + getComprimento() +"cm"+ "\nPatas: " + patas
	+ "\nCor: " + getCor() + "\nAmbiente: " + getAmbiente() + "\nVelocidade: " + getVelocidade()+"m/s";
}


}