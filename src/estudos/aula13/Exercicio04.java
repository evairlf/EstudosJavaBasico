package estudos.aula13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira Nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a Segunda Nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a Terceira Nota: ");
		double nota3 = sc.nextDouble();
		System.out.println("Digite a Quarta Nota: ");
		double nota4 = sc.nextDouble();
		double media = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("Sua m�dia �: %.1f",media);
		}
	}