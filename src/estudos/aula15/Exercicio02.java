package estudos.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero negativo ou positivo: ");
		int num1 = scan.nextInt();
		if(num1 < 0) {
			System.out.println("O n�mero � negativo!");
		}else if(num1 == 0) {
			System.out.println("Numero � 0");
		}else {
			System.out.println("o numero � positivo!");
		}

	}

}
