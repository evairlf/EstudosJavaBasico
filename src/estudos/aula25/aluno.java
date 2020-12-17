package estudos.aula25;

import java.util.Scanner;

public class aluno {
	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplina = new String[3];
	private double[] notas = new double[3];
	Scanner sc = new Scanner(System.in);

	public aluno(String nome, int matricula, String curso, String disciplina, String disciplina1, String disciplina2,
			double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplina[0] = disciplina;
		this.disciplina[1] = disciplina1;
		this.disciplina[2] = disciplina2;
		this.notas[0] = nota1;
		this.notas[1] = nota2;
		this.notas[2] = nota3;

	}

	public void mudarNome() {
		System.out.println("Digite o nome: ");
		this.nome = sc.nextLine();
	}

	public void mudarMatricula() {
		System.out.println("Digite a nova matricula: ");
		this.matricula = sc.nextInt();
	}

	public void mudarCurso() {
		System.out.println("Digite o curso: ");
		this.curso = sc.nextLine();
		this.curso = sc.nextLine();
	}

	public void setarDisciplinas() {
		for (int i = 0; i < disciplina.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º Disciplina: ");
			disciplina[i] = sc.nextLine();

		}
	}

	public void setarNotas() {
		for (int i = 0; i < disciplina.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º Nota: ");
			notas[i] = sc.nextDouble();

		}
	}

	public void passouOuNao() {
		double totalNota = 0;
		double media;
		for (int i = 0; i < disciplina.length; i++) {
			totalNota += notas[i];

		}
		media = totalNota / notas.length;
		if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

	public void verDisciplinas() {
		for (int i = 0; i < disciplina.length; i++) {
			System.out.println((i + 1) + "º Disciplina: " + disciplina[i]);

		}
	}

	public String verNome() {
		System.out.println("Nome: " + nome);
		return nome;
	}

	public int verMatricula() {
		System.out.println("Matricula: " + matricula);
		return matricula;
	}

	public String verCurso() {
		System.out.println("Curso: " + curso);
		return curso;
	}

}