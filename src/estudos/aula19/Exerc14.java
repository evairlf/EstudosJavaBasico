package estudos.aula19;

import java.util.Random;

public class Exerc14 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[10];
		int soma = 0;
		
		for(int i = 0;i<a.length;i++) {
			a[i] = rand.nextInt(100);
			if(a[i]%2==1) {
			soma += a[i];
			}
		}
		System.out.println("A média aritimética é : "+soma/10);
	}

}