package estudos.aula52;

import java.util.Arrays;

public class Agenda {
	private static int contador;

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
	
	public Contato getContato(int i) {
		return contatos[i];
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public static int contadorContato() {
		contador++;
		return contador;
	}

	public static int getContador() {
		contadorContato();
		return contador;
	}


	@Override
	public String toString() {
		return "Agenda :"+ getNome() + "\n"+ Arrays.toString(contatos).replace("[", "").replace("]", "").replace(",", "\n------------------------\n");
	}
	
	
}