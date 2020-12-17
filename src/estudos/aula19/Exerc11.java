package estudos.aula19;

import java.util.Random;

public class Exerc11 {

	public static void main(String[] args) {
		Random rand = new Random();
		int pares = 0;
		
		int[] a = new int[10];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = rand.nextInt(200);
			if(a[i]%2==0) {
				pares++;
			}
		}
		System.out.println("A quantidade de pares é: "+pares);
	}

}