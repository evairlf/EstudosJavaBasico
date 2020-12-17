package estudos.aula13;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("qual a altura ou largura do quadrado?");
		int lado = sc.nextInt();
		int soma = (int) Math.pow(lado,2)*2;
		System.out.println("o Tamanho da area do quadrado x2 é: "+soma);
	}

}
