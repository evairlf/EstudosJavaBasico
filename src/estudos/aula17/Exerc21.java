package estudos.aula17;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas turmas deseja registrar?");
		int turmas = sc.nextInt();
		int media = 0;
		int resultado;

		for (int i = 0; i < turmas; i++) {
			System.out.print("Digite a quantidade de alunos da " + (i + 1) + "º Turma: ");
			int agora = sc.nextInt();
			if (agora <= 40) {
				media += agora;
			} else {
				System.out.println("O numero max de alunos por turma é 40");
				i--;
			}	
		}
		resultado = media/turmas;
		System.out.println("O número médio de alunos por turma é : "+resultado);
	}
}
