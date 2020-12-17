package estudos.aula17;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota = 11;
		
		do {
			
		System.out.println("Digite uma nota entre 0-10: ");
		nota = sc.nextInt();
		if(nota < 0 || nota >10) {
			System.out.println("Valor invalido!");
		}else {
			System.out.println("Obrigado por inserir a nota: "+nota);
		}
		}while(nota < 0 || nota >10);
		
	}

}
