package estudos.aula19;

import java.util.Random;

public class Exerc27 {

	public static void main(String[] args) {
		Random rand = new Random();

		int[] a = new int[10];
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(50);
			b[i] = rand.nextInt(50);
			if (a[i] < 7) {
				b[i] = 'a';
			}else if (a[i] == 7) {
				b[i] = 'b';
			}else if(a[i] == 10) {
				b[i] = 'd';
			}else if (a[i] > 7 && a[i]<10) {
				b[i] = 'c';
			}else if(a[i]>10) {
				b[i] = 'e';
			}
			System.out.print(a[i]+"--");
			System.out.println((char)b[i]);
		}

	}
}