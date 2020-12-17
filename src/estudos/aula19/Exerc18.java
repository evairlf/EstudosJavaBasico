package estudos.aula19;

import java.util.Random;

public class Exerc18 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[10];
		int valorMax = Integer.MIN_VALUE;
		int valorMin = Integer.MAX_VALUE;
		String outputMax = "";
		String outputMin = "";
		
		
		for(int i = 0;i<a.length;i++) {
			a[i] = rand.nextInt(70)+15;
			if(a[i]>valorMax) {
				valorMax = a[i];
				outputMax = "O maior valor é: "+a[i]+"\nE encontra-se na posição "+i+" do vetor A";
			}
			if(a[i]<valorMin) {
				valorMin = a[i];
				outputMin = "\nO menor valor é: "+a[i]+"\nE encontra-se na posição "+i+" do vetor A";
			}
		}
		System.out.println(outputMax+outputMin);
	}

}