package estudos.aula19;

public class Exerc7 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for(int i = 1;i<a.length;i++) {
			a[i] = i*2;
			b[i] = a[i]*i;
			c[i] = b[i]-a[i];
			System.out.println(b[i]+"-"+a[i]+"="+c[i]);
		}

	}

}
