package estudos.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o sexo: ");
		char sexo = sc.next().charAt(0);
		
		if(sexo== 'F' || sexo=='f' ) {
			System.out.println("Feminino!");
	}else if(sexo == 'M' || sexo== 'M') {
		System.out.println("Masculino!");
	}else {
		System.out.println("Pablo vittar?");
	}
	}
}