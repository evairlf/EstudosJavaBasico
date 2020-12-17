package estudos.aula17;

import java.util.Scanner;

public class Exerc29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero max para verificação: ");
		int numInt = sc.nextInt();
		boolean primo;
		
		for(int i = 1;i<=numInt;i++) {
		
			primo = true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					primo = false;
				}
			}
			if(primo) {
				System.out.print(" "+i);
			}
		
		}
	}
	}