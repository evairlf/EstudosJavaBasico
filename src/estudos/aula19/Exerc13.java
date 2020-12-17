package estudos.aula19;

import java.util.Random;

public class Exerc13 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[10];
		int soma = 0;
		
		for(int i = 0;i<a.length;i++) {
			a[i] = rand.nextInt(1000);
			if(a[i]%5==0) {
				soma += a[i];
			}
		}
		System.out.println("A soma dos multiplos de 5 é: "+soma);
	}

}
