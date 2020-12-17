package estudos.aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		System.out.println("Responda com Sim ou Não: ");
		System.out.println("Você Telefonou para a vitima?");
		teste();
		System.out.println("Esteve no local do crime?");
		teste();
		System.out.println("Mora perto da vitima?");
		teste();
		System.out.println("Devia para a vitima?");
		teste();
		System.out.println("Já trabalhou com a vitima?");
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
				System.out.println("Digite sim ou não!");
				sai = false;
			}
		} while (sai == false);
		return confirm;

	}

	public static void verifica() {
		if (confirm == 2) {
			System.out.println("Obrigado, sua classificação no crime é de suspeita.");
		} else if (confirm == 3 || confirm == 4) {
			System.out.println("Obrigado, você foi classificado como cúmpliçe!");
		} else if (confirm == 5) {
			System.out.println("Obrigado, você é o assasino(a), ficará preso até que prove ao contrario!");
		} else {
			System.out.println("Obrigado pela coolaboração, tentaremos resolver este caso o mais rapido possivel, por favor fique em prontidão caso precisemos fazer perguntas novamente.");
		}
	}
}
