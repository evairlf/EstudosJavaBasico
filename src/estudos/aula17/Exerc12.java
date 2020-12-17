package estudos.aula17;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean sair = false;
		do {
			System.out.println("Digite o numero da tabuada que quer: ");
			int tabuada = sc.nextInt();
			System.out.println("Tabuada de "+tabuada);
			int resultado;
			if(tabuada <0 || tabuada > 10) {
				System.out.println("Valor invalido!");
				continue;
			}
			for(int i = 1;i<=10;i++) {
				resultado = tabuada*i;
				System.out.println(i+" X "+tabuada+" = "+resultado);
			}
			sair = true;
		}while(sair==false);
		
	}

}
