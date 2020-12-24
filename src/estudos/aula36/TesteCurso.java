package estudos.aula36;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteCurso {

	public static void main(String[] args) {
		LocalDate loc = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		Curso curso = new Curso();
		Aluno[] alun = new Aluno[5];
		Professor prof = new Professor();
		
		
		System.out.println("Digite o nome do curso:");
		curso.setNome(sc.nextLine());
		System.out.println("Digite o horario do curso:");
		curso.setHorario(sc.nextLine());
		System.out.println("Digite o nome do professor:");
		prof.setNome(sc.nextLine());
		System.out.println("Digite o email do professor:");
		prof.setEmail(sc.nextLine());
		System.out.println("Digite o departamento do professor:");
		prof.setDepartamento(sc.nextLine());
		curso.setProfessor(prof);
		
		double[] notas;
		for(int i = 0;i<alun.length;i++) {
			Aluno a = new Aluno();
			System.out.println("Digite o nome do "+(i+1)+"º Aluno: ");
			String nome = "";
			nome += sc.nextLine();
			nome += sc.nextLine();
			a.setNome(nome);
			System.out.println("Digite a matricula do "+(i+1)+"º Aluno: ");
			a.setMatricula(sc.nextInt());
			System.out.println("Digite as Notas: ");
			notas = new double[4];
			for(int j = 0;j<a.getNotas().length;j++) {
				System.out.println("Digite a "+(j+1)+"º Nota: ");
				notas[j] = sc.nextDouble();
			}
			a.setNotas(notas);
			if(alun != null) {
			alun[i] = a;
			}
		}
		curso.setAlunos(alun);
		System.out.println(curso.toString());
		System.out.println("Resumo gerado: "+loc);
	}

}
