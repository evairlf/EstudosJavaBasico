package estudos.aula19;

import java.util.Random;

public class Exerc34 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(10) + 20;
			for (int j = 0; j < a[i]; j++) {
				if (j % 2 == 0) {
					System.out.print(j + "-");
				}
			}
			System.out.println("");
		}

	}

}
