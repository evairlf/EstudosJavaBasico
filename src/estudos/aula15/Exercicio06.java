package estudos.aula15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero �: "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("O maior n�mero �: "+num2);
		}else if(num3>num1 && num3>num2) {
			System.out.println("O maior n�mero �: "+num3);
		}else {
			System.out.println("Os n�meros sao iguais");
		}
		if(num1 <= num2 && num1<=num3) {
			System.out.println("O menor n�mero �: "+num1);
		}else if(num2<=num1 && num2<=num3) {
			System.out.println("O menor n�mero �: "+num2);
		}else if(num3<=num1 && num3<=num2) {
			System.out.println("O menor n�mero �: "+num3);
	}else {
			System.out.println("Existem n�meros iguais impossivel determinar o menor deles!");
	}

}
}
