package estudos.aula15;

import java.util.Scanner;

public class Exercicio08_9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int num3 = sc.nextInt();
		
		//Exercicio 8
		if(num1 <= num2 && num1 <=num3 && num2 <= num3) {
			System.out.println("A ordem decrescente é: "+num3+"-"+num2+"-"+num1);
		}else if(num1 <= num2 && num1 <=num3 && num3 <= num2) {
			System.out.println("A ordem decrescente é: "+num2+"-"+num1+"-"+num3);
	    }else if(num2 <= num1 && num2 <=num3 && num3 <= num1) {
		System.out.println("A ordem decrescente é: "+num1+"-"+num3+"-"+num2);
	    }else if(num2 <= num1 && num2 <=num3 && num3 <= num1) {
		System.out.println("A ordem decrescente é: "+num1+"-"+num2+"-"+num3);
	    }else if(num3 <= num1 && num3 <=num2 && num2 <= num1) {
			System.out.println("A ordem decrescente é: "+num1+"-"+num2+"-"+num3);
	    }else if(num3 <= num1 && num3 <=num2 && num1 <= num2) {
			System.out.println("A ordem decrescente é: "+num2+"-"+num1+"-"+num3);
}
		//Exercicio 9
		if(num1 <= num2 && num1 <=num3 && num2 <= num3) {
			System.out.println("A ordem crescente é: "+num1+"-"+num2+"-"+num3);
		}else if(num1 <= num2 && num1 <=num3 && num3 <= num2) {
			System.out.println("A ordem crescente é: "+num3+"-"+num1+"-"+num2);
	    }else if(num2 <= num1 && num2 <=num3 && num3 <= num1) {
		System.out.println("A ordem crescente é: "+num2+"-"+num3+"-"+num1);
	    }else if(num2 <= num1 && num2 <=num3 && num3 <= num1) {
		System.out.println("A ordem crescente é: "+num3+"-"+num2+"-"+num1);
	    }else if(num3 <= num1 && num3 <=num2 && num2 <= num1) {
			System.out.println("A ordem crescente é: "+num3+"-"+num2+"-"+num1);
	    }else if(num3 <= num1 && num3 <=num2 && num1 <= num2) {
			System.out.println("A ordem crescente é: "+num3+"-"+num1+"-"+num2);
}
	}
}
