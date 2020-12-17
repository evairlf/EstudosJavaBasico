package estudos.aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		
		if(num1 %2==0) {
			System.out.println("Numero par!");
		}else {
			System.out.println("Numero impar!");
		}
		
	}

}
