package estudos.aula17;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int inteiro = sc.nextInt();
		if(exx.ePrimo(inteiro)==false) {
			System.out.println(inteiro+" Não é primo!");
		}else {
			System.out.println(inteiro+" É Primo!");
		}
		
	}
	
}