package estudos.aula19;

public class Exerc02 {

	public static void main(String[] args) {
		int[] a = new int[8];
		int[] b = new int[a.length];

		for(int i = 0;i<a.length;i++) {
			a[i]=i+1;
			b[i]=a[i]*2;
			System.out.println(a[i]+"--"+b[i]);
			
		}
	}

}
