package estudos.aula15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean teste = false;
		
		do {
		System.out.println("Digite o dia da semana 1-7: ");
		int escolha = sc.nextInt();
		switch(escolha) {
		case 1: System.out.println("Hoje � domingo!");break;
		case 2: System.out.println("Hoje � segunda!");break;
		case 3:System.out.println("Hoje � ter�a!");break;
		case 4:System.out.println("Hoje � quarta!");break;
		case 5:System.out.println("Hoje � quinta!");break;
		case 6:System.out.println("Hoje � sexta!");break;
		case 7:System.out.println("Hoje � s�bado!");break;
		default: System.out.println("Dia inv�lido!");continue;
		}
		teste = true;
		}while(teste == false);
	}

}
