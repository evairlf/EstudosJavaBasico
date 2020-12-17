package estudos.aula13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos metros deseja converter: ");
		double metros = sc.nextDouble();
		double convers = metros * 100;
		System.out.println(metros + "M convertidos para CM são: " + convers);
	}

}