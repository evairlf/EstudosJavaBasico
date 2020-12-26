package estudos.aula36;

import java.util.Iterator;

public class Agenda  {
private String nome;
private Contato[] contatos;


public Agenda() {}

public Agenda(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Contato[] getContatos() {
	return contatos;
}

public void setContatos(Contato[] contatos) {
	this.contatos = contatos;
}

public String exibeInformacao() {
	String informacao = "Nome da Agenda: "+getNome()+"\n";
	for(Contato c : contatos) {
		informacao += c.toString();
	}
	return informacao;
	
}


}