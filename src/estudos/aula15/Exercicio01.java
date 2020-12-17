package estudos.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.println("O maior número é: "+num1);
		}else {
			System.out.println("O maior número é: "+num2);
		}
		

	}

}
