package estudos.aula24;

import java.text.DecimalFormat;

public class livroDeLivraria {
	private String nome, autor, editora, tipo;
	private double valor;
	
	public livroDeLivraria(String nome, String autor, String editora, String tipo,double valor) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.tipo = tipo;
		this.valor = valor;
		
	}

	public void exibirDados() {
		DecimalFormat dc = new DecimalFormat("###.##");
		System.out.println("nome: " + nome);
		System.out.println("autor: " + autor);
		System.out.println("Editora: " + editora);
		System.out.println("Tipo: " + tipo);
		System.out.println("Valor: "+ dc.format(valor));
	}
}