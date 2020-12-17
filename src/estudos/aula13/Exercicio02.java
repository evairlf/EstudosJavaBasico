package estudos.aula13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um Número: ");
			int numero = scan.nextInt();
System.out.println("o numero digitado foi: " + numero);
		}
}
}