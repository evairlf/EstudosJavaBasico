package estudos.aula17;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas notas deseja inserir");
		int numNotas = sc.nextInt();
		double[] notas = new double[numNotas];
		double media = 0;
		double resultado;
		
		//Com Array
		for(int i = 0;i<notas.length;i++) {	
		System.out.println("Digite a "+(i+1)+"º Nota: ");
		notas[i] = sc.nextDouble();
		media = media + notas[i];
		}
		
		resultado = media/notas.length;
		System.out.printf("Resultado da Média: %.2f",resultado);
		
		//Sem Array
		for(int i = 0; i < numNotas;i++) {
			System.out.print("Digite a "+(i+1)+"º Nota: ");
			media += sc.nextDouble();
		}
		resultado = media/numNotas;
		System.out.printf("Resultado da Média: %.2f",resultado);
	}
}
