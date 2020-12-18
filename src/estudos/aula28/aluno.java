package estudos.aula28;

import java.util.ArrayList;
import java.util.Scanner;

public class aluno {
	Scanner sc = new Scanner(System.in);
private String nome;
private int matricula;
private String curso;
private String[] disciplinas = new String[3];
private double[][] notas = new double[3][3];;
public aluno() {}

public aluno(String nome,int matricula,String curso) {
	
	this.nome = nome;
	this.matricula = matricula;
	this.curso = curso;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public String getCurso() {
	return curso;
}

public void setCurso(String curso) {
	this.curso = curso;
}

public String[] getDisciplinas() {
	
	return disciplinas;
}

public void setDisciplinas() {
	
	for(int i = 0;i<disciplinas.length;i++) {
		System.out.println("Digite o nome da "+(i+1)+"º Disciplina: ");
		disciplinas[i] = sc.nextLine();
	}
}

public double[][] getNotas() {
	return notas;
}

public void setNotas(double[][] notas,int linha,int coluna) {
	this.notas = notas;
}

public void verificaAprovacao(double[][] notas) {
	
	for(int i = 0;i<notas.length;i++) {
		double soma = 0;
		for(int j = 0;j<notas[i].length;j++) {
			soma += notas[i][j];
		}
		if(soma/notas.length >= 7) {
		System.out.println("passou na Materia: "+disciplinas[i]);
	}else {
		System.out.println("Reprovou na Materia: "+disciplinas[i]);
	}
	}
}

}