package estudos.aula17;

import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do p�o: ");
		double pao = sc.nextDouble();
		
		System.out.println("Panificadora p�o de Ontem - Tabela de pre�os: ");
		for(int i = 1;i<=50;i++) {
			System.out.printf("%d- R$ %.2f\n",i,(pao*i));
		}
		

	}

}
