package estudos.aula13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos graus Fahrenreit estão agora para serem convertidos para Celsius: ");
		double graus = sc.nextDouble();
		double celsius = (5*(graus-32)/9);
		System.out.printf("A temperatura atual é de: %.2f",celsius,"C°");
	}

}
