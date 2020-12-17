package estudos.aula19;

import java.util.Random;

public class Exerc16 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[10];
		int somaMenor = 0;
		int quantIgual = 0;
		int somaMaior = 0;
		int quant = 0;
		
		for(int i = 0;i<a.length;i++) {
			a[i] = rand.nextInt(45);
			if(a[i]<15) {
				somaMenor +=a[i];
			}else if(a[i]==15) {
				quantIgual++;
			}else {
				somaMaior += a[i];
				quant++;
			}
		}
		System.out.println("A)A soma de elementos armazenados no vetor menor que 15 é: "+somaMenor);
		System.out.println("B)A quantidade de elementos armazenados no vetor que sao iguais a 15 é: "+quantIgual);
		System.out.println("C)A media dos elementos armazenados no vetor que sao superiores a 15: "+somaMaior/quant);
	}

}
