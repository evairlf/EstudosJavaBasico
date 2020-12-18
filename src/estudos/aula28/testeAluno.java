package estudos.aula28;

import java.util.Scanner;

public class testeAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		aluno aluno = new aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.setNome(sc.nextLine());
		System.out.println("Digite o Matricula do dito cujo: ");
		aluno.setMatricula(sc.nextInt());
		System.out.println("Digite o curso do aluno: ");
		aluno.setCurso(sc.next());
		aluno.setDisciplinas();
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Matricula Nº: " + aluno.getMatricula());
		System.out.println("Curso: " + aluno.getCurso());
		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			System.out.println(" " + aluno.getDisciplinas()[i]);
		}
		double notas[][] = new double[aluno.getNotas().length][aluno.getNotas().length];

		for (int i = 0; i < aluno.getNotas().length; i++) {
			System.out.println("Digite a nota para a disciplina: " + aluno.getDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotas()[i].length; j++) {
				System.out.println("Digite a " + (1 + j) + "º Nota: ");
				notas[i][j] = sc.nextDouble();
				aluno.setNotas(notas, i, j);

			}
		}

		for (int i = 0; i < aluno.getNotas().length; i++) {
			System.out.println("Nota " + (i + 1) + "º Matéria");
			for (int j = 0; j < aluno.getNotas()[i].length; j++) {
				System.out.println("" + aluno.getNotas()[i][j]);
			}
		}
		aluno.verificaAprovacao(notas);
	}

}