package estudos.aula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		boolean pergunta = false;
		Scanner sc = new Scanner(System.in); 
		System.out.printf("Temos 3 tipos de carne:\nFilé Duplo: Até 5k RS4,90kg Apartir de 5kg RS5,80kg"
				+ "\nAlcatra Até 5kg RS5,90kg Apartir de 5k RS6,80kg"
				+ "\nPocanha Até 5kg RS6,90kg Apartir de 5k RS 7,80kg");
		System.out.println("O que deseja comprar?");
		
		do {
			String tipo = sc.next();
			sc.next();
			if(tipo.equalsIgnoreCase("File")||tipo.contentEquals("duplo")) {
				System.out.println("Digite quantos KG voce quer comprar");
				double kg = sc.nextDouble();
				System.out.println("Como deseja pagar?");
				String pagamento = sc.next();
				if(kg < 5) {
					if(pagamento.equalsIgnoreCase("cartao")||pagamento.equalsIgnoreCase("cartão")) {
						System.out.printf("Nota Fiscal: \nFile Duplo: %.1fKG\nDesconto: %.2f\nTipo de Pagamento: Cartão Tabajara\nValor a ser Pago: %.2f",kg,(kg*4.9)*0.5,(kg*4.9)-(kg*4.9)*0.5);
					}else {
						System.out.printf("Nota Fiscal: \nFile Duplo: %.1fKG\nTipo de Pagamento: Dinheiro\nValor a ser Pago: %.2f",kg,(kg*4.9)-(kg*4.9)*0.5);
					}
				}else if(kg > 5) {
					if(pagamento.equalsIgnoreCase("cartao")||pagamento.equalsIgnoreCase("cartão")) {
						System.out.printf("Nota Fiscal: \nFile Duplo: %.1fKG\nDesconto: %.2f\nTipo de Pagamento: Cartão Tabajara\nValor a ser Pago: %.2f",kg,(kg*5.8)*0.5,(kg*5.8)-(kg*5.8)*0.5);
					}else {
						System.out.printf("Nota Fiscal: \nFile Duplo: %.1fKG\nTipo de Pagamento: Dinheiro\nValor a ser Pago: %.2f",kg,(kg*5.8)-(kg*5.8)*0.5);
					}
					}
				}else if(tipo.equalsIgnoreCase("Alcatra")) {
					System.out.println("Digite quantos KG voce quer comprar");
					double kg = sc.nextDouble();
					System.out.println("Como deseja pagar?");
					String pagamento = sc.next();
					if(kg < 5) {
						if(pagamento.equalsIgnoreCase("cartao")||pagamento.equalsIgnoreCase("cartão")) {
							System.out.printf("Nota Fiscal: \nAlcatra: %.1f\nDesconto: %.2f\nTipo de Pagamento: Cartão Tabajara\nValor a ser Pago: %.2f",kg,(kg*5.90)*0.05,(kg*5.90)-(kg*5.90)*0.05);
						}else {
							System.out.printf("Nota Fiscal: \nAlcatra: %.1f\nTipo de Pagamento: Dinheiro\nValor a ser Pago: %.2f",kg,(kg*5.90)-(kg*5.90)*0.05);
						}
					}else if(kg > 5) {
						if(pagamento.equalsIgnoreCase("cartao")||pagamento.equalsIgnoreCase("cartão")) {
							System.out.printf("Nota Fiscal: \nAlcatra: %.1f\nDesconto: %.2f\nTipo de Pagamento: Cartão Tabajara\nValor a ser Pago: %.2f",kg,(kg*6.80)*0.05,(kg*6.80)-(kg*6.80)*0.05);
						}else {
							System.out.printf("Nota Fiscal: \nAlcatra: %.1f\nTipo de Pagamento: Dinheiro\nValor a ser Pago: %.2f",kg,(kg*6.80)-(kg*6.80)*0.05);
						}
						}
					}else if(tipo.equalsIgnoreCase("Picanha")) {
						System.out.println("Digite quantos KG voce quer comprar");
						double kg = sc.nextDouble();
						System.out.println("Como deseja pagar?");
						String pagamento = sc.next();
						if(kg < 5) {
							if(pagamento.equalsIgnoreCase("cartao")||pagamento.equalsIgnoreCase("cartão")) {
								System.out.printf("Nota Fiscal: \nPicanha: %.1fKG\nDesconto: %.2f\nTipo de Pagamento: Cartão Tabajara\nValor a ser Pago: %.2f",kg,(kg*6.90)*0.05,(kg*6.90)-(kg*6.90)*0.05);
							}else {
								System.out.printf("Nota Fiscal: \nPicanha: %.1fKG\nTipo de Pagamento: Dinheiro\nValor a ser Pago: %.2f",kg,(kg*6.90)-(kg*6.90)*0.5);
							}
						}else if(kg > 5) {
							if(pagamento.equalsIgnoreCase("cartao")||pagamento.equalsIgnoreCase("cartão")) {
								System.out.printf("Nota Fiscal: \nPicanha: %.1fKG\nDesconto: %.2f\nTipo de Pagamento: Cartão Tabajara\nValor a ser Pago: %.2f",kg,(kg*7.80)*0.05,(kg*7.80)-(kg*7.80)*0.05);
							}else {
								System.out.printf("Nota Fiscal: \nPicanha: %.1fKG\nTipo de Pagamento: Dinheiro\nValor a ser Pago: %.2f",kg,(kg*7.80)-(kg*7.80)*0.5);
							}
							}
						}
		}while(pergunta == false);
	}
	}