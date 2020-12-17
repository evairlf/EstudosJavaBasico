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
		case 1: System.out.println("Hoje é domingo!");break;
		case 2: System.out.println("Hoje é segunda!");break;
		case 3:System.out.println("Hoje é terça!");break;
		case 4:System.out.println("Hoje é quarta!");break;
		case 5:System.out.println("Hoje é quinta!");break;
		case 6:System.out.println("Hoje é sexta!");break;
		case 7:System.out.println("Hoje é sábado!");break;
		default: System.out.println("Dia inválido!");continue;
		}
		teste = true;
		}while(teste == false);
	}

}
