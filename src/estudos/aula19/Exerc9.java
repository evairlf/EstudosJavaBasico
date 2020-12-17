package estudos.aula19;

import java.text.DecimalFormat;
import java.util.Random;

public class Exerc9 {

	public static void main(String[] args) {
		DecimalFormat dec = new DecimalFormat("##.##");
		Random rand = new Random();
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		double[] c = new double[a.length];
		
		for(int i = 0;i<a.length;i++) {
			
			a[i] = i+rand.nextInt(17)*3;
			b[i] = i+rand.nextInt(17);
			c[i] = (double)a[i]/b[i];
			System.out.println(a[i]+" / "+b[i]+" = "+dec.format(c[i]));
		}

	}

}
