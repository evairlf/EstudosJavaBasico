package estudos.aula15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite uma letra ");
		String sexo = sc.next();
		if(sexo.equalsIgnoreCase("a")||sexo.equalsIgnoreCase("e")||sexo.equalsIgnoreCase("i")||sexo.equalsIgnoreCase("o")||
				sexo.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
		}else {
			System.out.println("Consoante");
		}
	}

	}