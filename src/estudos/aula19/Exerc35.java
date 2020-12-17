package estudos.aula19;

import java.util.Random;

public class Exerc35 {

	public static void main(String[] args) {
			Random rd = new Random();
			int[] a = new int[10];
			

			for (int i = 0; i < a.length; i++) {
				a[i] = rd.nextInt(10) + 20;
				System.out.print(a[i]+"=> Divisores= ");
				for (int j = 1; j <= a[i]; j++) {
					if (a[i] % j == 0) {
						System.out.print(j);
						if(j<a[i]) {
							System.out.print("-");
						}
					}
				}
				System.out.print(" Posição "+(i+1)+"º");
				System.out.println("");
			}

		}

	}