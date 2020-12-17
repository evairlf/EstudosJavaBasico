package estudos.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero negativo ou positivo: ");
		int num1 = scan.nextInt();
		if(num1 < 0) {
			System.out.println("O número é negativo!");
		}else if(num1 == 0) {
			System.out.println("Numero é 0");
		}else {
			System.out.println("o numero é positivo!");
		}

	}

}
