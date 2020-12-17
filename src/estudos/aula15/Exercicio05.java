package estudos.aula15;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double verifica = (nota1+nota2)/2;
		
		if(verifica == 10) {
		System.out.println("Aprovado com Distinção!");
		}else if(verifica < 7) {
			System.out.println("Reprovado!");
		}else if(verifica >= 7) {
			System.out.println("Aprovado!");
		}
		
		

	}
	}
