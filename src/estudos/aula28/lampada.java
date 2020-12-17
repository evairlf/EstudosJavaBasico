package estudos.aula28;

public class lampada {
private String nome;
private String tipo;
private String modelo;
private String marca;
private int potencia;
private double valor;
private boolean ligada;

public lampada() {}

public lampada(String nome,String tipo,String modelo,String marca,int potencia,double valor) {
	this.nome = nome;
	this.tipo = tipo;
	this.modelo = modelo;
	this.marca = marca;
	this.potencia = potencia;
	this.valor = valor;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTipo() {
	return tipo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getmodelo() {
	return modelo;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getMarca() {
	return marca;
}

public void setPotencia() {
	this.potencia = potencia;
}

public int getPotencia() {
	return potencia;
}

public void setValor() {
	this.valor = valor;
}

public double getValor() {
	return valor;
	
}

public void setLigada(boolean ligada) {
	ligada = ligada;
}

public void ligaDesliga() {
	if(ligada) {
		System.out.println("A lampada foi desligada!");
		ligada = false;
	}else {
		System.out.println("A lampada foi ligada!");
		ligada = true;
	}
}

public boolean getLigada() {
	return ligada;
}
}
