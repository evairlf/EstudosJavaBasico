package estudos.aula17;

import java.util.Scanner;

public class Exerc30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a tabuada a ser aplicada: ");
		int tabuada = sc.nextInt();
		System.out.println("Digite o inicio e o fim da tabuada: ");
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		System.out.println("Começar por: \n"+inicio);
		System.out.println("Terminar em: \n"+fim);
		int resultado;
		
		for(int i = inicio;i<=fim;i++) {
			resultado = tabuada*i;
			System.out.println(tabuada+" X "+i+" = "+resultado);
		}
		

	}

}
