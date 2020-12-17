package estudos.aula19;

import java.text.DecimalFormat;

public class Exerc20 {

	public static void main(String[] args) {
		DecimalFormat dec = new DecimalFormat("##.##");
		double[] a = new double[20];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = 5.07 * (i+1);
			System.out.println((i+1)+"º Valor : "+"R$"+dec.format(a[i]));
		}
	}

}
