package estudos.aula36;

import java.util.Scanner;

public class CuzinhoDePombo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] cu = new String[3][2];

		for (int i = 0; i < cu.length; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println("Digite a "+(i+1)+"º Matéria:");
				cu[i][j] = sc.nextLine();
				for (int k = 1; k < 2; k++) {
					System.out.println("Digite a nota: ");
					cu[i][k] = (String)sc.nextLine();
				}
			}
		}

		for (int i = 0; i < cu.length; i++) {
			System.out.println();
			for (int j = 0; j < cu[i].length; j++) {
				System.out.print(cu[i][j] + "|");
			}

		}
		
	}

}
