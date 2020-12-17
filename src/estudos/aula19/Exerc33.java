package estudos.aula19;

import java.util.Random;

public class Exerc33 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] a = new int[10];
		boolean primo;

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(50)+2;
			primo = true;
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j ==0) {
					primo = false;
					break;
				}
				
			}
			String msg ="";
			if(primo) {
				msg = " primo";
			}else {
				msg = " não é primo";
			}
			System.out.println(a[i]+msg);
		}

	}
}