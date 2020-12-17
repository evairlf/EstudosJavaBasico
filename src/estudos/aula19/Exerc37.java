package estudos.aula19;

import java.util.Scanner;

public class Exerc37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[15];
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor de A: ");
			a[i] = sc.nextInt();
			b[i] = a[i];

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "! = "+a[i]+" . ");
			for (int j = 1; j < a[i]; j++) {
				System.out.print(a[i]-j);
				b[i] *= a[i] - j;
				if(j+1<a[i]) {
					System.out.print(" . ");
				}else {
					System.out.println(" = "+b[i]);
				}
			}
			System.out.println("");
		}

	}

}