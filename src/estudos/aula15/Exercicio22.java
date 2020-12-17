package estudos.aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kgMorango = 2.50;
		double kgMaca = 1.80;

		System.out.println("O que voce deseja comprar? Maçã ou Morango");
		String fruta = sc.next();
		if (fruta.equalsIgnoreCase("maca") || fruta.equalsIgnoreCase("Maça")) {
			System.out.println("Quantos KG deseja comprar?");
			int qtd = sc.nextInt();
			double valor = qtd * kgMaca;

			if (qtd > 8 || valor > 25.00) {
				System.out.printf("O valor por KG acima de 5kg é RS1,50 kg.\nValor a ser pago: %.2f",
						((qtd * 1.50)-(qtd * 1.50) * 0.1));
			} else if (qtd > 5) {
				System.out.printf("O valor por KG acima de 5kg é RS1,50 kg.\nValor a ser Pago: %.2f", (qtd * 1.50));
			} else {
				System.out.printf("O valor abaixo de 5KG é RS1,80 kg.\nValor a ser Pago: %.2f", valor);
			}
		} else if (fruta.equalsIgnoreCase("M") || fruta.equalsIgnoreCase("morango")) {
			System.out.println("Quantos KG deseja comprar?");
			int qtd = sc.nextInt();
			double valor = qtd * kgMorango;

			if(qtd > 8 || valor > 25.00) {
				System.out.printf("O valor por KG acima de 5kg é RS2,20-kg.\nValor a ser pago: %.2f",((qtd * 2.20)-(qtd * 2.20) * 0.1));
			} else if (qtd > 5) {
				System.out.printf("O valor por KG acima de 5kg é RS2,20-kg.\nValor a ser Pago: %.2f", (qtd * 2.20));
			} else {
				System.out.printf("O valor abaixo de 5KG é 2,50-kg.\nValor a ser Pago: %.2f", valor);
			}
		}

	}
}
