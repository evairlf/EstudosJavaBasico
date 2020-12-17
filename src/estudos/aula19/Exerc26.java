package estudos.aula19;

import java.util.Random;

public class Exerc26 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = rand.nextInt(50);
			b[i] = rand.nextInt(50);
			if(a[i]==b[i]) {
				c[i] = 0;
			}else if(b[i]>a[i]) {
				c[i] = -1;
			}else if(a[i]>b[i]) {
				c[i] = 1;
			}
		System.out.println(c[i]);	
		}
		

	}

}
