package estudos.dev_media;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		try {
			if(a.equals("b")) {
				throw new Exception("A nao pode ser igual B");
			}
			
		}catch(Exception exc){
			System.out.println(exc.getMessage());
		}
	}
}