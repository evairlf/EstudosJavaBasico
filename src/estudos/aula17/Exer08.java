package estudos.aula17;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 números inteiros: ");
		int[] num = new int[5];
		int soma = 0;
			
		for(int i = 0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0;i<num.length;i++) {
			soma += num[i];
			}
		int media = soma/num.length;
		
		System.out.println("A soma é: "+soma);
		System.out.println("A média é: "+media);
	}
}