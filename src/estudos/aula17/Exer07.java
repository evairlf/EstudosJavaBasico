package estudos.aula17;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 números inteiros: ");
		int[] num = new int[5];
		
		for(int i = 0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		int maior = -1;
		
		for(int i = 0;i<num.length;i++) {
			if(num[i]>maior) {
			maior = num[i];
			}
		}
		System.out.println("O maior número é: "+maior);
	}

}
