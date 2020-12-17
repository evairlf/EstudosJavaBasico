package estudos.aula17;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os 2 numeros inteiros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = 0;
		
		for(int i = num1+1;i<num2;i++) {
			
			System.out.print(i+"-");
			
			soma += i;
				
		}
		System.out.println("Soma: "+soma);
	}

}
