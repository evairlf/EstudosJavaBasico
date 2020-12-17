package estudos.aula20;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int numPar = 0;
		int numImpar = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("Digite o valor da " + (i + 1) + " Linha coluna " + (j + 1) + " : ");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i][j]%2==0) {
					numPar++;
				}else {
					numImpar++;
				}
			}
		}
	System.out.println("O numero de pares é: "+numPar+"\nO numero de impares é: "+numImpar);
	}
}