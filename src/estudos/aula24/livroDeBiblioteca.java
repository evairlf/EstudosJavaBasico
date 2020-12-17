package estudos.aula24;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class livroDeBiblioteca {
	private String nome, autor, editora, tipo;
	private Date dataDeLocacao;
	private Date dataDeDevolucao;
	SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yy");
	
	public livroDeBiblioteca(String nome, String autor, String editora, String tipo,String dataDeLoca,String dataDeDevolu) throws Exception{
		
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.tipo = tipo;
		this.dataDeDevolucao = setDataDevolucao(dataDeDevolu);
		this.dataDeLocacao = setDataDeLoc(dataDeLoca);
		
	}

	public void exibirDados() {
		System.out.println("nome: " + nome);
		System.out.println("autor: " + autor);
		System.out.println("Editora: " + editora);
		System.out.println("Tipo: " + tipo);
		System.out.println("Data de Locacao: "+ formato.format(dataDeLocacao));
		System.out.println("Data de Devolucao:  "+ formato.format(dataDeDevolucao));
	}
	public Date setDataDevolucao(String data) throws Exception {
		Date dataDeDevolucao = formato.parse(data);
		return dataDeDevolucao;
	}
	public Date setDataDeLoc(String dataDeLoc) throws Exception {
		Date dataDeDevolucao = formato.parse(dataDeLoc);
		return dataDeDevolucao;
	}
}