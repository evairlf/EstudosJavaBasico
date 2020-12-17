package estudos.aula17;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para fazer o fatorial: ");
		int fatorial = sc.nextInt();
		System.out.println("Fatorial de "+fatorial+"! ");
		
		for(int i = fatorial-1;i>1;i --) {
			fatorial = fatorial*i;
			System.out.println(fatorial);
		}
		

	}

}
