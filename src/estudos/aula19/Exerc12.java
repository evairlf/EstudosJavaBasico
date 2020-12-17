package estudos.aula19;

import java.util.Random;

public class Exerc12 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[10];
		int soma = 0;
		
		for(int i = 0;i<a.length;i++) {
			a[i] = rand.nextInt(200);
			soma +=a[i];
		}
		System.out.println("A Soma total dos itens no vetor é: "+soma);
	}

}
