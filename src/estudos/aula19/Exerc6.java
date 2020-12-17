package estudos.aula19;

public class Exerc6 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for(int i = 1;i<a.length;i++) {
			a[i]=i+3;
			b[i]=a[i]+1;
			c[i]=a[i]+b[i];
			System.out.println(a[i]+" + "+b[i]+" = "+c[i]);
		}

	}

}
