package estudos.dev_media;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		try {
			if (Character.isDigit(a.charAt(0)) == true) {
				throw new Exception("BUGO AQUI Ô");
			}
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		}

	}
}