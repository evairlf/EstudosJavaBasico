package estudos.aula15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double num2 = sc.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		double num3 = sc.nextDouble();
		
		if(num1 <= num2 && num1<=num3) {
			System.out.printf("voce deve comprar o de: %.2fR$",num1);
		}else if(num2<=num1 && num2<=num3) {
			System.out.printf("voce deve comprar o de: %.2fR$",num2);
		}else if(num3<=num1 && num3<=num2) {
			System.out.printf("voce deve comprar o de: %.2fR$",num3);
	}else {
			System.out.println("Existem números iguais impossivel determinar o menor deles!");
	}
	}

}
