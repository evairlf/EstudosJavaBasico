package estudos.aula36;

import java.util.Arrays;

public class Curso {
private String nome;
private String horario;
private Professor professor = new Professor();
private Aluno[] alunos;
@Override
public String toString() {
	return "Curso:" + nome + "\nHorario: " + horario +"\n-----------"+"\nProfessor: " + professor + "\nAlunos: "
			+ Arrays.toString(alunos);
}
public Professor getProfessor() {
	return professor;
}
public void setProfessor(Professor professor) {
	this.professor = professor;
}
public Aluno[] getAlunos() {
	return alunos;
}
public void setAlunos(Aluno[] alunos) {
	this.alunos = alunos;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getHorario() {
	return horario;
}
public void setHorario(String horario) {
	this.horario = horario;
}


}
