package estudos.aula20;

import java.util.Random;

public class Exerc01 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[][] a = new int[4][4];
		int maior = Integer.MIN_VALUE;
		String output = "";
		
		for(int i = 0;i<a.length;i++) {
			System.out.print((i+1)+"º");
			for(int j = 0;j<a[i].length;j++) {
				a[i][j] = rd.nextInt(9);
				System.out.print("--"+a[i][j]);
			}
			System.out.println("");
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				if(a[i][j]>maior) {
					maior = a[i][j];
					output = "O maior valor é: "+maior+" e se encontra na "+(i+1)+"º Linha e na "+(j+1)+"º Coluna da matriz!";
				}
			}
		}
		System.out.println(output);
	}

}