package estudos.aula17;

import java.util.Scanner;

public class Exer05 {
	//Exercicio 4 Refatorado
	public static void main(String[] args) {
		int ano = 0;
		boolean sai = true;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a população do PAIS1: ");
			int pais1 = sc.nextInt();
			if (pais1 < 0) {
				System.out.println("População invalida!");
				continue;
			}
			System.out.println("Digite a taxa de crescimento anual: ");
			double taxaCresc1 = sc.nextDouble()/100;
			if(taxaCresc1 < 0 || taxaCresc1 > 1) {
				System.out.println("Taxa de crescimento invalida!");
				continue;
			}
			System.out.println("Digite a população do PAIS2: ");
			int pais2 = sc.nextInt();
			if (pais2 < 0) {
				System.out.println("População invalida!");
				continue;
			}
			System.out.println("Digite a taxa de crescimento anual: ");
			double taxaCresc2 = sc.nextDouble()/100;
			if(taxaCresc2 < 0 || taxaCresc2 > 1) {
				System.out.println("Taxa de crescimento invalida!");
				continue;
			}

			for (; pais1 < pais2;) {

				pais1 += pais1 * taxaCresc1;
				pais2 += pais2 * taxaCresc2;
				ano++;
			}
			System.out.println("Sao nescessários " + ano + " Anos para que o pais1 alcance a população do pais2");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Quer Repetir a Operação?S-Sim/N-Não");
			String repetir = sc.next();
			if(repetir.charAt(0) == 'S' || repetir.charAt(0) == 's') {
				System.out.println("Repetindo...\n");
			}else {
				System.out.println("Obrigado por utilizar o nosso programa!");
				sai = false;
			}
		} while (sai == true);

	}

}
