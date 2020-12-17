package estudos.aula19;

import java.util.Random;

public class Exerc15 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[10];
		int par = 0;
		int impar = 0;
		
		
		for(int i = 0;i<a.length;i++) {
			a[i] = rand.nextInt(100);
			if(a[i]%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("A porcentagem é: "+par*10+"% e "+impar*10+"%");
	}

}