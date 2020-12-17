package estudos.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		int num2 = sc.nextInt();
		
		System.out.println("O que deseja fazer? 1-Para Subtração, 2-Para Adição");
		int confirmacao = sc.nextInt();
		do {
		
		switch(confirmacao) {
		
		case 1: System.out.println("Resultado da Subtração é: "+(num1-num2));
		calculaSub(num1,num2);	break;
		case 2: System.out.println("Resultado da Adição é: "+(num1+num2));
		calculaAdd(num1,num2);break;
		default: System.out.println("Opção invalida!");continue;
		}
		
		}while(confirmacao != 1 && confirmacao != 2);
		
	}
		public static void calculaAdd(int num1,int num2) {
			
			int add = num1+num2;
			if(add%2==1 && add<0) {
				System.out.println("impar Negativo!");
			}else if(add %2==0 && add<0) {
				System.out.println("Par Negativo!");	
			}else if(add %2==1 && add>0) {
				System.out.println("Impar Positivo!");
			}else if(add %2==0 && add>0) {
				System.out.println("Par Positivo!");
		}else {
			System.out.println("Numero 0");
		}
		}
			public static void calculaSub(int num1,int num2) {
				
				int sub = num1-num2;
				
				if(sub %2==1 && sub<0) {
					System.out.println("impar Negativo!");
				}else if(sub %2==0 && sub<0) {
					System.out.println("Par Negativo!");	
				}else if(sub %2==1 && sub>0) {
					System.out.println("Impar Positivo!");
				}else if(sub %2==0 && sub>0) {
					System.out.println("Par Positivo!");
			}else {
				System.out.println("Numero 0");
			}
			}
}