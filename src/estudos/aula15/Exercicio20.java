package estudos.aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		System.out.println("Responda com Sim ou N�o: ");
		System.out.println("Voc� Telefonou para a vitima?");
		teste();
		System.out.println("Esteve no local do crime?");
		teste();
		System.out.println("Mora perto da vitima?");
		teste();
		System.out.println("Devia para a vitima?");
		teste();
		System.out.println("J� trabalhou com a vitima?");
		teste();
		verifica();

	}

	public static int confirm;

	public static int teste() {

		boolean sai = true;
		Scanner sc = new Scanner(System.in);

		do {

			String pergunta = sc.next();

			if (pergunta.equalsIgnoreCase("Sim") || pergunta.equalsIgnoreCase("S")) {
				confirm++;
				sai = true;
			} else if (pergunta.equalsIgnoreCase("Nao") || pergunta.equalsIgnoreCase("N")) {
				sai = true;
			} else {
				System.out.println("Digite sim ou n�o!");
				sai = false;
			}
		} while (sai == false);
		return confirm;

	}

	public static void verifica() {
		if (confirm == 2) {
			System.out.println("Obrigado, sua classifica��o no crime � de suspeita.");
		} else if (confirm == 3 || confirm == 4) {
			System.out.println("Obrigado, voc� foi classificado como c�mpli�e!");
		} else if (confirm == 5) {
			System.out.println("Obrigado, voc� � o assasino(a), ficar� preso at� que prove ao contrario!");
		} else {
			System.out.println("Obrigado pela coolabora��o, tentaremos resolver este caso o mais rapido possivel, por favor fique em prontid�o caso precisemos fazer perguntas novamente.");
		}
	}
}
