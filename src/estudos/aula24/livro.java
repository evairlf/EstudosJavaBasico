package estudos.aula24;

public class livro {
	private String nome, autor, editora, tipo;

	public livro(String nome, String autor, String editora, String tipo) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.tipo = tipo;
	}

	public void exibirDados() {
		System.out.println("nome: " + nome);
		System.out.println("autor: " + autor);
		System.out.println("Editora: " + editora);
		System.out.println("Tipo: " + tipo);
	}
}