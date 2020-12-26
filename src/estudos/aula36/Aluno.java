package estudos.aula36;

import java.util.Arrays;

public class Aluno {
private String nome;
private int matricula;
private double[] notas = new double[4];

public Aluno() {}

public Aluno(String nome, int matricula, double[] notas) {
	this.nome = nome;
	this.matricula = matricula;
	this.notas = notas;
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
public double[] getNotas() {
	return notas;
}

public boolean verificaAprovado() {
	double soma = 0;
	for(int i = 0;i<notas.length;i++) {
		soma += notas[i];
	}
	if(soma / notas.length >= 7) {
		return true;
	}else {
		return false;
	}
}

public void setNotas(double[] notas) {
	this.notas = notas;
}

public String verAprovado() {
	if(verificaAprovado()) {
		return "Aprovado!";
	}
	return "Reprovado!";
}

@Override
public String toString() {
	return "\nNome: " + this.nome + "\nMatricula: " + this.matricula + "\nNotas:" + Arrays.toString(notas)+verAprovado();
}


}