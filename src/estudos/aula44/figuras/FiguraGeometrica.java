package estudos.aula44.figuras;

public abstract class FiguraGeometrica {
private String nome;
private String tipo;
private String cor;



public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
@Override
public String toString() {
	return "\nNome: " + nome + "\nCor: " + cor;
}


}