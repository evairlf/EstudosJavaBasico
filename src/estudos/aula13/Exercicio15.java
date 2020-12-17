package estudos.aula13;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		double pesoIdeal = (72.7*altura)-58;
		System.out.printf("Seu peso Ideal é: %.2f KG",pesoIdeal);
	}

}
