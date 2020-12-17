package estudos.aula19;

import java.util.Random;

public class Exerc17 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[10];
		int qtd = 0;
		
		for(int i = 0;i<a.length;i++) {
			a[i] = rand.nextInt(35)+25;
			System.out.println(a[i]);
			if(a[i]>35) {
				qtd++;
			}
		}
		System.out.println("A idade de pessoas com mais de 35 anos é: "+qtd);
	}

}
