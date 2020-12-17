package estudos.aula19;

public class Exerc8 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = i+3;
			b[i] = a[i]*3;
			c[i] = a[i]*b[i];
			System.out.println(a[i]+" X "+b[i]+" = "+c[i]);
			
		}

	}

}
