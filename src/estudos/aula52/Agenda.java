package estudos.aula52;

import java.util.Arrays;

public class Agenda {
	private int contador;

	private String nome;
	private Contato[] contatos;
	
	Agenda(){
		contatos = new Contato[10];
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
	
	public int contatorContato() {
		contador++;
		return contador;
	}

	@Override
	public String toString() {
		return "Agenda [contador=" + contador + ", nome=" + nome + ", contatos=" + Arrays.toString(contatos) + "]";
	}
	
	
}