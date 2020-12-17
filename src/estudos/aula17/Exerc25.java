package estudos.aula17;

import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor = 0;
		
		for(int i = 1;i>0;) {
			System.out.println("Digite o valor do produto: ");
			double produto = sc.nextDouble();
			valor += produto;
			if(produto == 0) {
				i--;
			}
		}
		System.out.printf("Total: R$%.2f\n",valor);
		System.out.println("Digite o valor entregue pelo cliente: ");
		double valorCliente = sc.nextDouble();
		double troco = valorCliente-valor;
		System.out.printf("Deve ser entregue de troco: R$%.2f",troco);
	}

}
