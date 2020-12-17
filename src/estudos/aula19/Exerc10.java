package estudos.aula19;

import java.text.DecimalFormat;
import java.util.Random;

public class Exerc10 {

	public static void main(String[] args) {
		DecimalFormat dec = new DecimalFormat("##.##");
		Random rand = new Random();
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for(int i = 0; i<a.length;i++) {
			a[i] = rand.nextInt(17);
			b[i] = a[i]%2;
			System.out.println(a[i]+" % 2 = "+b[i]);
		}

	}

}
