package estudos.aula25;

public class testeAluno {

	public static void main(String[] args) {
		aluno aluno = new aluno(null, 0, null, null, null, null, 0, 0, 0);
		//mudar valores
		aluno.mudarNome();
		aluno.mudarMatricula();
		aluno.setarDisciplinas();
		aluno.setarNotas();
		//Ver os valores
		aluno.verNome();
		aluno.verMatricula();
		aluno.verCurso();
		aluno.verDisciplinas();
		aluno.passouOuNao();
	}

}
