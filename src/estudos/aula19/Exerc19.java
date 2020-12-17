package estudos.aula19;

import java.util.Random;

public class Exerc19 {

	public static void main(String[] args) {
		Random rand = new Random();
		String[] a = new String[10];
		int[][] notas = new int[10][2];
		int[] result = new int[a.length];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = "Aluno "+(i+1);
			for(int j =0;j<notas[i].length;j++) {
				notas[i][j]= rand.nextInt(10);
			}
			
		}
		for(int i = 0;i<a.length;i++) {
			result[i] = (notas[i][0]+notas[i][1])/2;
			if(result[i]<7) {
			System.out.println(a[i]+"\nMédia: "+result[i]+" \nReprovado!");
			System.out.println("------------");
		}else {
			System.out.println(a[i]+"\nMédia : "+result[i]+" \nAprovado!");
			System.out.println("------------");
		}
			}
	}
}