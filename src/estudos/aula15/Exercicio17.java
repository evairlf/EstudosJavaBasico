package estudos.aula15;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();
		
		if(ano %4==0 && ano %100!=0 || ano %400==0) {
			System.out.println("O ano � bissexto!");
		}else {
			System.out.println("N�o � um ano bissexto!");
		}

	}

}
