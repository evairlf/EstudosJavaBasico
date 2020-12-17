package estudos.aula17;

import java.util.Scanner;

public class Exerc28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número Inteiro: ");
		int numInt = sc.nextInt();
		boolean sair = false;
		for(int i = 2;i<numInt;i++) {
			
			if(numInt%i==0) {
				sair = true;
			}
		}
		if(sair == true) {
			System.out.println("Não é um numero primo!");
		}else {
			System.out.println("É um numero Primo!");
		}

	}

}
