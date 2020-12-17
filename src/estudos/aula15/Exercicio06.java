package estudos.aula15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("O maior número é: "+num2);
		}else if(num3>num1 && num3>num2) {
			System.out.println("O maior número é: "+num3);
		}else {
			System.out.println("Os números sao iguais");
		}
		if(num1 <= num2 && num1<=num3) {
			System.out.println("O menor número é: "+num1);
		}else if(num2<=num1 && num2<=num3) {
			System.out.println("O menor número é: "+num2);
		}else if(num3<=num1 && num3<=num2) {
			System.out.println("O menor número é: "+num3);
	}else {
			System.out.println("Existem números iguais impossivel determinar o menor deles!");
	}

}
}
