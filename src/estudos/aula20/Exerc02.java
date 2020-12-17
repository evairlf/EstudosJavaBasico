package estudos.aula20;

import java.util.Random;

public class Exerc02 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[][] a = new int[10][10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		String output = "";
		String outputo = "";
		String output1 = "";
		String outputo1 = "";

		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "º");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rd.nextInt(10);
				System.out.print("--" + a[i][j]);
			}
			System.out.println("");
		}
		
		for (int i = 4; i < 5; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maior) {
					maior = a[i][j];
					output = "O maior valor da linha " + (i + 1) + " é:" + maior;
				}
				if (a[i][j] < menor) {
					menor = a[i][j];
					outputo = "O menor valor da linha " + (i + 1) + " é:" + menor;
				}
			}
			System.out.println(outputo + "\n" + output);
		}
		maior = Integer.MIN_VALUE;
		menor = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			
			for (int j = 6; j < 7; j++) {
				if (a[i][j] > maior) {
					maior = a[i][j];
					output1 = "O maior valor da coluna " +(j+1)+ " é:" + maior+"\n";
				}
				if (a[i][j] < menor) {
					menor = a[i][j];
					outputo1 = "O maior valor da coluna " +(j+1)+ " é:" + menor;
				}
				
			}
		}	
		System.out.println(output1+outputo1);
	}
}